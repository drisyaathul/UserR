package com.userregistrationproblem;
@FunctionalInterface
public interface ValidatePasswordFormat {
    public boolean ValidatePasswordFormat(String password) throws InvalidUserDetailsException;
}
