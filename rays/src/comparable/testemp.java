package comparable;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Collections;
//import java.util.List;
import java.util.*;

public class testemp {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add(new employee(0, " arun"," indore"));
	list.add(new employee(1, " anshul", " bhopal"));
	list.add(new employee(2, " pran", " dewas"));
	list.add(new employee(3, " saroj", " dehradun"));
	list.add(new employee(4, " nandita", " mumbai"));
	list.add(new employee(5, " monil", " mumbai"));
	list.add(new employee(6, " monil", " mumbai"));
	Collections.sort(list);
	for (Object object : list) {
		System.out.println(object);
	}
}
}
