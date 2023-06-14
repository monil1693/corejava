package collectiontest;

import java.util.*;
//import java.util.Collections;
//import java.util.List;

public class TestEmp {

	public static void main(String[] args) {
		List list= new ArrayList();
		
		list.add(new Emp(3, " monil", " indore"));
		list.add(new Emp(1, " nandu", " bombay"));
		list.add(new Emp(4, " akshay", " dewas"));
		list.add(new Emp(5, " saroj", " ujjain")); 
		list.add(new Emp(2, " veenie", " ratlam"));
		
		Collections.sort(list);
		for (Object object : list) {
			System.out.println(object);
			
		}
		Collections.sort(list, new Orderbyname());
		for (Object object : list) {
		System.err.println(object);	
		}
		
		Collections.sort(list, new Orderbyaddress());
		for (Object object : list) {
			System.out.println(object);
			
		}
	}
}
