package lambda_expression;

interface Addable{
	int add(int a, int b);
}

public class LambdaExpressionExample5 {
	
	public static void main(String[] args) {
		Addable add1= (n, m) -> (n + m);
		System.out.println(add1.add(100, 200));
		
		Addable add2 =(n , m) -> ( n + m);
		System.out.println(add2.add(200, 300));

	}
}
