package lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample0 {

	
			public static void main(String[] args) {
				List<Product>list = new ArrayList<Product>();
				
				list.add(new Product(1, "Hp laptop", 25000f));
				list.add(new Product(2, "Delll", 45000f));
				list.add(new Product(3, "Lenovo", 23000f));
				list.add(new Product(4, "msi", 46000f));
				
				System.out.println("Sorting on the basis of name");
				
				
				Collections.sort( list, (p1, p2) -> {
					return p1.name.compareTo(p2.name);
				});
				
				for (Product product : list) {
					System.out.println(product.id+ " " +product.name + " " + product.price);	
				}	
			}
		}

