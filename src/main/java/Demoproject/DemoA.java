package Demoproject;

public class DemoA {
	String math1() {
		System.out.println("math1 is called ");
		return "java is awsome";
	}
	
	public static void main(String[] args) {
	DemoA obj1 = new DemoA();
//	obj1.math1();
//	System.out.println(obj1.math1());
	
	String result = obj1.math1();
	System.out.println(result);
	}
}
