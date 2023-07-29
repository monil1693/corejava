package incomraystest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import incomraysbean.UserBean;
import incomraysmodel.UserModel;

public class TestUser{
	public static void main(String[] args) throws Exception {

//    testadd();
//	TestUpdate();
	TestDelete();
//	FindbyId();
//	listSearch();
//  searchbydob();
//	testauthenticate();
//		TestSearch1();
//	testfirstname();
//	testpk();
	
}

	private static void testpk() throws Exception {
			UserModel um = new UserModel();
			UserBean ub = um.findbypk(2);

			
			if (ub!= null) {
				System.out.println("id is present");
				System.out.print("\t"+ ub.getId());
				System.out.print("\t"+ ub.getFirstName());
				System.out.print("\t"+ ub.getLastName());
				System.out.print("\t"+ ub.getLoginId());
				System.out.print("\t"+ ub.getPassword());
				System.out.print("\t"+ ub.getDob());
				System.out.print("\t"+ ub.getAddress());
			}else {
				System.out.println("not valid");
			}
		
	}

	private static void testfirstname() {
		
//		UserModel um = new UserModel();
//		UserBean ub = 
	}

	private static void testauthenticate() throws Exception {
		UserModel um = new UserModel();
		UserBean ub = um.authentication("monil@gmail.com", "1234");

		
		if (ub!= null) {
			System.out.println("login id & password is valid");
			System.out.print("\t"+ ub.getId());
			System.out.print("\t"+ ub.getFirstName());
			System.out.print("\t"+ ub.getLastName());
			System.out.print("\t"+ ub.getLoginId());
			System.out.print("\t"+ ub.getPassword());
			System.out.print("\t"+ ub.getDob());
			System.out.print("\t"+ ub.getAddress());
		}else {
			System.out.println("not valid");
		}
	
}

	private static void searchbydob() throws Exception {
		UserBean ub = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
	     
//	     ub.setDob(sdf.parse("1990-01-10"));
	     UserModel um = new UserModel();
	     List list= (List) um.testfind(sdf.parse("1993-04-16"));
	     
	     Iterator it =list.iterator(); 
	     while(it.hasNext()) {
	    	 ub = (UserBean)it.next();
	        
	    	 System.out.println(ub.getId());
			System.out.println(ub.getFirstName());
			System.out.println(ub.getLastName());
			System.out.println(ub.getLoginId());
			System.out.println(ub.getPassword());
			System.out.println(ub.getDob());
			System.out.println(ub.getAddress());
			
		}
		
	
	
}

	private static void TestSearch1() throws Exception {
		UserBean ub = new UserBean();
		UserModel um = new UserModel();
//		List list = (List)um.Search(ub);
//		Iterator it = list.iterator();
		
//		while (it.hasNext()) {
//			 ub = (UserBean)it.next();
			
			 System.out.print("\t"+ub.getId());
			System.out.print("\t"+ ub.getFirstName());
			System.out.print("\t"+ub.getLastName());
			System.out.print("\t"+ub.getLoginId());
			System.out.print("\t"+ub.getPassword());
			System.out.print("\t"+ub.getDob());
			System.out.println("\t"+ub.getAddress());
		}
	
	
//}

	private static void listSearch()throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserBean ub = new UserBean();
		UserModel um = new UserModel();
//		ub.setFirstName("monil");
//		ub.setLoginId("monil@gmail.com");
		ub.setDob(sdf.parse("1993-04-16"));
		List list = um.search(ub, 0, 0);
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			 ub = (UserBean)it.next();
		if (ub!=null) {	
			 System.out.print("\t"+ub.getId());
			System.out.print("\t"+ ub.getFirstName());
			System.out.print("\t"+ub.getLastName());
			System.out.print("\t"+ub.getLoginId());
			System.out.print("\t"+ub.getPassword());
			System.out.print("\t"+ub.getDob());
			System.out.println("\t"+ub.getAddress());
		}
	}
	}
	
//
//	private static void FindbyId() throws Exception{
//		UserModel um = new UserModel();
//		UserBean ub = um.FindbyId(2);
//		
//		if (ub==null) {
//			System.out.println("database does not exist");
//		}else {
//			System.out.println(ub.getId());
//			System.out.println(ub.getFirstName());
//			System.out.println(ub.getLastName());
//			System.out.println(ub.getLoginId());
//			System.out.println(ub.getPassword());
//			System.out.println(ub.getDob());
//			System.out.println(ub.getAddress());
//		}
//	
	
//}

	private static void TestDelete() throws Exception {
	UserModel model = new UserModel();
	model.testDelete(49);
	 
}

	private static void TestUpdate() throws Exception {
		UserBean u = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		u.setId(4);
		u.setFirstName("raja");
		u.setLastName("soni");
		u.setLoginId("rajat@gmail");
		u.setPassword("1234");
		u.setDob(sdf.parse("1993-01-30"));
		u.setAddress("indore");
		UserModel um = new UserModel();
		um.update(u);
	
		
	}

private static void testadd() throws Exception{
	UserBean u = new UserBean();
	UserModel um = new UserModel();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	u.setId(2);
	u.setFirstName("rajat");
	u.setLastName("soni");
	u.setLoginId("rajat@gmail.com");
	u.setPassword("1234");
	u.setDob(sdf.parse("1993-01-30"));
	u.setAddress("indore");
	um.Add(u);
	
	
}


}
