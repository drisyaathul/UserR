package com.userregistrationproblem;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validFirstName(String firstName) {

        return Pattern.matches("^[A-Z][a-z]{2,}",firstName);
    }
}
