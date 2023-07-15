package exercisetest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Testprintemail {

	public static void main(String[] args) throws Exception{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		PrintWriter p= new PrintWriter("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\mail.txt");
		
		String line = bf.readLine();
		while(!(line.equals("quit"))) {
			if(line.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
				p.println(line);
				
			}line=bf.readLine();
		}p.close();
		bf.close();
		in.close();
		
	}

}
