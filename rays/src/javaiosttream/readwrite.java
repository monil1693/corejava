package javaiosttream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class readwrite {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
FileReader f = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\helloo.txt");
FileWriter w = new  FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\hell");
BufferedReader  b = new BufferedReader(f);
PrintWriter p = new PrintWriter(w);
String s =b.readLine();
while(s!=null) {
	
}
	}

}
