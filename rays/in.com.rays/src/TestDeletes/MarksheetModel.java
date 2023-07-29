package TestDeletes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModel {
	
	public static void testdelete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement p = conn.prepareStatement("delete from marksheet where id = ?");
		
		p.setInt(1, id);
		int i = p.executeUpdate();
		System.out.println("data deleted = "+ i);
	}

//	public static void delete() {
//		// TODO Auto-generated method stub
//		
//	}

}
