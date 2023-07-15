package javaiosttream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class filewri {

	public static void main(String[] args) throws Exception {
		FileReader f = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\hello.txt");
		int ch = f.read();
		while(ch!=-1) {
			System.out.println((char)(ch));
			ch = f.read();
		}
		FileReader f1 = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\hello.txt");
		BufferedReader bf = new BufferedReader(f1);
		String l = bf.readLine();
		while(l!=null) {
			System.out.println(l);
			l=bf.readLine();
		}
		
//	 FileWriter f1 = new FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\hello.txt");
//     f1.write(" how are you ");
//     f1.write("mele babu ne khana khaya");
//     f1.close();
//	}
		FileReader f2 = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\hello.txt");
		Scanner s = new Scanner(f2);
		while(s.hasNext()) {
			System.out.println(s.nextLine());
		}s.close();
		f1.close();

	}
	}

