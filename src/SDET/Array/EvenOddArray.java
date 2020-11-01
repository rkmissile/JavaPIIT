package SDET.Array;

public class EvenOddArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};

        System.out.println("even numbers from array:");
        for(int x:a){
            if(x%2==0){
                System.out.println(x);
            }
        }

        System.out.println("Odd numbers from array:");

        for(int y:a){
            if(y%2!=0){
                System.out.println(y);
            }
        }


    }
}
