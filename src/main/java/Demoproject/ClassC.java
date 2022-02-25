package Demoproject;

public class ClassC extends ClassB{
	
	void math3(double d) {
		System.out.println("double values stores more space then integer");
		System.out.println("double values is :"+ d);
	}
	public static void main(String[] args) {
	ClassC obj3 = new ClassC();
	obj3.math2("awsome");
	obj3.math1(20);
	obj3.math3(40.4);
	}
}
