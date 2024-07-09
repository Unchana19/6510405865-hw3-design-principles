package models;

public class NameFormatValidation implements ValidationInterface {
    @Override
    public void validation(User user) {
        if (!user.getName().matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }
    }
}

//6510405865 Oanchana Changcharoen
