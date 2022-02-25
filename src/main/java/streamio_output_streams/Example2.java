package streamio_output_streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
	
	public static void main(String[] args) {
		try {
			FileOutputStream file = new FileOutputStream("c:\\a.txt");
			String s= "Welcome to java";
			byte b[] = s.getBytes();
			
				file.write(b);
				file.close();
				System.out.println("succes");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}		
}
