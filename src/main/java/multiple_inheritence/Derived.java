package multiple_inheritence;

public class Derived extends Base{
	
	Derived(){
		System.out.println("Default constructor of derived class is called ");
	}
	
	Derived(String name){
		super(name);
		System.out.println(name);
		System.out.println("parametarized Constructor of derived class is called");
	}
	
	public static void main(String[] args) {
		Derived obj = new Derived("raj");
		
	}
}
