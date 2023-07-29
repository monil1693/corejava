package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MarksheetModel2 {
 public List search(MarksheetBean bean) throws Exception{
	 Class.forName("com.jdbc.mysql.cj.Driver");
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
	 StringBuffer sb = new StringBuffer("select * form marksheet where 1=1");
	 if (bean != null) {
		 sb.append("and name like'"+ bean.getName());
		 
	 }
	return null;
	 
 }
}
