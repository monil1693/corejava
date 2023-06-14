package javaiosttream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferread {

	public static void main(String[] args) throws IOException {
	FileReader in = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\New folder (2)\\hello.txt");
     BufferedReader n = new BufferedReader(in);
     String l = n.readLine();
     while(l!=null) {
    	 System.out.println(l);
    	 l=n.readLine();
     }
	}

}
