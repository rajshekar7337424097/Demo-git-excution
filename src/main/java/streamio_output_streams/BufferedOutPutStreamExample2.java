package streamio_output_streams;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutPutStreamExample2 {
	
	public static void main(String[] args) {
		try {
			FileOutputStream file = new FileOutputStream("c:\\streams\\A.txt");
			
			BufferedOutputStream bout = new BufferedOutputStream(file);
			
			String s = "java is Awsome";
			byte b[] = s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			file.close();
			System.out.println("succes");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
