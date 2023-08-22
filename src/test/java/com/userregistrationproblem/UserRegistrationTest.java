package com.userregistrationproblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstNameReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualFirstName = userRegistration.validFirstName("Drisya");
        Assertions.assertTrue(actualFirstName);
        System.out.println("Valid First Name");
    }
}
