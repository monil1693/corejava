package comparable;

import java.util.Comparator;

class orderbyaddress implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return o1.address.compareTo(o2.address);
	}

	}

