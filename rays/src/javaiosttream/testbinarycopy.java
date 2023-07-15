package javaiosttream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class testbinarycopy {

	public static void main(String[] args) throws Exception {
	String source = "C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\hello.txt";
	String target = "C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\hnew.txt";
	FileInputStream fi = new FileInputStream(source);
	FileOutputStream fo = new FileOutputStream(target);
	
	int ch = fi.read();
	while (ch!=-1){
		fo.write(ch);
		ch=fi.read();
		
	}fi.close();
	fo.close();
}
	}
