package Demoproject;

public class DemoMethods {
	
	void math1() {
		System.out.println("method1 is  called ");
	}
	
	public static void main(String[] args) {
		 DemoMethods obj1 = new DemoMethods();
		 DemoMethods obj2 = new DemoMethods();
		 
		 System.out.println("hasCode of obj1 :"+obj1.hashCode());
		 System.out.println("hasCode of obj2 :"+obj2.hashCode());
		 
		 System.out.println(obj1.equals(obj1));
		 System.out.println(obj1.equals(obj2));	
		 System.out.println(obj2.equals(obj1));
		 
		 System.out.println(obj1.getClass());
		 System.out.println(obj2.toString()+ "  "+obj2.toString());
	}
}
