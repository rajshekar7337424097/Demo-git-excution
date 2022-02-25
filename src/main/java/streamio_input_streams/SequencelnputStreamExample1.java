package streamio_input_streams;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.SequenceInputStream;

public class SequencelnputStreamExample1 {
	
	public static void main(String[] args) {
		try {
			FileInputStream file1 = new FileInputStream("c:\\a.txt");
			FileInputStream file2 = new FileInputStream("c:\\b.txt");
			SequenceInputStream inst = new SequenceInputStream(file1, file2);
			
			int  i =0;
			while((i = inst.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
