package callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableTestIn {

	public static void main(String[] args) throws Exception {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
	  CallableStatement call = con.prepareCall("{call emp(?)}");
	  call.setInt(1, 2);
	  call.execute();
	  ResultSet rs = call.getResultSet();
	  while(rs.next()) {
		  System.out.print("\t"+rs.getInt(1));
		  System.out.print("\t"+rs.getString(2));
		  System.out.print("\t"+rs.getString(3));
		  System.out.print("\t"+rs.getString(4));
		  System.out.print("\t"+rs.getString(5))
		  ;
		  }

	}

}
