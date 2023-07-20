package Update;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {
		testupdate();
		
		

	}

	private static void testupdate() throws Exception{
		MarksheetBean m = new MarksheetBean();
		
		m.setId(1);
		m.setName("lata");
		m.setMaths(99);
		m.setChemistry(99);
		m.setPhysics(99);
		MarksheetModel mm = new MarksheetModel();
		mm.testupdate(m);
		
	}

}
