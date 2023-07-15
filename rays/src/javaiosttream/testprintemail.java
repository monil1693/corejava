package javaiosttream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class testprintemail {

	public static void main(String[] args) throws Exception {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		PrintWriter pw = new PrintWriter("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\hel.txt");

		String line = bf.readLine();

		while (!(line.equals("quit"))) {
		if(line.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {

			pw.println(line);
			
		}line = bf.readLine();
		}
		
		in.close();
		bf.close();
		pw.close();

	}
}
