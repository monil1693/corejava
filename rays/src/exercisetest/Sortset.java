package exercisetest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

import rays.object;

public class Sortset {
public static void main(String[]args) {
	//SortedSet s = new TreeSet();
	
	//Queue s = new LinkedList ();
	//Queue s = new PriorityQueue();
	//Deque s = new LinkedList();
	Deque s = new ArrayDeque();
	
	s.add("1");
	s.add("4");
	s.add("2");
	s.add("3");
	
	s.add("two");
	s.add("one");
	s.add("four");
	s.toString();
	
	System.out.println(s);
	
	//for(Object ele:s) {
		//System.out.println(ele);
	//}
	//System.out.println(s);
	
	
}
	
}
