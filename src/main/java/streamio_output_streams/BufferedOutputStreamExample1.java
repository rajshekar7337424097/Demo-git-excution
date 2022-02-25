package streamio_output_streams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample1 {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream file = new FileOutputStream("c:\\streams\\A.txt");
			BufferedOutputStream bout = new BufferedOutputStream(file);
			
			String s = "Welcome to java";
			byte b[] = s.getBytes();
			
			bout.write(b);
			bout.flush();
			bout.close();
			file.close();
		System.out.println("success");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
