package practicefindbyroll;

import java.util.List;

import Update.MarksheetModel;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {
	 findbyid();
		

	}

	private static void findbyid() throws Exception{
		Marksheetmodel mm = new Marksheetmodel();
		MarksheetBean mb = mm.findbyid(5);
		
		if (mb==null) {
			System.out.println("doesnot exist");
			
		}else {
			System.out.print(mb.getId());
			System.out.print(mb.getName());
			System.out.print(mb.getMaths());
			System.out.print(mb.getChmeistry());
			System.out.print(mb.getPhysics());
		}
		
		
	}

}
