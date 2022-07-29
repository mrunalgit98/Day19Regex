package com.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

//    public static void firstname(){
//      String firstname="[A-Z]{1}[a-z]{2}";
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter first name");
//        String firstname1=sc.next();
//
//        Pattern pattern =Pattern.compile(firstname);
//        Matcher matcher =pattern.matcher(firstname1);
//        boolean result=matcher.matches();
//
//        if(result==true)
//            System.out.println("first name is valid");
//        else System.out.println("first name is not valid");
//    }
//
//    public static void lastname(){
//        String lastname="[A-Z]{1}[a-z]{2}";
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter last name");
//        String lastname1=sc.next();
//
//        Pattern pattern =Pattern.compile(lastname);
//        Matcher matcher =pattern.matcher(lastname1);
//        boolean result=matcher.matches();
//
//        if(result==true)
//            System.out.println("last name is valid");
//        else System.out.println("last name is not valid");
//    }

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


    public static void main(String[] args) {
//        firstname();
//        lastname();
        Email();
    }
}
