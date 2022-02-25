package multiple_inheritence;

public interface DemoInterface {
	
	public default void display() {
		System.out.println("display method is called");
	}

}
