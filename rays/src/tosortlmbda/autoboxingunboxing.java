package tosortlmbda;

import java.util.ArrayList;
import java.util.List;

public class autoboxingunboxing {

	public static void main(String[] args) {
	List l = new ArrayList();
	l.add("10");
	l.add("22");
	l.add("13");
	l.add("42");
	l.add("25");
	l.add("22");
	l.add("25");
 //l.stream().sorted().forEach(e->{System.out.println(e);});
 l.stream().sorted().distinct().forEach(e->{System.out.println(e);});
	}

}
