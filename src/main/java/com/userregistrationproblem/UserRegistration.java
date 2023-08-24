package com.userregistrationproblem;

import java.util.regex.Pattern;

public class UserRegistration {
    public static ValidateFirstName validFirstName = (String firstName) -> {

        try {
            if (Pattern.matches("^[A-Z][a-z]{2,}",firstName)) {
                return true;
            } else {
                throw new InvalidUserDetailsException("Invalid First Name",InvalidUserDetailsException.ExpectedType.FIRSTNAME);
            }
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public static ValidateLastName validLastName = (String lastName) -> {
        try {
            if (Pattern.matches("^[A-Z][a-z]{2,}",lastName)) {
                return true;
            } else {
                throw new InvalidUserDetailsException("Invalid Last Name",InvalidUserDetailsException.ExpectedType.LASTNAME);
            }
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public static ValidateEmailId validEmailId = (String emailId) -> {
        try {
            if (Pattern.matches("^[a-z.@]{3,}",emailId)) {
                return true;
            } else {
                throw new InvalidUserDetailsException("Invalid Email-Id",InvalidUserDetailsException.ExpectedType.EMAIL);
            }
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public static ValidateMobileNumber validMobileFormat = (String mobileFormat) -> {
        try {
            if (Pattern.matches("^[0-9]{2}\\s[0-9]{10}",mobileFormat)) {
                return true;
            } else {
                throw new InvalidUserDetailsException("Invalid Mobile Number",InvalidUserDetailsException.ExpectedType.MOBILE_NUMBER);
            }
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public static ValidatePasswordFormat validPassword = (String password) -> {
        try {
            if (Pattern.matches("^[A-Za-z0-9@]{8,}",password)) {
                return true;
            } else {
                throw new InvalidUserDetailsException("Invalid Password",InvalidUserDetailsException.ExpectedType.PASSWORD);
            }
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public boolean validEmail(String emailId) {
        return Pattern.matches("^[a-z0-9].{3,}",emailId);
    }
}
