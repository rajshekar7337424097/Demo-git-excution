package streamio_input_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class BufferedInputSteamExample1 {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("c:\\streams\\A.txt");
			BufferedInputStream bin = new BufferedInputStream(file);

			int i = 0;
			while((i = file.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
