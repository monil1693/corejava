package TestMarksheet;

import MarksheetBean.MarksheetBean;
import MarksheetModel.MarksheetModel;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		testadd();
		
	}

	private static void testadd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(11);
		bean.setname("honey singh");
		bean.setMaths(99);
		bean.setChemistry(92);
		bean.setPhysics(9);
		
		MarksheetModel model = new MarksheetModel();
		model.testadd(bean);
		System.out.println("data inserted");
		
		
		
	}

}
