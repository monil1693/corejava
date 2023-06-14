package exercisetest;

import java.util.ArrayList;
import java.util.List;

public class Tosortlmbda {

	public static void main(String[] args) {
	 List l = new ArrayList();
	 l.add("1");
	 l.add("3");
	 l.add("2");
	 l.add("5");
	 l.add("4");
	 l.add("2");
	 l.add("5");
	 l.forEach(e->{System.out.println(e);});
	 l.stream().sorted().forEach(e->{System.out.println(e);});//arrange in ascending order
	 l.stream().sorted().distinct().forEach(e->{System.out.println(e);});//this won't print duplicate  
	}

}
