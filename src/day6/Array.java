package day6;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Random random = new Random();

        int [] num = new int[5];

        for (int x=0; x<5; x ++){
            num[x]= random.nextInt(num.length);
            //random.nextInt(500);
        }
        System.out.println("Random Array:");
        System.out.println(num[4]);



    }}
