package exercisetest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class buffertest {

	public static void main(String[] args) throws Exception {
		FileReader f = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\babu.txt");
		BufferedReader b = new BufferedReader(f);
		String s = b.readLine();
		while (s!=null) {
			System.out.println(s);
			s=b.readLine();
			
		}

	}

}
