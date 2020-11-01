package SDET.String;

public class StringMethod {
    public static void main(String[] args) {

        String s="Russel ";
        String s1="Khan";
        System.out.println(s.length());
        System.out.println(s.concat(s1));
        System.out.println(s+s1);
        System.out.println("welcome".concat("java"));
        System.out.println(s.trim().length());// getting length of String after trimming

        String s2="Welcome to";
        String s3="Java";
        System.out.println(s.charAt(2));
        System.out.println(s.contains("sl"));
        System.out.println(s.equals("Russel "));
        System.out.println(s.contains("russel"));
        System.out.println(s.equalsIgnoreCase("russel ") );
        String s4="Welcome to Java";
        System.out.println(s4.replace("Java","Selenium"));
        String s5="Java";

        String s6=s5.replace('J','L');

        System.out.println(s6);
        System.out.println(s5.substring(1));
        System.out.println(s5.substring(0,3));
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());




    }


}
