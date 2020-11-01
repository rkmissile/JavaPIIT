package day6;

public class SingletonMethod {
    //1. private static object of the class (half way)
    private static SingletonMethod cellPhone = null;

    //2. private constructor
    private SingletonMethod() {

    }

    //3. public static method which has return type of the class (object) --> singleton method
    public static SingletonMethod getInstance() {
        if (cellPhone == null) {
            cellPhone = new SingletonMethod();
        }
        return cellPhone;
    }

    public void printMyMobile() {
        System.out.println("Samsung Note 20");
    }
}
