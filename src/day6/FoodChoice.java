package day6;

import java.util.Random;
import java.util.Scanner;

public class FoodChoice {


    public static void main(String[] args) {
        System.out.println("Please enter the name of your five favorite foods one by one: ");

        String[] foods = new String[5];

        //String foods;

//        Scanner scanFood= new Scanner(System.in);
//
//        String foodName= scanFood.nextLine();
//
//

        for(int x=0; x<foods.length; x++){

            Scanner scanFood= new Scanner(System.in);
            //String[] foods = new String[5];
            foods[x]=scanFood.nextLine();

           // System.out.println(foods[0]);

        }
        // System.out.println(foods[0]);

        Random random= new Random();

        int y= random.nextInt(foods.length-1);

        System.out.println("Thanks for your food choices.Today's surprise food for you is>>>>>");

        System.out.println(foods[y]);


    }
}
