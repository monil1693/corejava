package javaiosttream;

import java.io.FileReader;

public class Fileread {

	public static void main(String[] args) throws Exception {
		FileReader in = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\New folder (2)\\hello.txt");
		
		int ch = in.read();
		while(ch!=-1) {
			//System.out.println(ch);
			System.out.println((char)(ch));
			ch=in.read();
		}

	}

}
