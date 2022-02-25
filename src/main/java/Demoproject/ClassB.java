package Demoproject;

public class ClassB extends ClassA{
	
	public void math2(String a){
		System.out.println("Hello world");
		System.out.println("java is :" +a);
		
	}
	
	void math3(float f, char c) {
		System.out.println("Math3 is called");
		System.out.println("f value is :"+f);
		System.out.println("c values is  :" +c);
	}
	public static void main(String[] args) {
	ClassB objB = new ClassB();
	objB.math1(34);
	objB.math2("Awsome");
	objB.math3(4.1f, 'v');
	}
}
