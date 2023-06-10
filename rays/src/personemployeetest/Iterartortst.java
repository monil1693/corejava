package personemployeetest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterartortst {

	public static void main(String[] args) {
		Person p1= new Person(01, " monil", " indore");
		Person p2 = new Person(02, " rajat", " indore");
		
		List t = new ArrayList();
		
		t.add(p1);
		t.add(p2);
		
		Iterator it = t.iterator();
			while(it.hasNext()) {
			Person p = (Person)it.next();
			
			System.out.println(p);
		}
		//System.out.println(p);

	}
}

