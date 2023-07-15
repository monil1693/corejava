package exercisetest;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Fileread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    FileReader f = new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\babu.txt");
    int a = f.read();
    while(a!=-1) {
    	System.out.println((char)( a));
    	a=f.read();
    }
	}

}
