package SDET.Inheritance;

public class C extends B {
    int c = 300;
    void print(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        C cobj = new C();

        cobj.display();
        cobj.show();
        cobj.print();

    }// end of main method
}// end of class
