package javaiosttream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Filereadwritebuff {

	public static void main(String[] args) throws Exception{
		FileReader f = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\helloo.txt");
		int ch = f.read();
		while(ch!=-1) {
			System.out.println((char)(ch));
			ch=f.read();}
		FileReader f1 = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\helloo.txt");
		BufferedReader n = new BufferedReader(f1);
		String l = n.readLine();
		while(l!=null){
			System.out.println(l);
			l =n.readLine();}
		
		Scanner s = new Scanner(f1);
		while(s.hasNext()) {
			System.out.println(s.nextLine());
		} f1.close();
		s.close();
		
		
		
		
		FileWriter f2 = new FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\helloo.txt",true);
		f2.write(" -how are you java");
		f2.write(" - what help do you want");
		f2.close();
		
	}
	

}
