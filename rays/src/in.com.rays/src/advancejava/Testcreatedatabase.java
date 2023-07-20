package advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Testcreatedatabase {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		Statement s = c.createStatement();
		int i = s.executeUpdate("create database adb");
		System.out.println("database created =" +i);
		

	}

}
