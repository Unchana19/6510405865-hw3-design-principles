package models;

public class IsEmptyValidation implements ValidationInterface{

    @Override
    public void validation(User user) {
        isStringEmpty(user.getName(), "Name should not empty");
        isStringEmpty(user.getEmail(), "Email should not empty");
    }

    private void isStringEmpty(String s, String error) {
        if (s == null || s.trim().isEmpty()) {
            throw new IllegalArgumentException(error);
        }
    }
}

//6510405865 Oanchana Changcharoen
