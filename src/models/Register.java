package models;

import java.util.ArrayList;

public class Register {
    private final ArrayList<ValidationInterface> validations;

    public Register() {
        validations = new ArrayList<>();
        validations.add(new IsEmptyValidation());
        validations.add(new NameFormatValidation());
        validations.add(new EmailFormatValidation());
        validations.add(new AgeValidation());
    }

    public boolean register(User user) {
        for(ValidationInterface validation: validations) {
            validation.validation(user);
        }
        return true;
    }
}

//6510405865 Oanchana Changcharoen
