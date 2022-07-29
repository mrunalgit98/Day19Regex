package com.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    public static void firstname(){
      String firstname="[A-Z]{1}[a-z]{2}";
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first name");
        String firstname1=sc.next();

        Pattern pattern =Pattern.compile(firstname);
        Matcher matcher =pattern.matcher(firstname1);
        boolean result=matcher.matches();

        if(result==true)
            System.out.println("first name is valid");
        else System.out.println("first name is not valid");
    }

    public static void lastname(){
        String lastname="[A-Z]{1}[a-z]{2}";
        Scanner sc =new Scanner(System.in);
        System.out.println("enter last name");
        String lastname1=sc.next();

        Pattern pattern =Pattern.compile(lastname);
        Matcher matcher =pattern.matcher(lastname1);
        boolean result=matcher.matches();

        if(result==true)
            System.out.println("last name is valid");
        else System.out.println("last name is not valid");
    }

    public static void Email(){
        String email="[a-zA-Z0-9.]+[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.][a-z]*";
        System.out.println("enter email");
        Scanner sc3 =new Scanner(System.in);
        String email1=sc3.next();

        Pattern pattern2=Pattern.compile(email);
        Matcher matcher2=pattern2.matcher(email1);
        boolean result2=matcher2.matches();

        if(result2== true){
            System.out.println("Email is valid");
        }else{
            System.out.println("Email is not valid");
        }

    }
    public static void MobileNumber(){
        Scanner sc=new Scanner(System.in);
        String mobileno="(91-)[0-9]{10}";
        System.out.println("enter phone number");
        String phno= sc.next();

        Pattern pattern=Pattern.compile(mobileno);
        Matcher matcher=pattern.matcher(phno);
        boolean result=matcher.matches();

        if(result==true){
            System.out.println("mobile number is valid");
        }else {
            System.out.println("mobile number is invalid");
        }
    }

    public static void passwordValidation(){
        Scanner sc=new Scanner(System.in);
        String Password="[a-zA-Z0-9!@#$]{8}";
        System.out.println("enter password");
        String password=sc.next();

        Pattern pattern=Pattern.compile(Password);
        Matcher matcher=pattern.matcher(password);
        boolean result =matcher.matches();
        if(result==true){
            System.out.println("password is valid");
        }else{
            System.out.println("password is invalid nter min 8 character");
        }
    }


    public static void passwordValidation2(){
        Scanner sc=new Scanner(System.in);
        String Password="[A-Z]+[a-zA-Z0-9!@#$%]{7}";
        System.out.println("enter password with min one character should be capital");
        String password=sc.next();

        Pattern pattern=Pattern.compile(Password);
        Matcher matcher=pattern.matcher(password);
        boolean result =matcher.matches();
        if(result==true){
            System.out.println("password is valid");
        }else{
            System.out.println("password is invalid enter min 8 character");
        }
    }


    public static void passwordValidation3(){
        Scanner sc=new Scanner(System.in);
        String Password="[A-Z]+[0-9][a-zA-Z0-9!@#$%]{6}";
        System.out.println("enter password with min one number and one Uppercase ");
        String password=sc.next();

        Pattern pattern=Pattern.compile(Password);
        Matcher matcher=pattern.matcher(password);
        boolean result =matcher.matches();
        if(result==true){
            System.out.println("password is valid");
        }else{
            System.out.println("password is invalid enter min 8 character");
        }
    }

    public static void passwordValidation4(){
        Scanner sc=new Scanner(System.in);
        String Password="[A-Z]+[0-9]+[~!@#$%^&*]{1}[a-zA-Z0-9!@#$%]{5}";
        System.out.println("enter password with min one number and one Uppercase And at least one special character ");
        String password=sc.next();

        Pattern pattern=Pattern.compile(Password);
        Matcher matcher=pattern.matcher(password);
        boolean result =matcher.matches();
        if(result==true){
            System.out.println("password is valid");
        }else{
            System.out.println("password is invalid enter min 8 character and special charcter");
        }
    }
    public static void main(String[] args) {
//        firstname();
//        lastname();
//        Email();
//        MobileNumber();
//        passwordValidation();
  //      passwordValidation2();
  //      passwordValidation3();
        passwordValidation4();
    }
}
