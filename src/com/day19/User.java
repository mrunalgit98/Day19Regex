package com.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    public static void MultipleEmail() {
        String email1 = "abc@yahoo.com";
        String email2 = "abc-100@yahoo.com";
        String email3 = "abc.100@yahoo.com";
        String email4 = "abc111@abc.com";
        String email5 = "abc-100@abc.net";
        String email6 = "abc.100@abc.com.au";
        String email7 = "abc@1.com";
        String email8 = "abc+100@gmail.com";
        String email9 = "abc@gmail.com.com";

        String multipleEmail = "[a-zA-Z0-9]+[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[a-z]";
        Pattern pattern1 = Pattern.compile(multipleEmail);
        Matcher matcher1 = pattern1.matcher(email1);
        boolean result1 = matcher1.matches();

        if (result1 == true)
            System.out.println("email 1 is valid");
        else System.out.println("email 1 is invalid");

        Pattern pattern2 = Pattern.compile(multipleEmail);
        Matcher matcher2 = pattern2.matcher(email1);
        boolean result2 = matcher2.matches();

        if (result1 == true)
            System.out.println("email 2 is valid");
        else System.out.println("email 2 is invalid");


        Pattern pattern3 = Pattern.compile(multipleEmail);
        Matcher matcher3 = pattern3.matcher(email1);
        boolean result3 = matcher3.matches();

        if (result1 == true)
            System.out.println("email 3 is valid");
        else System.out.println("email 3 is invalid");


        Pattern pattern4 = Pattern.compile(multipleEmail);
        Matcher matcher4 = pattern4.matcher(email1);
        boolean result4 = matcher4.matches();

        if (result1 == true)
            System.out.println("email 4 is valid");
        else System.out.println("email 4 is invalid");



        Pattern pattern5 = Pattern.compile(multipleEmail);
        Matcher matcher5 = pattern5.matcher(email1);
        boolean result5 = matcher5.matches();

        if (result1 == true)
            System.out.println("email 5 is valid");
        else System.out.println("email 5 is invalid");



        Pattern pattern6 = Pattern.compile(multipleEmail);
        Matcher matcher6 = pattern6.matcher(email1);
        boolean result6= matcher6.matches();

        if (result1 == true)
            System.out.println("email 6 is valid");
        else System.out.println("email 6 is invalid");


        Pattern pattern7 = Pattern.compile(multipleEmail);
        Matcher matcher7 = pattern7.matcher(email1);
        boolean result7 = matcher7.matches();

        if (result1 == true)
            System.out.println("email 7 is valid");
        else System.out.println("email 7 is invalid");


        Pattern pattern8 = Pattern.compile(multipleEmail);
        Matcher matcher8 = pattern8.matcher(email1);
        boolean result8 = matcher8.matches();

        if (result1 == true)
            System.out.println("email 8 is valid");
        else System.out.println("email 8 is invalid");


        Pattern pattern9 = Pattern.compile(multipleEmail);
        Matcher matcher9= pattern9.matcher(email1);
        boolean result9= matcher9.matches();

        if (result1 == true)
            System.out.println("email 9 is valid");
        else System.out.println("email 9 is invalid");

    }
    public static void main(String[] args) {
   MultipleEmail();
    }
}
