package Demoproject;

public class DemoQ {
	
	int math1() {
		System.out.println("Hi.......");
		return new DemoQ().math2() + 10;
	}
	
	 public int math2() {
		System.out.println("Hello");
		return 10;
	}
	
	public static void main(String[] args) {
		System.out.println(new DemoQ().math1());
	}
}
