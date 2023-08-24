package com.userregistrationproblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();
    @Test
    void givenFirstNameHappyTest() throws InvalidUserDetailsException {
        boolean actualFirstName = UserRegistration.validFirstName.validFirstName("Drisya");
        Assertions.assertTrue(actualFirstName);
        System.out.println("Valid FirstName");
    }
    @Test
    void givenLastNameHappyTest() throws InvalidUserDetailsException{
        boolean actualLastname = UserRegistration.validLastName.ValidateLastName("Athul");
        Assertions.assertTrue(actualLastname);
        System.out.println("Valid LastName");
    }
    @Test
    void givenEmailIdHappyTest() throws InvalidUserDetailsException{
        boolean actualEmailId = UserRegistration.validEmailId.validateEmailId("abc.xyz@bl.co.in");
        Assertions.assertTrue(actualEmailId);
        System.out.println("Valid Email-Id");
    }
    @Test
    void givenMobileFormatHappyTest() throws InvalidUserDetailsException{
        boolean actualMobileFormat = UserRegistration.validMobileFormat.ValidateMobileNumber("91 9913988201");
        Assertions.assertTrue(actualMobileFormat);
        System.out.println("Valid mobile Number");
    }
    @Test
    void givenPassword1ReturnTrue() throws InvalidUserDetailsException{
        boolean actualPasswordFormat = UserRegistration.validPassword.ValidatePasswordFormat("password");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password- Rule1");
    }
    @Test
    void givenPassword2ReturnTrue() throws InvalidUserDetailsException {
        boolean actualPasswordFormat = UserRegistration.validPassword.ValidatePasswordFormat("PassWord");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password- Rule2");
    }
    @Test
    void givenPassword3ReturnTrue() throws InvalidUserDetailsException{
        boolean actualPasswordFormat = UserRegistration.validPassword.ValidatePasswordFormat("PassWord123");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password- Rule3");
    }
    @Test
    void givenPassword4HappyTest() throws InvalidUserDetailsException{
        boolean actualPasswordFormat = UserRegistration.validPassword.ValidatePasswordFormat("PassWord@123");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password- Rule4");
    }
    @Test
    void givenSampleEmailsReturnTrue() {
        boolean actualEmailFormat1 = userRegistration.validEmail("abc@yahoo.com");
        Assertions.assertTrue(actualEmailFormat1);
        System.out.println("Valid Email address-1");

        boolean actualEmailFormat2 = userRegistration.validEmail("abc-100@yahoo.com");
        Assertions.assertTrue(actualEmailFormat2);
        System.out.println("Valid Email address-2");

        boolean actualEmailFormat3 = userRegistration.validEmail("abc.100@yahoo.com");
        Assertions.assertTrue(actualEmailFormat3);
        System.out.println("Valid Email address-3");

        boolean actualEmailFormat4 = userRegistration.validEmail("abc111@abc.com");
        Assertions.assertTrue(actualEmailFormat4);
        System.out.println("Valid Email address-4");

        boolean actualEmailFormat5 = userRegistration.validEmail("abc-100@abc.net");
        Assertions.assertTrue(actualEmailFormat5);
        System.out.println("Valid Email address-5");

        boolean actualEmailFormat6 = userRegistration.validEmail("abc.100@abc.com.au");
        Assertions.assertTrue(actualEmailFormat6);
        System.out.println("Valid Email address-6");

        boolean actualEmailFormat7 = userRegistration.validEmail("abc@1.com");
        Assertions.assertTrue(actualEmailFormat7);
        System.out.println("Valid Email address-7");

        boolean actualEmailFormat8 = userRegistration.validEmail("abc@gmail.com.com");
        Assertions.assertTrue(actualEmailFormat8);
        System.out.println("Valid Email address-8");

        boolean actualEmailFormat9 = userRegistration.validEmail("abc+100@gmail.com");
        Assertions.assertTrue(actualEmailFormat9);
        System.out.println("Valid Email address-9");
    }
}
