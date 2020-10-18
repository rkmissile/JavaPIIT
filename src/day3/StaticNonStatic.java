package day3;

public class StaticNonStatic {
	
	public StaticNonStatic() {
		// default constructor 
		
	}
	public static void main (String[] args) {
		
		StaticNonStatic myObj = new StaticNonStatic();
		
		printMyName();
		myObj.location();
		
		
	}
	
	public static void printMyName() {
		System.out.println("Khan");
	}
	
	
	public void location() {
		System.out.println("New York");
		zip();
		
		
	}
	
	public static void zip() {
		System.out.println("11377");
		
	}
	
	 /**
	  * static-- keyword
	  * 
	  * 
	  */
	

}
