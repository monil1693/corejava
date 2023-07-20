package incomraystest;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import incomraysbean.UserBean;
import incomraysmodel.UserModel;

public class TestUser {

	public static void main(String[] args) throws Exception{
//		testInsert();
//		testupdate();
//		testdelete();
//        testfindbydob();
		printall();
	}

	private static void printall() throws Exception {
		UserBean ub = new UserBean();
		UserModel um = new UserModel();
		List list = um.list(ub ,2, 5);
	    Iterator it = list.iterator();
	    while(it.hasNext()) {
	    	ub = (UserBean)it.next();
	    	
	    	System.out.print("\t"+ub.getId());
			System.out.print("\t"+ ub.getFirstName());
			System.out.print("\t"+ub.getLastName());
			System.out.print("\t"+ub.getLoginId());
			System.out.print("\t"+ub.getPassword());
			System.out.print("\t"+ub.getDob());
			System.out.println("\t"+ub.getAddress());
	    }
		
		
	}

	private static void testfindbydob() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		UserModel um = new UserModel();
		UserBean ub = um.testfind(sdf.parse("16-04-1993"));
		
//		if (ub !=null) {
			if (ub == null) {
				System.out.println("date doesnt exist");
			}else 
			System.out.println(ub.getId());
			System.out.println(ub.getFirstName());
			System.out.println(ub.getLastName());
			System.out.println(ub.getLoginId());
			System.out.println(ub.getPassword());
			System.out.println(ub.getDob());
			System.out.println(ub.getAddress());
		}
		
//		}
//	}

	private static void testdelete() throws Exception {
		UserModel um = new UserModel();
		um.testDelete(14);
		 
		
		
	}

	private static void testupdate()throws Exception {
		UserModel um =  new UserModel();
		UserBean ub = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		ub.setId(18);
		ub.setFirstName("ravi");
		ub.setLastName("bairagi");
		ub.setLoginId("ravi@gmail.com");
		ub.setPassword("4321");
		ub.setDob(sdf.parse("1991-01-12"));
		ub.setAddress("indore");
		um.update(ub);
		
	}

	private static void testInsert() throws Exception {
      UserModel um = new UserModel();
      UserBean ub = new UserBean();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      
      ub.setId(19);
      ub.setFirstName("aryan");
      ub.setLastName("ojha");
      ub.setLoginId("arun@gmail.com");
      ub.setPassword("123");
      ub.setDob(sdf.parse("1997-01-19"));
      ub.setAddress("indore");
      um.Add(ub);
      
		
	}

}
