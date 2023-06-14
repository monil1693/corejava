package exercisetest;
import java.util.Enumeration;
import java.util.LinkedList;

import collectiontest.Emp;

public class linkedlist {

	public static void main(String[] args) {
	LinkedList v = new LinkedList();
	v.add("1");
	v.add("one");
	v.add("two");
	v.add("3");
	v.add("four");
    v.add("400");
    
    
    System.out.println(v);
    v.add("five");
    System.out.println(v);
    v.addFirst("zero");
    System.out.println(v);
    
    System.out.println(v.getFirst());
    
    v.clear();
    System.out.println(v);
	
}
}