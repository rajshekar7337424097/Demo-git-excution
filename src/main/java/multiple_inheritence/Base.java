package multiple_inheritence;

public class Base {
	
	String name;

	Base(){
		System.out.println("Default Constructor of base class is called");
	}
	
	Base(String name){
		this.name = name;
		System.out.println("parametarized Constructor of base class is called");
	}
}
