package com.bbms.web.controllers;

import com.bbms.web.models.AboGroup;
import com.bbms.web.models.donor.DonorPersonalInformation;
import com.bbms.web.services.AboGroupService;
import com.bbms.web.services.DonorService;
import com.bbms.web.validators.AboGroupValidator;
import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import net.sf.jasperreports.engine.JREmptyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsXlsView;

@Controller
@RequestMapping(value = "/admin/donor/abo-grouping")
public class ABOGroupingController {

    @Autowired
    private DonorService donorService;
    @Autowired
    private AboGroupService aboGroupService;  
    @Autowired
    private AboGroupValidator aboGroupValidator;
    
    @Autowired
    @Qualifier("donorGroupRegisterPdfReport")
    private JasperReportsPdfView donorGroupRegisterPdfReport;
    @Autowired
    @Qualifier("donorGroupRegisterExcellReport")
    private JasperReportsXlsView donorGroupRegisterExcellReport;
    
    
    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        //SimpleDateFormat format = new SimpleDateFormat("mm/dd/yyyy");
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "aboGroupingDate", new CustomDateEditor(format, true));
        binder.registerCustomEditor(DonorPersonalInformation.class, "donor", new DonorEditor());
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("aboGroups", aboGroupService.findAll());
        model.addAttribute("title", "Blood Bank : ABO Grouping");
        return "aboGroupinng/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("title", "Blood Bank : Donor Grouping");
        AboGroup aboGroup = new AboGroup();
        aboGroup.setSampleNumber(aboGroupService.generateSampleNumber());
        model.addAttribute(aboGroup);
        model.addAttribute("donors", donorService.findAll());
        return "aboGroupinng/create";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(Model model, @Valid AboGroup aboGroup, BindingResult result, 
            RedirectAttributes redirectAttributes) {

        aboGroupValidator.validate(aboGroup, result);
        aboGroupValidator.isUniqueDonor(aboGroup.getDonor().getDonorId(), result);
        if (result.hasErrors()) {
            model.addAttribute("title", "Blood Bank : Donor Grouping");
            model.addAttribute("donors", donorService.findAll());
            return "aboGroupinng/create";
        }
        aboGroupService.saveAboGroup(aboGroup);
        redirectAttributes.addFlashAttribute("message", "ABO group added.");
        return "redirect:/admin/donor/abo-grouping/";
    }

    
    // Reporting section starts here.......
    @RequestMapping(value = "/pdf", method = RequestMethod.GET)
    public ModelAndView generateDonorGroupRegisterPdfReport(ModelMap modelMap, ModelAndView modelAndView) {
        modelMap.put("datasource", new JREmptyDataSource());
        modelAndView = new ModelAndView(donorGroupRegisterPdfReport, modelMap);
        return modelAndView;
    }
    
    @RequestMapping(value = "/excell", method = RequestMethod.GET)
    public ModelAndView generateDonorGroupRegisterExcellReport(ModelMap modelMap, ModelAndView modelAndView, 
            HttpServletResponse response) {
        modelMap.put("datasource", new JREmptyDataSource());
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        modelAndView = new ModelAndView(donorGroupRegisterExcellReport, modelMap);
        return modelAndView;
    }
    
    @RequestMapping(value = "/csv", method = RequestMethod.GET)
    public ModelAndView generateDonorGroupRegisterCSVReport(ModelMap modelMap, ModelAndView modelAndView) {
        modelMap.put("datasource", new JREmptyDataSource());
        modelAndView = new ModelAndView(donorGroupRegisterPdfReport, modelMap);
        return modelAndView;
    }
    // Reporting section ends here.......
    
    
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public @ResponseBody
    List<DonorPersonalInformation> searchInDonors() {
        System.err.println("Hello Ajax Call");
        return donorService.findAll();
    }

    private class DonorEditor extends PropertyEditorSupport {

        @Override
        public void setAsText(String text) {
            if (text != null && !text.isEmpty()) {
                DonorPersonalInformation donorPersonalInformation = (DonorPersonalInformation) donorService.findDonorByDonorGeneratedId(text);
                setValue(donorPersonalInformation);
            }
        }

        @Override
        public String getAsText() {
            try {
                DonorPersonalInformation donorPersonalInformation = (DonorPersonalInformation) getValue();
                return donorPersonalInformation.getDonorId();
            } catch (Exception exception) {
            }
            return null;
        }
    }

}
