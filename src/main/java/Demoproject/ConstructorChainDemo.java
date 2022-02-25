package Demoproject;

public class ConstructorChainDemo {
	int rollno;
	String name;
	String course;
	float fee;
	public ConstructorChainDemo(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	public ConstructorChainDemo(int rollno, String name, String course, float fee) {
		this(rollno, name, course);
		this.fee = fee;
		
	}
	
	void display() {
		System.out.println("Rollno :"+rollno+"\nName :"+name+"\ncourse :"+course+"\nFee :"+fee );
	}
	
	public static void main(String[] args) {
		ConstructorChainDemo chain = new ConstructorChainDemo(45, "Rajashekar", "B.tech");
		ConstructorChainDemo chain1 = new ConstructorChainDemo(75, "Narendra", "B.sc", (float) 9.4);
		chain.display();chain1.display();
	}
}
