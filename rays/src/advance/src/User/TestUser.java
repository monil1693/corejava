package User;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUser {

	public static void main(String[] args) throws Exception {
//	    testadd();
//		TestUpdate();
//		TestDelete();
//		FindbyId();
		listSearch();
//		Search2();
//      search3();
//		testauthenticate();
		
	
		
		
		
	}

		private static void testauthenticate() throws Exception {
			UserModel um = new UserModel();
			UserBean ub = um.authentication("monil@gmail.com", "1234");
  
			
			if (ub!= null) {
				System.out.println("login id & password is valid");
				System.out.print("\t"+ ub.getId());
				System.out.print("\t"+ ub.getFirstname());
				System.out.print("\t"+ ub.getLastName());
				System.out.print("\t"+ ub.getLoginId());
				System.out.print("\t"+ ub.getPassword());
				System.out.print("\t"+ ub.getDob());
				System.out.print("\t"+ ub.getAddress());
			}else {
				System.out.println("not valid");
			}
		
	}

		private static void search3() throws Exception {
			UserBean ub = new UserBean();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
		     
		     ub.setDob(sdf.parse("1990-01-10"));
		     UserModel um = new UserModel();
		     List list = um.search3(ub);
		     
		     Iterator it =list.iterator(); 
		     while(it.hasNext()) {
		    	 ub = (UserBean)it.next();
		        
		    	 System.out.println(ub.getId());
				System.out.println(ub.getFirstname());
				System.out.println(ub.getLastName());
				System.out.println(ub.getLoginId());
				System.out.println(ub.getPassword());
				System.out.println(ub.getDob());
				System.out.println(ub.getAddress());
				
			}
			
		
		
	}

		private static void Search2() throws Exception {
			UserBean ub = new UserBean();
			UserModel um = new UserModel();
			List list = um.Search2(ub);
			Iterator it = list.iterator();
			
			while (it.hasNext()) {
				 ub = (UserBean)it.next();
				
				 System.out.print("\t"+ub.getId());
				System.out.print("\t"+ ub.getFirstname());
				System.out.print("\t"+ub.getLastName());
				System.out.print("\t"+ub.getLoginId());
				System.out.print("\t"+ub.getPassword());
				System.out.print("\t"+ub.getDob());
				System.out.println("\t"+ub.getAddress());
			}
		
		
	}

		private static void listSearch()throws Exception {
			UserBean ub = new UserBean();
			UserModel um = new UserModel();
			List list = um.Search(ub ,1 ,15);
			Iterator it = list.iterator();
			
			while (it.hasNext()) {
				 ub = (UserBean)it.next();
				
				 System.out.print("\t"+ub.getId());
				System.out.print("\t"+ ub.getFirstname());
				System.out.print("\t"+ub.getLastName());
				System.out.print("\t"+ub.getLoginId());
				System.out.print("\t"+ub.getPassword());
				System.out.print("\t"+ub.getDob());
				System.out.println("\t"+ub.getAddress());
			}
			
		
		
	}

		private static void FindbyId() throws Exception{
			UserModel um = new UserModel();
			UserBean ub = um.FindbyId(2);
			
			if (ub==null) {
				System.out.println("database does not exist");
			}else {
				System.out.println(ub.getId());
				System.out.println(ub.getFirstname());
				System.out.println(ub.getLastName());
				System.out.println(ub.getLoginId());
				System.out.println(ub.getPassword());
				System.out.println(ub.getDob());
				System.out.println(ub.getAddress());
			}
		
		
	}

		private static void TestDelete() throws Exception {
		  UserModel.TestDelete(5);
	}

		private static void TestUpdate() throws Exception {
			UserBean u = new UserBean();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			u.setId(4);
			u.setFirstname("raja");
			u.setLastName("soni");
			u.setLoginId("rajat@gmail");
			u.setPassword("1234");
			u.setDob(sdf.parse("1993-01-30"));
			u.setAddress("indore");
			UpdateModel um = new UpdateModel();
			um.Update(u);
		
			
		}

	private static void testadd() throws Exception{
		UserBean u = new UserBean();
		UserModel um = new UserModel();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		u.setId(2);
		u.setFirstname("rajat");
		u.setLastName("soni");
		u.setLoginId("rajat@gmail.com");
		u.setPassword("1234");
		u.setDob(sdf.parse("1993-01-30"));
		u.setAddress("indore");
		um.add(u);
		
		
	}

}
