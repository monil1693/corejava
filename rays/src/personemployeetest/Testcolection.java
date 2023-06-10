package personemployeetest;

import java.util.ArrayList;
import java.util.Collection;

public class Testcolection {
	public static void main(String[] args) {
		Collection list = new ArrayList();
		Collection list2 = new ArrayList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		list2.add("four");
		list2.add("five");
		list2.add("six");
		System.out.println(list);
		
		list.addAll(list2);
		System.out.println(list);
		
		//list.clear();
		//System.out.println(list);
		
		System.out.println(list.contains("two"));
		
		System.out.println(list.containsAll(list2));
		
		System.out.println(list.isEmpty());
		
		//System.out.println(list.removeAll(list2));
		
		list.remove("one");
		
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list2.size());
		System.out.println(list.retainAll(list));
		
		
		//System.out.println(list2.size());
	}

}
