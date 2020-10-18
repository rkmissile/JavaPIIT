package day4;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        fullName();




    }

    public static void fullName(){

        Scanner myScanner= new Scanner(System.in);
        System.out.println("What is your first name? Enter below: ");
        String fName= myScanner.next();

        System.out.println("What is your last name? Enter below: ");
        String lName=myScanner.next();

        System.out.println("This is your full name : "+fName+" "+lName );


    }

}
