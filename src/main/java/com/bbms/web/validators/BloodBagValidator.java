package com.bbms.web.validators;

import com.bbms.web.models.BloodBag;
import com.bbms.web.services.BloodBagService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class BloodBagValidator implements Validator {

    @Autowired
    private BloodBagService bloodBagService;

    @Override
    public boolean supports(Class<?> clazz) {
        return BloodBag.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donor", "NotEmpty.collectBlood");
    }

    public boolean isElegibleForDonation(String donorId, Date collectionDate, Errors errors) {
        if (!bloodBagService.isEligibleForDonation(donorId, collectionDate)) {
            errors.rejectValue("donor", "availabilityOfDonor");
            // No use of this return type
            return false;
        } else {
            // No use of this return type
            return true;
        }
    }
}
