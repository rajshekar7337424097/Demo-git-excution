package lambda_expression;

interface MathFunction{
	int add(int a, int b);
}

public class LambdaExpressionExample7 {

	public static void main(String[] args) {
		MathFunction add1 = (n ,m) -> (n + m);
		System.out.println("Addition :"+add1.add(30, 40));
		
		MathFunction add2 = (n, m) -> {
			if(n == 0)
				return n;
			return( n + m);
		};
		System.out.println("Addition2 :"+add2.add(0, 40));
	}
}
