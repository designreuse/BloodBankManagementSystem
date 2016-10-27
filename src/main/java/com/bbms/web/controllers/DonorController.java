package com.bbms.web.controllers;

import com.bbms.web.models.donor.CombinedCommandObject;
import com.bbms.web.models.donor.DonorPreviousDonationHistory;
import com.bbms.web.services.DonorService;
import com.bbms.web.validators.CombinedCommandObjectValidator;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/admin/donor")
public class DonorController {

    @Autowired
    private CombinedCommandObjectValidator combinedCommandObjectValidator;

    @Autowired
    private DonorService donorService;

    @InitBinder
    public void bindDate(WebDataBinder binder) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "donorPreviousDonationHistory.donationDate", new CustomDateEditor(format, true));
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("donors", donorService.findAll());
        model.addAttribute("title", "Blood Bank : Donor List");
        return "donor/index";
    }

    @RequestMapping(value = "/add-new-donor", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute(new CombinedCommandObject());
        model.addAttribute("title", "Blood Bank : New Donor");
        return "donor/create";
    }

    @RequestMapping(value = "/add-new-donor", method = RequestMethod.POST)
    public String save(Model model, @Valid CombinedCommandObject combinedCommandObject, BindingResult result,
            RedirectAttributes redirectAttributes) {
        combinedCommandObjectValidator.validate(combinedCommandObject, result);
        if (result.hasErrors()) {
            model.addAttribute("title", "Blood Bank : New Donor");
            return "donor/create";
        }
        donorService.saveDonor(combinedCommandObject);
        return "redirect:/admin/donor/";
    }

    @RequestMapping(value = "/show/{donorId}", method = RequestMethod.GET)
    public String show(Model model, @PathVariable("donorId") Integer donorId) {
        model.addAttribute("title", "Show Donor");
        DonorPreviousDonationHistory ds = donorService.findDonorById(donorId).getDonorPreviousDonationHistory();
        
       // Calendar  c = Calendar.getInstance();
       // c.setTime(ds.getDonationDate());
       // long tInms = c.getTimeInMillis();
        
        
        model.addAttribute("donor", donorService.findDonorById(donorId));
       // model.addAttribute("time", tInms);
        //model.addAttribute("time", "Hello Time");
        return "donor/show";
    }

    @RequestMapping(value = "/edit/{donorId}", method = RequestMethod.GET)
    public String edit(Model model, @PathVariable("donorId") Integer donorId) {
        model.addAttribute("title", "Show Donor");
        model.addAttribute("combinedCommandObject", donorService.findCombinedCommandObjectByDonorId(donorId));
        return "donor/edit";
    }

}
