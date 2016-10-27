package com.bbms.web.controllers;

import com.bbms.web.models.BloodBag;
import com.bbms.web.models.donor.DonorPersonalInformation;
import com.bbms.web.services.BloodBagService;
import com.bbms.web.services.DonorService;
import com.bbms.web.validators.BloodBagValidator;
import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/admin/blood-bag")
public class BloodBagController {

    @Autowired
    private DonorService donorService;

    @Autowired
    private BloodBagValidator bloodBagValidator;

    @Autowired
    private BloodBagService bloodBagService;

    private BloodBag bloodBag;

    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "collectionDate", new CustomDateEditor(format, true));
        binder.registerCustomEditor(DonorPersonalInformation.class, "donor", new BloodBagController.DonorEditor());
    }

    @RequestMapping(value = "/stock", method = RequestMethod.GET)
    public String bloodBagStock(Model model) {

        model.addAttribute("title", "Blood Bank : Bag Stock");
        model.addAttribute("bloodBags", bloodBagService.findAll());
        return "bloodBag/stock";
    }

    @RequestMapping(value = "/collect-blood", method = RequestMethod.GET)
    public String collectBlood(Model model) {
        bloodBag = new BloodBag();
        bloodBag.setBloodBagId(bloodBagService.generateBloodBagNumber());
        model.addAttribute(bloodBag);
        model.addAttribute("donors", donorService.findAll());
        model.addAttribute("title", "Blood Bank : Collect Blood");
        return "bloodBag/collectBlood";
    }

    @RequestMapping(value = "/collect-blood", method = RequestMethod.POST)
    public String saveBloodBag(Model model, @Valid BloodBag bloodBag, BindingResult result,
            RedirectAttributes redirectAttributes) {
        
        bloodBagValidator.isElegibleForDonation(bloodBag.getDonor().getDonorId() ,bloodBag.getCollectionDate(), result);
        bloodBagValidator.validate(bloodBag, result);
        if (result.hasErrors()) {
            model.addAttribute("donors", donorService.findAll());
            model.addAttribute("title", "Blood Bank : Collect Blood");
            return "bloodBag/collectBlood";
        }
        bloodBagService.saveBloodBag(bloodBag);
        redirectAttributes.addFlashAttribute("message", "Blood bag saved.");
        return "redirect:/admin/blood-bag/stock";
    }

    @RequestMapping(value = "/edit/{bloodBagId}", method = RequestMethod.GET)
    public String editBloodBagInfo(Model model, @PathVariable("bloodBagId") Integer bloodBagId) {
        bloodBag = bloodBagService.findBloodBagById(bloodBagId);;
        model.addAttribute(bloodBag);
        model.addAttribute("donors", donorService.findAll());
        model.addAttribute("title", "Blood Bank : Edit Blood Info");
        return "bloodBag/edit";
    }

    @RequestMapping(value = "/edit/{bloodBagId}", method = RequestMethod.POST)
    public String updateBloodBagInfo(Model model, @PathVariable("bloodBagId") Integer bloodBagId,
            @Valid BloodBag bloodBag, BindingResult result, RedirectAttributes redirectAttributes) {

        bloodBagValidator.validate(bloodBag, result);
        if (result.hasErrors()) {
            model.addAttribute("donors", donorService.findAll());
            model.addAttribute("title", "Blood Bank : Edit Blood Info");
            return "bloodBag/edit";
        }
        bloodBagService.updateBloogBagInformationById(bloodBagId, bloodBag);
        redirectAttributes.addFlashAttribute("message", "Blood bag information updated.");
        return "redirect:/admin/blood-bag/stock";
    }

    @RequestMapping(value = "/delete/{bloodBagId}", method = RequestMethod.GET)
    public String deleteCountryById(Model model, @PathVariable("bloodBagId") Integer bloodBagId,
            RedirectAttributes redirectAttributes) {
        bloodBagService.deleteBloodBagById(bloodBagId);
        redirectAttributes.addFlashAttribute("message", "Blood bag information updated.");
        return "redirect:/admin/blood-bag/stock";
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
