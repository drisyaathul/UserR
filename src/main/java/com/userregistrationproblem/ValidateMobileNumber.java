package com.userregistrationproblem;
@FunctionalInterface
public interface ValidateMobileNumber {
    public boolean ValidateMobileNumber(String mobileNumber) throws InvalidUserDetailsException;
}
