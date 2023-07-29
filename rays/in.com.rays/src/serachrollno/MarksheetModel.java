package serachrollno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Update.MarksheetBean;

public class MarksheetModel {
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
