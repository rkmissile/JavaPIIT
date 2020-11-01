package SDET.Array;

public class SearchElementArray {
    public static void main(String[] args) {
        int a[]={10,20,30,35,45,55};

        int numSearch=36;
        boolean flag = false;

        for(int x:a){
            if(x==numSearch){
                System.out.println(x + " found in the array");
                flag=true;

            }
        }
        if(flag==false){
            System.out.println(numSearch+" not an element of a[]");
        }
    }
}
