package com.ps;
import java.util.Scanner;

public class FullNameGenerator{

     static Scanner userAnswer = new Scanner(System.in);


    public static void main(String[] args) {


        System.out.println("Please enter your name");
        String name = userAnswer.nextLine().trim();
        System.out.println(" First name : " + name);

        System.out.println("Middle name");
        String middleName = userAnswer.nextLine().trim();
        System.out.println("Middle name : " + middleName);

        System.out.println("Last name");
        String lastName = userAnswer.nextLine().trim();
        System.out.println("Last name : " + lastName);

        System.out.println("Suffix");
        String userSuffix = userAnswer.nextLine().trim();
        System.out.println("Suffix " + userSuffix);

        String userSuffixwithcomma = "";
        if(userSuffix.length() > 0) {
            userSuffixwithcomma = " , " + userSuffix;

        }

        System.out.println( name  + " " +  middleName + " " + lastName  + userSuffixwithcomma );







    }
}