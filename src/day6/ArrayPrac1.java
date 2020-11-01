package day6;

import java.util.Arrays;

public class ArrayPrac1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        System.out.println(a.length);


        for(int i=0; i<=a.length-1;i++){

            System.out.println(a[i]);

        }
          // enhance for loop
        for(int x:a){
            System.out.println(x);
            //System.out.print(x);  // to print in same line all data

        }

        

        System.out.println();
        System.out.println();
        System.out.println();

        // multidimensional array

        int b[][]= new int[3][2]; // 3 rows and 2 column
        b[0][0]=100;
        b[0][1]=200;
        b[1][0]=200;
        b[1][1]=200;
        b[2][0]=200;
        b[2][1]=200;

        int c [][]= {
                {12,23},
                {34,45},
                {56,67}
        };
        System.out.println(c.length);
        System.out.println(c[0 ].length);
        for (int rw = 0; rw<3; rw++){
            for(int cm=0;cm<2;cm++){
                System.out.println(c[rw][cm]);
            }
        }

        for (int x[]:b){
            for(int y:x){
                System.out.println(y);

            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(b));









    }//end of main method

}// end of class
