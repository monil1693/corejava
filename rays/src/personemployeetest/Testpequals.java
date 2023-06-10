package personemployeetest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Testpequals {
	public static void main(String[] args) {
		
		Person p1= new Person(1," monil", " indore");
		Person p2= new Person(2," rajat", " indore");
		Person p3= new Person(3," rahul", " indore");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
        //System.out.println(p3.hashCode());
		
		List list = new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println(list);
		Iterator it = list.iterator();
		while(it.hasNext());
		Person p = (Person) it.next();
		System.out.println(p);
		System.out.println(p.getName());
	}

}
