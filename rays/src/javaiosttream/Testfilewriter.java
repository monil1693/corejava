package javaiosttream;

import java.io.FileWriter;

public class Testfilewriter {

	public static void main(String[] args) throws Exception {
		FileWriter f = new FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\New folder (2)\\hello.txt",true);
		f.write("how are you");
		f.write(" where are you");
		f.close();
		
		

	}

}
