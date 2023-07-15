package javaiosttream;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Testclass {

	public static void main(String[] args) throws Exception{
		FileInputStream f = new FileInputStream("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\newfile.txt");
		ObjectInputStream os = new ObjectInputStream(f);
		Marksheet m = (Marksheet)os.readObject();
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.chemistry);
		System.out.println(m.physics);
		System.out.println(m.maths);
		
		FileWriter fw = new FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\new1.txt");

	}

}
