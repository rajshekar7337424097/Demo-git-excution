package Demoproject;

public class DemoS {
	
	int math (int a, int b, char
			c) {
		System.out.println(c);
		int  result = new DemoS().math2("java", 100, 'y');
		return 10 + a + result;
	}

	private int math2(String s, int a, char c) {
		System.out.println(s);
		System.out.println(c);
		return 20;
	}
	
	public static void main(String[] args) {
	DemoS obj =	new DemoS();
	System.out.println(obj.math(10, 20, 'X'));
	}

}
