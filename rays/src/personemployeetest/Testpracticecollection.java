package personemployeetest;

import java.util.ArrayList;
import java.util.Collection;

public class Testpracticecollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c= new ArrayList();
		Collection c2= new ArrayList();
		
		c.add(10);
		c.add("monil");
		
		c2.add(20);
		c2.add("arun");
		
		c.add(c2);
		System.out.println(c.add(c2));
		System.out.println(c);
		
		c.addAll(c2);
		System.out.println(c);
		
		//c.clear();
		
		System.out.println(c.contains(0));
		
		System.out.println(c.containsAll(c));
		
		System.out.println(c.equals(c2));
		
		
		c2.remove(20);
		System.out.println(c2);
		
		System.out.println(c.remove(10));
		
		System.out.println(c);
		
		//c.removeAll(c);
		//System.out.println(c2);
		
		//c.retainAll(c2);
		System.out.println(c);
		
		c.size();
		System.out.println(c.size());

	}

}
