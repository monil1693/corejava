package callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class callinout {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		CallableStatement call = con.prepareCall("{call empinout(?)}");
		
		call.setInt(1, 1);
		call.registerOutParameter(1, Types.INTEGER);
		call.execute();
		System.out.println(call.getInt(1));
		

	}

}
