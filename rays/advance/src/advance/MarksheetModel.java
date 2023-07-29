package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
//public List search(MarksheetBean bean) throws Exception{
//	Class.forName("com.jdbc.mysql.cj.Driver");
//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
//	StringBuffer sb = new StringBuffer("select * from marksheet where 1=1");
//	if (bean !=null) {
//		
//		if (bean.getName() !=null && bean.getName().length()>0) {
//			
//		sb.append("and name like '" + bean.getName() + "%'" );
//			
//		}
//		if (bean.getId()>0) {
//			sb.append("and id = '" + bean.getId() + "'");
//		}
//	}
//	System.out.println(sb);
//	PreparedStatement p = con.prepareStatement(sb.toString());
//	ArrayList list = new ArrayList();
//	ResultSet rs = p.executeQuery();
//	while(rs.next()) {
//		bean = new MarksheetBean();
//		bean.setId(rs.getInt(1));
//		bean.setName(rs.getString(2));
//		bean.setChemistry(rs.getInt(3));
//		bean.setMaths(rs.getInt(4));
//		bean.setPhysics(rs.getInt(5));
//	
//	}return list;
//	return null;
	
}
	
//}

