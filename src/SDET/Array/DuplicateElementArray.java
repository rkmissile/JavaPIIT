package SDET.Array;

public class DuplicateElementArray {
    public static void main(String[] args) {
        String arr[] ={"Python","Java","C","C++","Java","Python"};
        boolean flag=false;

        for (int i=0;i < arr.length;i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Found the duplicate elements: "+ arr[i]);
                    flag = true;

                }
            }
        }

        if (flag==false){
            System.out.println("Duplicate elements not found");
        }

    }
}
