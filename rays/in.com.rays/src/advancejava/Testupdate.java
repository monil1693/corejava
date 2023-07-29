package advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Testupdate {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksh", "root", "root");
		Statement s = c.createStatement();
		int i = s.executeUpdate("insert into marksh values (19,'arav',60,70,80 )");
		System.out.println("database updated"+i);
		
				
	}

}
