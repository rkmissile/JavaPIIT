package day3;

public class StaticVariable2 {
	
	//String country = "Canada";
	//int zip = 11344;
	
	public static void main(String[] args) {
		StaticVariable myObj2 = new StaticVariable();
		
		myObj2.zipCode();
		
		System.out.println(StaticVariable.country);
		System.out.println(myObj2.zip);
		
		StaticVariable.cName();
		
	}

}
