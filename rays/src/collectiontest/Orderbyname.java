package collectiontest;

import java.util.Comparator;

public class Orderbyname implements Comparator <Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
	

}
