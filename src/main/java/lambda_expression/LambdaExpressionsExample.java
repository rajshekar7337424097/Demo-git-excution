package lambda_expression;

public class LambdaExpressionsExample {
	
	public static void main(String[] args) {
	final	int width = 10;
		
		Drawable obj = new Drawable() {
			public void drow() {
				System.out.println("drawable" + width);
			}
		};
		obj.drow();
	}
}
