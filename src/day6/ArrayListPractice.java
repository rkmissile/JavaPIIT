package day6;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> boroughsOfNY = new ArrayList<>();
        boroughsOfNY.add("Manhattan");
        boroughsOfNY.add("Queens");
        boroughsOfNY.add("Bronx");
        boroughsOfNY.add("Staten Island");

        System.out.println(boroughsOfNY);
        System.out.println(boroughsOfNY.size());
        System.out.println(boroughsOfNY.get(1));

        for(int i=0; i< boroughsOfNY.size(); i++){
            System.out.println(boroughsOfNY.get(i));
        }

        for(String i:boroughsOfNY) {
            System.out.println(i);
        }







    }


}
