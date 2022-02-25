package lambda_expression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample8 {
	
	public static void main(String[] args) {
		List<String> list =  new ArrayList<String>();
		
		list.add("Rajshekar");
		list.add("Narendra");
		list.add("murali");
		list.add("chandu");
		
		list.forEach( 
				(n) -> System.out.println(n)
				);
	}
}
