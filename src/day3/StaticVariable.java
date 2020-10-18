package day3;

public class StaticVariable {
	static String country = "USA";
	int zip = 11377;
	
	
	public static void main(String [] args) {
		
		System.out.println(country); 
		
		StaticVariable myObj = new StaticVariable(); 
		myObj.zipCode();
	}
	
	public void zipCode() {
		System.out.println(zip);
		
	}
	public static void cName() {
		System.out.println(country);
		
	}

}
