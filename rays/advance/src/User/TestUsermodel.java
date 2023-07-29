package User;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestUsermodel {

	public static void main(String[] args) throws Exception{
		TestUpdate();
		

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

}
