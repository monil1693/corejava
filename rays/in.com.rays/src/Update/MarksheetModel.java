package Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {
	
	
public void testupdate( MarksheetBean m)throws Exception {
	
	 Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
	   PreparedStatement p = con.prepareStatement("update marksheet set name =? , physics = ? , maths = ? , chemistry = ? where id = ?");
	   p.setString(1, m.getName());
	   p.setInt(2, m.getPhysics());
	   p.setInt(3, m.getMaths());
	   p.setInt(4, m.getChemistry());
	   p.setInt(5, m.getId());
	   
	   
	   
	   int i = p.executeUpdate();
	   System.out.println("database updated="+i);
	   
	   
	}
 public List search() throws Exception {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
	 PreparedStatement p = c.prepareStatement("select * from marksheet");
	 ResultSet rs = p.executeQuery();
	 ArrayList a = new ArrayList();
	 while(rs.next()) {
		 MarksheetBean bean = new MarksheetBean();
		 bean.setId(rs.getInt(1));
		 bean.setName(rs.getString(2));
		 bean.setMaths(rs.getInt(3));
		 bean.setPhysics(rs.getInt(4));
		 bean.setChemistry(rs.getInt(5));
		 a.add(bean);
	 }
	 
	return a;
	
}
	
  

}
