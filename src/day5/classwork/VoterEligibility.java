package day5.classwork;

import java.util.Scanner;

public class VoterEligibility {

    public static void main(String[] args) {

        Scanner age = new Scanner(System.in);

        System.out.println("Please enter your age to check your eligibility to vote: ");

        int myAge = age.nextInt();

        if (myAge>= 18){
            System.out.println("Welcome!! You are eligible to vote");
        }
        else{
            System.out.println("Sorry!! You not eligible to vote");
            switch(myAge){
                case 17:
                    System.out.println("wait one more year please");
                    break;
                case 16:
                    System.out.println("Wait two more year please");
                    break;
                default:
                    System.out.println("Wait till be 18");
            }
        }
    }

}
