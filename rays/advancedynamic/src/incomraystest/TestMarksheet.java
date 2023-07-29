package incomraystest;

import incomraysbean.MarksheetBean;
import incomraysmodel.MarksheetModel;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {
		testadd();
//		testupdate();
//		testdelete();
//		testfind();
		
		}

	private static void testfind() throws Exception {
		
		MarksheetModel mm = new MarksheetModel();
		MarksheetBean mb = mm.testfind(1);
		
		  
		System.out.println(mb.getId());
		System.out.println(mb.getname());
		System.out.println(mb.getChemistry());
		System.out.println(mb.getMaths());
		System.out.println(mb.getPhysics());
		
		
	}

	private static void testdelete() throws Exception {
		
		MarksheetModel mm = new MarksheetModel();
		MarksheetBean mb = mm.testdelete(5);
		
	}

	private static void testupdate() throws Exception {
		MarksheetBean mb = new MarksheetBean();
		mb.setId(1);
		mb.setname("ravi");
		mb.setChemistry(40);
		mb.setMaths(50);
		mb.setPhysics(30);
		MarksheetModel um = new MarksheetModel();
		um.testupdate(mb);
	
		
	}

	private static void testadd() throws Exception{
MarksheetBean mb = new MarksheetBean();
		
		mb.setId(5);
		mb.setname("raveena");
		mb.setChemistry(30);
		mb.setMaths(40);
		mb.setPhysics(50);
		mb.setRollno(104);
		
		MarksheetModel um = new MarksheetModel();
		um.testadd(mb);
		
	}

}
