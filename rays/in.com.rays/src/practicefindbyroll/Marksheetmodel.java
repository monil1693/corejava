package practicefindbyroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Marksheetmodel {
	public MarksheetBean findbyid(int id)  throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement p = c.prepareStatement("select * from marksheet where id = ?");
		
		p.setInt(1, id);
		ResultSet rs = p.executeQuery();
		MarksheetBean m = null;
		while (rs.next()) {
			
			m = new MarksheetBean();
			m.setId(rs.getInt(1));
			m.setName(rs.getString(2));
			m.setMaths(rs.getInt(3));
			m.setPhysics(rs.getInt(4));
			m.setChmeistry(rs.getInt(5));
			
		} return m;
		
		
		
		
	}
	
	

}
