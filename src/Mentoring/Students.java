package Mentoring;

public class Students {

    public Students(){

    }


    String sName; // global variable
    int SID;
    char grade;

    void infoOfStudent(){ // global method

        int mark; // local variable
        System.out.println("Student name: " +sName);
        System.out.println("Student ID: "+ SID);
        System.out.println("Student grade: "+ grade);

    }

    public static void main(String[] args) {

        Students student1 = new Students(); // object of the class


        student1.sName="Aziz";
        student1.SID=2345;
        student1.grade='A';

        student1.infoOfStudent();


        Students student2 = new Students();

        student2.sName="Kate";
        student2.SID=4567;
        student2.grade='A';

        student2.infoOfStudent();









    }





}
