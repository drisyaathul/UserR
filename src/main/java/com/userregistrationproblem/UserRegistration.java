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
}
