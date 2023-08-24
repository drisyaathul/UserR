package com.userregistrationproblem;
@FunctionalInterface
public interface ValidateEmailId {
    public boolean validateEmailId(String emailId) throws InvalidUserDetailsException;
}
