package com.userregistrationproblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();
    @Test
    void givenFirstNameReturnTrue() {
        boolean actualFirstName = userRegistration.validFirstName("Drisya");
        Assertions.assertTrue(actualFirstName);
        System.out.println("Valid First Name");
    }
    @Test
    void givenLastNameReturnTrue() {
        boolean actualLastname = userRegistration.validLastName("Athul");
        Assertions.assertTrue(actualLastname);
        System.out.println("Valid Last Name");
    }
    @Test
    void givenEmailIdReturnTrue() {
        boolean actualEmailId = userRegistration.validEmailId("abc.xyz@bl.co.in");
        Assertions.assertTrue(actualEmailId);
        System.out.println("Valid Email-Id");
    }
    @Test
    void givenMobileFormatReturnTrue() {
        boolean actualMobileFormat = userRegistration.validMobileFormat("91 9913988201");
        Assertions.assertTrue(actualMobileFormat);
        System.out.println("Valid mobile Number");
    }
    @Test
    void givenPassword1ReturnTrue() {
        boolean actualPasswordFormat = userRegistration.validPassowrd("password");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password- Rule1");
    }
}
