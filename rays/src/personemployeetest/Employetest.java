package personemployeetest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employetest {
public static void main(String[] args) {
	
	Employee e = new Employee(01, " arav", " student", " indore");
	Employee e1 = new Employee(02, " parth", " student", " indore");
	Employee e2 = new Employee(03, " monil", " student", " indore");
	
	System.out.println(e.hashCode());
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	System.out.println(e.equals(e1));
	
   List l = new ArrayList();
   
   l.add(e);
   l.add(e1);
   l.add(e2);
   
   System.out.println(l);
   
   Iterator it = l.iterator();
   while(it.hasNext());
   Employee p = (Employee)it.next();
   System.out.println(p);
}
}
