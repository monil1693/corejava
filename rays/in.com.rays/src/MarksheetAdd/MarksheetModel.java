package MarksheetAdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Update.MarksheetBean;

public class MarksheetModel {
	public void testadd(MarksheetAdd.MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement p = conn.prepareStatement("insert into marksheet values (?,?,?,?,?)");

		p.setInt(1,bean.getId() );
		p.setString(2,bean.getName());
		p.setInt(3, bean.getChemistry());
		p.setInt(4, bean.getMaths());
		p.setInt(5, bean.getPhysics());
		
		int i = p.executeUpdate();
	    System.out.println("databases added="+ i);
		
		
	}

	
}
