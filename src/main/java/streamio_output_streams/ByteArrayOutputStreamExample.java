package streamio_output_streams;

import java.io.ByteArrayOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
	
	public static void main(String[] args) {
		try {
			FileOutputStream file1 = new FileOutputStream("c:\\a.txt");
			FileOutputStream file2 = new FileOutputStream("c:\\b.txt");
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			bout.write(65);
			bout.writeTo(file1);
			bout.writeTo(file2);
			bout.flush();
			bout.close();
			System.out.println("success");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
