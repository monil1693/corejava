package tosortlmbda;

import java.util.ArrayList;
import java.util.List;

public class Tosortlmbda {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add("0ne");
	l.add("2");
	l.add("three");
	l.add("4");
	l.add("five");
	
	l.forEach(e->{System.out.println(e);});
}
}
