package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static void validFirstName() {
        System.out.print("Enter the First Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            System.out.println("First name is valid");
        else
            System.out.println("First name is !Invalid");
    }

    public static void validLastName() {
        System.out.print("Enter the Last Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            System.out.println("Last name is valid");
        else
            System.out.println("Last name is !Invalid");
    }

    public static void validEmail() {
        System.out.println("Enter the Email ID");
        String email = scanner.next();
        String regex2 = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(email);
        boolean r2 = m2.matches();
        if (r2)
            System.out.println("Email is valid");
        else
            System.out.println("Email is not valid");
    }
}


