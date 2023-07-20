package advance;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {
		MarksheetModel m = new MarksheetModel();
		List list = m.search();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			MarksheetBean mb = (MarksheetBean)it.next();
			System.out.print("\t"+mb.getId());
			System.out.print("\t"+mb.getName());
			System.out.print("\t"+mb.getChemistry());
			System.out.print("\t"+mb.getMaths());
		    System.out.print("\t"+mb.getPhysics());
		    System.out.println();
		}
		

	}
	
 

}
