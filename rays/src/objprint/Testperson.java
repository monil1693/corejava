package objprint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Testperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee p = new employee(10, " monil", " indore");
		employee p2=new employee(10, " monil", " indore");
		//System.out.println(p);
		//System.out.println(p2);
		
	    List n = new ArrayList();
	    n.add(p);
	    n.add(p2);
	    
	    System.out.println(n);
	    System.out.println(p.equals(p2));
	    System.out.println(p.hashCode());
	    System.out.println(n.hashCode());
	    System.out.println(p2.equals(p));
	    System.out.println(n);
	    System.out.println(n.contains(10));
	    System.out.println(n.get(0));
	    //System.out.println(n.remove(0));
	    
	    System.out.println(n.set( 0, "rajat"));
	    System.out.println(n);
	    System.out.println(n.subList(1, 2));
	    System.out.println(n.indexOf(p2));
	    System.out.println(n.lastIndexOf(p2));
	    n.add("one");
	    System.out.println(n);
	    
	    Iterator it = n.iterator();
	    while(it.hasNext());
	    employee e = (employee)it.next();
	    e.getId();
	    System.out.println(e);

	}

}
