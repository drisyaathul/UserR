package com.userregistrationproblem;

public class InvalidUserDetailsException extends Exception {

    public ExpectedType type;

    public enum ExpectedType{
        FIRSTNAME,LASTNAME,EMAIL,MOBILE_NUMBER,PASSWORD
    }
    public InvalidUserDetailsException(String message,  ExpectedType type) {
        super(message);
        this.type = type;
    }

}
