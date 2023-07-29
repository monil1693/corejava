package serachrollno;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {
		testsearch();

	}

	private static void testsearch() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		MarksheetModel m = new MarksheetModel();
		
		List list = m.search();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			bean = (MarksheetBean)it.next(); 
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getChemistry());
			
		}
	 
		
	}

}
