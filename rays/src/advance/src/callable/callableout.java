package callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class callableout {

	public static void main(String[] args) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		  CallableStatement call = con.prepareCall("{call empout(?)}");
		
		  call.registerOutParameter(1, Types.INTEGER);
		  call.execute();
			  System.out.print("\t"+ call.getInt(1));
//			  System.out.print("\t"+ call.getString(2));
//			  System.out.print("\t"+rs.getString(3));
//			  System.out.print("\t"+rs.getString(4));
//			  System.out.print("\t"+rs.getString(5))
			  ;
			  }

		}
		
