package com.ray.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestRead {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://local:3307/marksh", "root", "root");
	    Statement s = c.createStatement();
	    ResultSet rs = s.executeQuery("select * from marksh");
	    while(rs.next()) {
	    	System.out.println("\t"+ rs.getInt(1));
	    }

	}

}
