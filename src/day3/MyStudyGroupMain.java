package day3;

public class MyStudyGroupMain {

	public static void main(String[] args) {
		
		MyStudyGroup  member1 = new MyStudyGroup();
		
		member1.name= "Khan";
		member1.id= 12345;
		member1.location= "Woodside";
		
		System.out.println("Memerber 1 info:");
		member1.memberInfo();
		
		MyStudyGroup member2 = new MyStudyGroup();
		
		member2.name= "Arafat";
		member2.id= 12346;
		member2.location= "Woodheaven";
		
		System.out.println("Memerber 2 info:");
		member2.memberInfo();
		
		MyStudyGroup member3 = new MyStudyGroup();
		
		member3.name= "Tareq";
		member3.id= 12347;
		member3.location= "Woodvillage";
		
		System.out.println("Memerber 3 info:");
		member3.memberInfo();

	}

}
