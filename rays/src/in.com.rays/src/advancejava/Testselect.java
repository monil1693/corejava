package advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testselect {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/marksh", "root", "root");
				Statement s = conn.createStatement();
		        ResultSet r = s.executeQuery("select * from marksh");
		        while(r.next()) {
				System.out.print("\t"+r.getInt(1));
				System.out.print("\t"+r.getString(2));
				System.out.print("\t"+r.getInt(3));
				System.out.print("\t" +r.getInt(4));
				System.out.print("\t" +r.getInt(5));
				System.out.println();

	}

	}

}
