package lambda_expression;

interface Arthamatic{
	int operation(int a, int b);
}

public class LambdaExpressionExample6 {
	
	public static void main(String[] args) {
		Arthamatic sub =(n, m) -> (n - m);
		System.out.println("substraction :" +sub.operation(200, 100));
		
		Arthamatic div = (n ,m) -> (n / m);
		System.out.println("Division :"+div.operation(200, 3));
		
		Arthamatic multiply = (n ,m) -> (n * m);
		System.out.println("mutiplication : " + multiply.operation(2, 3) );
	}
}
