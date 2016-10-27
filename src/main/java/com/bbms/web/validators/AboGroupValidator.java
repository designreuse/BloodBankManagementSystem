package com.bbms.web.validators;

import com.bbms.web.models.AboGroup;
import com.bbms.web.services.AboGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class AboGroupValidator implements Validator {

    @Autowired
    private AboGroupService aboGroupService;

    @Override
    public boolean supports(Class<?> clazz) {
        return AboGroup.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donor", "NotEmpty.collectBlood");
    }

    public boolean isUniqueDonor(String donorId, Errors errors) {
        boolean result = aboGroupService.isUniqueDonor(donorId);
        if (!result) {
            errors.rejectValue("donorId", "uniqueAboGroupForDonor");
        }
        return result;
    }
}
