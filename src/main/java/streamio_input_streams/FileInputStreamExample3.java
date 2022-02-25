package streamio_input_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample3 {
	
	public static void main(String[] args) {
		
	try {
		FileInputStream file = new FileInputStream("c:\\b.txt");
		
		int i = 0;
		
		try {
			while((i = file.read()) != -1 ) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	}

}
