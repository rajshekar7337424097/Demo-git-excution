package lambda_expression;

interface Sayable1{
	public String Say(String name);
}

public class LambdaExpressionExample4 {

	public static void main(String[] args) {
		Sayable1 s1 = (name) -> {
			return "Hello " +name;
		};
		
		Sayable1 s2 = (Title) -> {
			return "hiii " +Title;
		};
		
		System.out.println(s1.Say("java"));
		System.out.println(s2.Say("raj"));
	}
}
