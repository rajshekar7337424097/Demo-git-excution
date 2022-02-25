package Demoproject;

public class ClassA {
	
	void math1(int a) {
		System.out.println("printing value of a ");
		System.out.println("so that a value :"+a);
	}
	void math2(int a, String d) {
	System.out.println("math 2 is  called ");
	System.out.println("a values is :"+a);
	System.out.println("s values is :"+d);
	}
	
	public static void main(String[] args) {
		ClassA objA = new ClassA();
		objA.math1(29);
		objA.math2(45, "java is awsome");
	}

}
