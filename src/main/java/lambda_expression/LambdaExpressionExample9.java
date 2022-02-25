package lambda_expression;

interface Sayable4{
	String Say(String message);
}

public class LambdaExpressionExample9 {
	
	public static void main(String[] args) {
		Sayable4 person = (message) -> {
			String str1 = "i would like to say, ";
			String str2 = str1 + message;
			return str2;
		};
		System.out.println(person.Say("time is precious."));
	}
}
