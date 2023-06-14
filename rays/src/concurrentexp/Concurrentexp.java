package concurrentexp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import rays.object;

public class Concurrentexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add("one");
		list.add("1");
		list.add("two");
		list.add("2");
		
		Iterator it = list.iterator();
		list.add("300");
		while(it.hasNext()) {
		
		System.out.println(it.next());
	}
}
}