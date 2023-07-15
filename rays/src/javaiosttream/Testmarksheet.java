package javaiosttream;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Testmarksheet {

	public static void main(String[] args) throws Exception {
		FileOutputStream o = new FileOutputStream("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\newfile.txt");
		ObjectOutputStream ob = new ObjectOutputStream(o);
		Marksheet m = new Marksheet();
		m.id=11;
		m.name= "monil";
		m.chemistry= 89;
		m.physics= 98;
		m.maths=99;
		//m.total= m.chemistry+m.maths+m.physics;
		ob.writeObject(m);
		System.out.println(m.id);
		System.out.println(m.chemistry);
		System.out.println(m.total);
	
     	o.close();
		ob.close();
		

	}

}
