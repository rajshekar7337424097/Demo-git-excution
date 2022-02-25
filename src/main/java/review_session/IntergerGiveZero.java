package review_session;

import java.util.Scanner;

public class IntergerGiveZero {
	static int i;
	static int num;
	static int num1;
	public int evenCase() {
		if(num % 2 == 0) {
			System.out.println(num+ " even number ");
			i = num;
		}else {
			System.out.println(num+ " is odd");
			int num1 = num - 1;
			System.out.println(num1+ " even number");
			i = num1;
		}
		return num;
	}
//	public void oddcase() {
//		
//	}
	public void numberGivesZero() {
		
		for (int j = 0; j <= i; j++) {
			if(i % 2 == 0) {
				IntergerGiveZero obj = new IntergerGiveZero();
				 System.out.println("Divided by 2 " +(num = i /2)+ "obtained " +obj.evenCase() );
				
			} else {
				System.out.println(i + " is odd number");
				int num = i -1;
				System.out.println(num+ " is even number");
				System.out.println("divided by " + (num = i /2));;
				if(num % 2 == 0) {
					System.out.println(num+ " even number ");
					i = num;
				}else {
					System.out.println(num+ " is odd");
					int num1 = num - 1;

					System.out.println(num1+ " even number");
					i = num1;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		 i = sc.nextInt();
		 sc.close();

		new IntergerGiveZero().numberGivesZero();

	}

}


