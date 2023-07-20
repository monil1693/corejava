package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Transaction {

	public static void main(String[] args) throws Exception {
//		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb","root", "root");
		
	    try{con.setAutoCommit(false);
		Statement p = con.createStatement();
//		Statement p1 = con.createStatement();
		
		int i = p.executeUpdate("insert into user values (15,'ravi','ojha','ravi@gmail.com','1234','1993-04-16','indore')");
		int i1 = p.executeUpdate("insert into user values (16,'ravi','ojha','ravi@gmail.com','1234','1993-04-16','indore')");	
		System.out.println("database updated " + i );
		con.commit();
			
		} catch (Exception e) {
//			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/adb","root", "root");
			con.rollback();
			System.out.println("data not inserted");
		}
		
		
	}

}

