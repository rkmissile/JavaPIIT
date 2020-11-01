package day6;

public class SingletonMethodMain {
    public static void main(String[] args) {
        SingletonMethod cellPhone = SingletonMethod.getInstance();
        cellPhone.printMyMobile();


        //
        //
        //


        SingletonMethod cellPhone2 = SingletonMethod.getInstance();
        cellPhone2.printMyMobile();
    }
}
