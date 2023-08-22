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
}
