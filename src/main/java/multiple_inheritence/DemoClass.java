package multiple_inheritence;

public class DemoClass implements Demo1, Demo2{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Demo1.super.display();
		Demo2.super.display();
	}
	
	public static void main(String[] args) {
	DemoClass dc = new DemoClass();
	dc.display();
	}

	
	
}
