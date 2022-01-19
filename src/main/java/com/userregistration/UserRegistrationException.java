package com.userregistration;

public class UserRegistrationException extends Exception{
    public String name;

    public  UserRegistrationException(String name){
        super(name);
    }
}
