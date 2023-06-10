package employee;

import interferace.businessman;

public class Testrisobus {

	public static void main(String[] args) {
		Businessman rm = new Businessman();
		socialwork sm = new Businessman();
		businessman bm= new businessman();
		
		rm.donation();
		rm.helpothers();
		sm.helpothers();
		bm.partyhard();
		bm.earnmoney();

	}

}
