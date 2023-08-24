package com.userregistrationproblem;
@FunctionalInterface
public interface ValidateFirstName {
    public boolean validFirstName(String firstName) throws InvalidUserDetailsException;

}
