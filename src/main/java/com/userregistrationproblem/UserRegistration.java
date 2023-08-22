package com.userregistrationproblem;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validFirstName(String firstName) {

        return Pattern.matches("^[A-Z][a-z]{2,}",firstName);
    }

    public boolean validLastName(String lastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}",lastName);
    }

    public boolean validEmailId(String emailId) {
        return Pattern.matches("^[a-z.@]{3,}",emailId);
    }

    public boolean validMobileFormat(String mobileFormat) {
        return Pattern.matches("^[0-9]{2}\\s[0-9]{10}",mobileFormat);
    }

    public boolean validPassword(String password) {
        return Pattern.matches("^[A-Za-z0-9]{8,}",password);
    }
}
