package lambda_expression;

@FunctionalInterface
interface Drawable1{
	public void draw();
}

public interface LambdaExpressionExample2 {
	public static void main(String[] args) {
		final int width = 10;
		
		Drawable1 d2=() -> {
			System.out.println("drawing " + width);
		};
		d2.draw();
	}

}
