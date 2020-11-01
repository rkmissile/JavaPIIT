package SDET.Array;

public class MaxMinArray {
    public static void main(String[] args) {

        int a[]={80,70,60,50,40,90};
        //maximum element of array>>>>>
        int max=a[0];
        for(int x:a){
            if(x>max){
                max=x;
            }

        }

        System.out.println(max);


        //Minimum element of array>>>>

        int min=a[0];
        for(int y:a){
            if(y<min){
                min=y;
            }
        }
        System.out.println(min);





    }
}
