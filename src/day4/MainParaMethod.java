package day4;

public class MainParaMethod {
    public static void main(String[] args) {
        ParaMethod.groupId(2345);

        ParaMethod paraMethod = new ParaMethod();
        paraMethod.groupName("Russel", "Khan");

        System.out.println("This is your Phone Number: "+ParaMethod.contact(347656948));

        System.out.println("This is your Instructor Name: "+paraMethod.instructorName("Zann"));




    }

}
