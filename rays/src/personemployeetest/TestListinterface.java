package personemployeetest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;

public class TestListinterface {
	public static void main(String[] args) {
		Person p1= new Person(1," monil", " indore");
		Person p2= new Person(1," monil", " indore");
		Person p3= new Person(3," monil", " indore");
		
		List l = new ArrayList();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		
		Iterator it = l.iterator();
		while(it.hasNext()) {
			Person p = (Person)it.next();
			
			System.out.println(p);
			
			System.out.println(p1.equals(p2));
			//System.out.println(p1.equals(p2));
			System.out.println(p.getName()); 
			System.out.println(p.getId());
			
		}
	}

}
