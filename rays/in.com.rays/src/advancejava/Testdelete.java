package advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Testdelete {

	public static void main(String[] args) throws Exception {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksh", "root", "root");
       Statement s = c.createStatement();
       int i = s.executeUpdate("delete from marksh where id = 19");
       System.out.println("database updated=" + i);

	}

}
