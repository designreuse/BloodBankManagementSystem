package com.bbms.web.validators;

import com.bbms.web.models.donor.CombinedCommandObject;
import com.bbms.web.models.donor.DonorPersonalInformation;
import com.bbms.web.models.donor.DonorPreviousDonationHistory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class CombinedCommandObjectValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return CombinedCommandObject.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        CombinedCommandObject combinedCommandObject = (CombinedCommandObject) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donorPersonalInformation.fullName", "NotEmpty.donorPersonalInformation.fullName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donorPersonalInformation.age", "NotEmpty.donorPersonalInformation.age");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donorPersonalInformation.sex", "NotEmpty.donorPersonalInformation.sex");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donorPersonalInformation.mobileNumber", "NotEmpty.donorPersonalInformation.mobileNumber");

        DonorPersonalInformation donorPersonalInformation = combinedCommandObject.getDonorPersonalInformation();
        if (donorPersonalInformation.getAge() != null) {
            try {
                Integer age = Integer.parseInt(donorPersonalInformation.getAge());
                if (age < 18) {
                    errors.rejectValue("donorPersonalInformation.age", "donorPersonalInformation.underaged");
                }
            } catch (Exception ex) {
                errors.rejectValue("donorPersonalInformation.age", "donorPersonalInformation.invalidAge");
            }
        }

        DonorPreviousDonationHistory donorPreviousDonationHistory = combinedCommandObject.getDonorPreviousDonationHistory();
        if (donorPreviousDonationHistory.getDonationStatus().equals("Yes")) {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donorPreviousDonationHistory.donationDate", "NotEmpty.donorPreviousDonationHistory.donationDate");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "donorTypeAndConsent.donorType", "NotEmpty.donorTypeAndConsent.donorType");
    }

}
