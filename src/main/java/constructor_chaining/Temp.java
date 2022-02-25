package constructor_chaining;

public class Temp {
	
	Temp(){
		this(5);
		System.out.println("default constructor is called");
		System.out.println("end");
	}
	
	Temp(int x){
		this(5, 15);
		System.out.println(x);
	}
	
	Temp(int x, int y){
		System.out.println("starts");
		System.out.println( x * y );
		
	}
	
	public static void main(String[] args) {
		new Temp();
	}
}
