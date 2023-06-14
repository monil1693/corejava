package exercisetest;
import java.util.Enumeration;
import java.util.Vector;

import collectiontest.Emp;

public class vectorlist {

	public static void main(String[] args) {
	Vector v = new Vector();
		v.add("1");
	v.add("one");
	v.add("two");
	v.add("3");
	v.add("four");
	
	Enumeration e = v.elements();
	v.add("400");
	
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}