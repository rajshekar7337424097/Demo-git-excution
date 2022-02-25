package constructor_chaining;

public class Temp2 {

	Temp2(){
		System.out.println("Default");
	}
	
	Temp2(int x){
		this();
		System.out.println(x);
		
	}
	
	Temp2(int x, int y){
		this(5);
		
		System.out.println(x * y);
	}
	
	public static void main(String[] args) {
		new Temp2(5, 15);
	}
}
