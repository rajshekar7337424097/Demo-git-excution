package Demoproject;

public class DemoClass {
	
	public void math1() {
		System.out.println("hello ");
		System.out.println("hiii" );
		System.out.println("java is Awsome");
	}
	
	void math2(int a) {
		System.out.println("meth2 is called :");
		System.out.println("a values is :"+a);
	}
	
	void math3(String s) {
		System.out.println("math3 is called");
		System.out.println("s values is :"+s);
	}
	
	void math4(double d) {
		System.out.println("Method 4 is called");
		System.out.println(" d values is" + d);
	}
	int math5() {
		System.out.println("meth5 is calling");
		return 100;
	}
	
	int math6(int a) {
		System.out.println("math6 is calling ");
		return 100+a;
	}
	
	public static void main(String[] args) {
		DemoClass obj1 = new DemoClass();
		DemoClass obj2; // this is also a reforence
		
		 obj1.math1();
		// obj2.math1();
		
		new DemoClass(); // this is a object
		
		new DemoClass().math1(); // methods are calling with reforence and reforence should be intialized with the object or with out reforence we can call the object
		
		new DemoClass().math2(100);
		obj1.math3("The end");
		obj1.math4(2.3) ;
		int result = obj1.math5();
		System.out.println(result);
		int result1 = obj1.math6(100);
		System.out.println(result1);
	}
	
}
