package personemployeetest;

import java.util.HashMap;

public class testmap {

	public static void main(String[] args) {
		HashMap m1=new HashMap();
		m1.put("1", "rajat");
		m1.put("2", "monil");
		m1.put("3", "arun");
		
		System.out.println(m1);
		//m1.clear();
		System.out.println(m1.containsKey("1"));
		
		System.out.println(m1.containsValue("arun"));
		System.out.println(m1.entrySet());
		System.out.println(m1.get("3"));
		System.out.println(m1.isEmpty());
		System.out.println(m1.keySet());
		System.out.println(m1.put("3", "rahul"));
		System.out.println(m1);
		System.out.println(m1.remove("2"));
		System.out.println(m1);
		System.out.println(m1.size());
		System.out.println(m1.values());
		m1.put("2", "monil");
		m1.put("4", "rahul");
		System.out.println(m1);

	}

}
