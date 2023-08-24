package com.userregistrationproblem;
@FunctionalInterface
public interface ValidateLastName{
    public boolean ValidateLastName(String lastName) throws InvalidUserDetailsException;
}
