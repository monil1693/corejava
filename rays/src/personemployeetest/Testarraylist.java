package personemployeetest;

import java.util.ArrayList;

public class Testarraylist {

	public static void main(String[] args) {
	 ArrayList ar = new ArrayList();
	 ArrayList ar1 = new ArrayList();
	 
	 ar.add("10,11,12,15,16");
	 ar.add("monil");
	 ar.add(01, "indore");
	 
	 ar1.add("11,12,13,14");
	 ar1.add("arun");
	 ar1.add(02, "indore");
	 
	 ar.add(ar1);
	 System.out.println(ar);
	 
	 System.out.println(ar.get(1));

	 System.out.println(ar.remove(1));
	 System.out.println(ar1.remove(1));
	 System.out.println(ar);
	 
	 ar.set(1, "indore");
	 System.out.println(ar);
	 
	 ar1.set(1, "arun");
	 System.out.println(ar1);
	 
	 ar.add("monil");
	
	 System.out.println(ar.subList(0, 1));
	 System.out.println(ar);
	 System.out.println(ar.indexOf("indore"));
	 System.out.println(ar.lastIndexOf("indore"));
	 System.out.println(ar1.indexOf("11,12,13,14"));
	 System.out.println(ar1.lastIndexOf("monil")); 
	 
	 System.out.println(ar);
	 //System.out.println(ar.indexOf("11"));
	}

}
