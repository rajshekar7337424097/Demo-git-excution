package lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample11 {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "samsung A2", 17000f));
		list.add(new Product(2, "iphone 6s", 65000f));
		list.add(new Product(3, "sony Xperia", 32000f));
		list.add(new Product(4, "nokia 5.1plus", 10000f));
		list.add(new Product(5, "lenovo ", 12000f));
		
		Stream<Product> filtered_data = list.stream().filter(p -> p.price > 10000);
		
		filtered_data.forEach(product -> System.out.println(product.name + " " +product.price)
				);
	}

}
