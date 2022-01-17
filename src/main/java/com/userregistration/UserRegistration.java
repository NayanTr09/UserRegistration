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

    public static void validMobileNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number : ");
        String phoneNo = scanner.nextLine();
        String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3)
            System.out.println("Phone number is Valid");
        else
            System.out.println("Phone number is Invalid");
    }

    public static void validPassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = scanner.next();
        String regex4 = "^(?=.*[A-Za-z]){8,}";
        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(password);
        boolean r4 = m4.matches();
        if (r4)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
}


