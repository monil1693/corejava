package exercisetest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class filerunbysccaner {

	public static void main(String[] args) throws Exception {
		FileReader f = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\babu.txt");
		Scanner s = new Scanner(f);
		while(s.hasNext()) {
			System.out.println(s.nextLine());
			s.close();
			f.close();
			
		}
	}

}
