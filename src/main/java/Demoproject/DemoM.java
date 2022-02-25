package Demoproject;

public class DemoM {

	String math1(int a, int b) {
		System.out.println(10);
		System.out.println((54+10) - b);
		int value = new DemoM().math5();
		System.out.println(value);
		return "java";
	}
	
	int math2(int a) {
		System.out.println(75);
		int b = 5;
		System.out.println(b -a);
		return (5*5)-b;
	}
	
	public void math3() {
		System.out.println("start");
		System.out.println(new DemoM().math4());
		System.out.println(40);
	}

	String math4() {
		System.out.println("today is saturday");
		return new DemoM().math1(4, 8);
		
	}

	private int math5() {
	DemoM obj = new DemoM();
	System.out.println(99);
		return obj.math2(5);
		
	}
	
	public static void main(String[] args) {
	DemoM obj =	new DemoM();
	obj.math3();
	
	System.out.println(new DemoQ().math2());
	}
}
