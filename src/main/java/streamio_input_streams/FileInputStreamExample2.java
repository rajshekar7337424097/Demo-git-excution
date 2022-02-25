package streamio_input_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample2 {
	
	public static void main(String[] args) {
	try {
		FileInputStream file = new FileInputStream("c:\\a.txt");
		int i = 0;


		while((i = file.read()) != -1) {
			System.out.println((char)i);
		}
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}

}
