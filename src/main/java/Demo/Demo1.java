package Demo;

public class Demo1 {
	
	public static void main(String[] args) {
		int n2 = 1;
		int n3 = 2;
		System.out.println(n2);
		System.out.println(n3);
		for (int i = 1; i <= 5; i++) {
			int n1 = n2 + n3;
			System.out.println(n1);
			n2 = n3;
			n3 = n1;
		}
		
	}

}
