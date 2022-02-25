package streamio_output_streams;

import java.io.FileOutputStream;



public class FileOutputStreamExample1 {
	
	public static void main(String[] args) {
		try {
	FileOutputStream file = new FileOutputStream("c:\\a.txt");
	file.write(35);
	file.close();
	System.out.println("succes");
	}catch (Exception e) {
		System.out.println(e);
	}
	}
	}


