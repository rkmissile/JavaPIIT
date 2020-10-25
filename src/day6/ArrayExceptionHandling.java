package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExceptionHandling {
    public static void main(String[] args) {

        String []cars={"Mercedes", "BMW","Ford", "Mazda"};
        // why we can not get array directly??
        System.out.println(Arrays.toString(cars));
        System.out.println("Elements of array :");

        for(String i:cars){
            System.out.println(i);
        }

        Scanner indexOfArray = new Scanner(System.in);
        System.out.println("Plz enter the index of array to get the car you want:");

        int x =indexOfArray.nextInt();


        //int x ;


        if (x>=cars.length) {

            try{
                System.out.println(cars[x]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry!! the index is invalid");
            }
        }
        else{
            System.out.println(cars[x]);
        }






    }
}
