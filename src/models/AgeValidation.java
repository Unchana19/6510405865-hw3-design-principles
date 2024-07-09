package models;

public class AgeValidation implements ValidationInterface{
    @Override
    public void validation(User user) {
        if(user.getAge() < 20) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
    }
}

//6510405865 Oanchana Changcharoen
