package Demoproject;

public class ClassD {
	void math1() {
		System.out.println(10);
		System.out.println(64);
		System.out.println("end");
	}
	
	int math2(int a, int b, int c) {
		System.out.println(a);
		ClassD  objD =new ClassD();
		String s = objD.math5(100, "java is Awsome");
		System.out.println(s);
		return a - b;
	}
	
	String math3(String s, int b, int d){
		System.out.println(b + d);
		return s;
	}
	
	int math4 (int c, int k){
		System.out.println(k);
	ClassD objD = new ClassD();
	int result = objD.math2(50, 50, 50);
	System.out.println(result);
		
		return k + 10;
	}
	
	String math5(int a, String l){
		System.out.println(a + a);
		ClassD objD = new ClassD();
		String s = objD.math3("hi", 15, 10);
		System.out.println(s);
		return l;
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		ClassD objD = new ClassD();
		int result = objD.math4(20, 10);
		System.out.println(result);
		objD.math1();
	} 
	
	
	


	
}
