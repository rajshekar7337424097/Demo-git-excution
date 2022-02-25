package review_session;

import java.util.Scanner;

public class Demo1 {
	static int i;
	static int num;
	static int num1;
	static int num2, num3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		i = sc.nextInt();
		sc.close();

		new Demo1().numberGivesZero();
	}

	private void numberGivesZero() {

		for (int j = 0; j <= i; j++) {
			if (i%2 == 0) {
				num = i / 2;
//				System.out.println(i+" "
//						+ "is a even; divide by 2 and obtain"
//						+ " :"+ num);
				if(num % 2 == 0) {
					num1 = num / 2;
					System.out.println(i+" is a even; divide by 2 and obtain :"+ num1);
					i = num;
				}else {
					num2 = num - 1;
					System.out.println(num+ " is a odd; substract with 1 and obtain :" + num2);
					num3 = num2 / 2; 
					System.out.println(num2 + " is a even: divide by 2 and obtain :"+ num3);
					i = num2;
				}
			} else {

			}	
		}

	}

}
