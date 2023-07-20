package advance;

import java.util.Iterator;
import java.util.List;

public class TestSearch {

	public static void main(String[] args) throws Exception {
		testsearch();
		
		MarksheetBean mb = new MarksheetBean();
		mb.setId(1);
		mb.setName("ra");
		MarksheetModel m = new MarksheetModel();
		List list = m.search();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			mb = (MarksheetBean)it.next();
			System.out.print(mb.getName());
			System.out.print(mb.getId());
			System.out.print(mb.getChemistry());
			System.out.print(mb.getPhysics());
			System.out.print(mb.getMaths());

	}
	}

	private static void testsearch() {
		// TODO Auto-generated method stub
		
	}
}
