package javaiosttream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.security.DomainCombiner;

import rays.object;

public class Testexternalizeble {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream file   = new FileOutputStream("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\newemployee.txt");
		ObjectOutputStream o = new ObjectOutputStream(file);
		externalizableemployee e = new externalizableemployee();
		
		e.id="1";
		e.firstname= "monil";
		e.lastname = "chouhan";
		e.salary = 1000;
		
		System.out.println(e.id);
		System.out.println(e.firstname);
		System.out.println(e.lastname);
		o.writeObject(o);
		o.close();
		file.close();

	}

}

class testemployee{
	public static void main(String[]args) {
		FileInputStream file1   = new FileInputStream("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\newemployee1.txt");
		ObjectInputStream o = new ObjectInputStream(file1)
		externalizableemployee e = new externalizableemployee();
		
		
	}
}
