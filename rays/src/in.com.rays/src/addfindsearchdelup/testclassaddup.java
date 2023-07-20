package addfindsearchdelup;

import java.util.Iterator;
import java.util.List;

public class testclassaddup {

	public static void main(String[] args) throws Exception {
//		testadd();
//		testfindbyid();
//		testupdate();
//		testdelete();
		listsearch();
	}

	private static void listsearch() throws Exception{
		MarksheetBean mb = new MarksheetBean();
		MarksheetModel mm = new MarksheetModel();
		List list = mm.search(null,1,3);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			
			mb = (MarksheetBean)it.next();
			System.out.print("\t"+mb.getId());
			System.out.print("\t"+mb.getName());
			System.out.print("\t"+mb.getMaths());
			System.out.print("\t"+mb.getChemistry());
			System.out.print("\t"+mb.getPhysics());
			System.out.println();
		}
		
		
	}

	private static void testdelete() throws Exception {
		MarksheetModel.testdelete(6);
		
	}

	private static void testupdate() throws Exception{
		MarksheetBean mb = new MarksheetBean();
		mb.setId(1);
		mb.setName("abc");
		mb.setChemistry(20);
		mb.setMaths(30);
		mb.setPhysics(10);
		MarksheetModel mm = new MarksheetModel();
		mm.testupdate(mb);		
		
	}

	private static void testfindbyid() throws Exception {
		MarksheetModel mm = new MarksheetModel();
		MarksheetBean bean = mm.testfindbyid(2);
		
		if (bean==null) {
			System.out.println("Database not existed");
		}else {
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());
			System.out.println(bean.getPhysics());
		}
		
		
	}

	private static void testadd() throws Exception{
		MarksheetBean mb = new MarksheetBean();
		mb.setId(6);
		mb.setName("bani");
		mb.setChemistry(20);
		mb.setMaths(20);
		mb.setPhysics(30);
		MarksheetModel mm = new MarksheetModel();
		mm.testadd(mb);
		
		
	}

}
