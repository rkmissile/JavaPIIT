package day9;

public class JavaLoopPractice {

    // write an application which will print selenium 5 times
    // for each selenium , it will print java 3 times
    // when java is getting printed for second and third time, print "i hate java" instead of "java"
    // and for the 3rd and 5th time of selenium print, instead of "selenium", print "i love selenium"
    // if selenium get printed for third time and java get printed for second time print your name


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            if (i == 2 || i == 4) {

                System.out.println("I love Selenium");

            } else {
                System.out.println("Selenium");
            }
            for (int j = 0; j < 3; j++) {

                if (i == 2 && j == 1) {
                    System.out.println("Khan");
                } else if (j == 1 || j == 2) {
                    System.out.println("I hate Java");
                } else {
                    System.out.println("Java");
                }
            }

        }
    }
}
