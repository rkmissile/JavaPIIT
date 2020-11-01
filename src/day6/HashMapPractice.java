package day6;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> myStudyGroup = new HashMap<>();

        myStudyGroup.put(2345, "Khan");
        myStudyGroup.put(3456, "Arafat");
        myStudyGroup.put(4567, "Tareq");

        System.out.println(myStudyGroup);
        System.out.println(myStudyGroup.get(2345));
        System.out.println(myStudyGroup.get(3457));// wrong key gives null value
        System.out.println(myStudyGroup.size());
        System.out.println();










        // end of main method
    }


// end of class
}
