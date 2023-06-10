package personemployeetest;

import java.util.ArrayList;
import java.util.List;

public class Testlist2 {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("monil");
	al.add("100");
	
	ArrayList al2 = new ArrayList();
	al2.add("arun");
	al2.add("200");
	
	System.out.println(al);
	System.out.println(al2);
	
	//System.out.println(al.add(al2));
	System.out.println(al);
	
	
	al.get(1);
	System.out.println(al.get(1));
	System.out.println(al.get(0));
	
	
	System.out.println(al.remove(1));
	System.out.println(al);
	
	al.set(0, "monil");
	System.out.println(al);
	
	al.subList(0, 1);
	System.out.println(al);
	
al2.indexOf(1);
System.out.println(al2);


	al.indexOf(0);
	System.out.println(al);

	al.lastIndexOf(al);
	System.out.println(al);
	
	al2.lastIndexOf("arun");
	System.out.println(al2.lastIndexOf("200"));
	
}
}
