package MarksheetAdd;

public class TestAdd {

	public static void main(String[] args) throws Exception {
		
		testadd();

	}

	private static void testadd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(6);
		bean.setName("adil");
		bean.setMaths(19);
		bean.setChemistry(29);
		bean.setPhysics(30);
		
		MarksheetModel mm = new MarksheetModel();
		mm.testadd(bean);
		
	}

}
