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

    public static void main(String[] args) {
        firstname();
    }
}
