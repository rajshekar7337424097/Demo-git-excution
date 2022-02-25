package lambda_expression;

interface Sayable{
	public String say();
}

public class LambdaExpressionExample {
public static void main(String[] args) {
	Sayable s =() -> {
		return " i have nothin to say";
	};
	
	Sayable a =() -> {
		return " i have to say";
	};
	System.out.println(s.say());
	System.out.println(a.say());
}
}
