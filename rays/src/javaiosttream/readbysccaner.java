package javaiosttream;

import java.io.FileReader;
import java.util.Scanner;

public class readbysccaner {

	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\New folder (2)\\hello.txt");
		Scanner s = new Scanner(f);
		while (s.hasNext()) {
			System.out.println(s.nextLine());
		}
		f.close();
		s.close();

	}

}
