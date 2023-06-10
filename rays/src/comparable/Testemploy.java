package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testemploy {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new employee(0, " arun"," indore"));
		list.add(new employee(1, " anshul", " bhopal"));
		list.add(new employee(2, " pran", " dewas"));
		list.add(new employee(3, " saroj", " dehradun"));
		list.add(new employee(4, " nandita", " mumbai"));
		list.add(new employee(5, " monil", " mumbai"));
		list.add(new employee(6, " mon", " mumbai"));
		list.add(new employee(7, " moni", " mumbai"));
		list.add(new employee(8, " monil", " mumbai"));
		//Collections.sort(list);
       for (Object object : list) {
    	   System.out.println(object);
		
	}
		
	}

}
