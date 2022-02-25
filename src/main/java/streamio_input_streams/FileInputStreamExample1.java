package streamio_input_streams;

import java.io.FileInputStream;
;

public class FileInputStreamExample1 {
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("c:\\a.txt");


			int i = file.read();

			System.out.println((char)i);
			file.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
