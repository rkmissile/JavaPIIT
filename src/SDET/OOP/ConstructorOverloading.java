package SDET.OOP;

public class ConstructorOverloading {

    public ConstructorOverloading(int x, int y)// constructor 1
    {
        System.out.println(x+y);
    }

    public ConstructorOverloading(int x, int y, int z)// constructor 2
    {
        System.out.println(x+y+z);
    }

    public ConstructorOverloading(String name)// constructor 3
    {
        System.out.println("My name is "+ name);
    }

    void m1(){

        System.out.println("I am a method");

    }


    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading(10,20);

        ConstructorOverloading obj2 = new ConstructorOverloading(10,20,30);
        ConstructorOverloading obj3 = new ConstructorOverloading("Khan");

        obj1.m1();
        obj2.m1();
        obj3.m1();


    }// end of main method




}// end of the class
