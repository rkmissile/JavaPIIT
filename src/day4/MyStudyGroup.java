package day4;


public class MyStudyGroup {


    String name;
    int id;
    String location;

    public void memberInfo() {
        System.out.println("Member info: >>>>>>>>>>>");
        System.out.println("Name: " + name);
        System.out.println("ID: "+ id);
        System.out.println("Location: " + location);

    }

    public MyStudyGroup(String pName, int pId, String pLocation){
        this.name=pName;
        this.id=pId;
        this.location=pLocation;

    }


}
