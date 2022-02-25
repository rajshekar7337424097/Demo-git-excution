package Demoproject;

public class Demob {
	
	int math1(int a, int b) {
		System.out.println(50);
		Demob obj1 = new Demob();
		System.out.println(45);
		int x = obj1.math2(100, "java is Awsome");
		System.out.println(x + 1);
		return a + b;	 
	}

	int math2(int a, String s) {
		System.out.println(a + a);
		System.out.println(65);
		System.out.println(s);
		return a;
	}
	
	public static void main(String[] args) {
		Demob obj1 = new Demob();
		System.out.println("start");
		System.out.println(obj1.math1(10, 30) + 100);
		System.out.println("end");
	}
}
