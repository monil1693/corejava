package MarksheetModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import MarksheetUtil.JdbcDatasource;



public class MarksheetModel {

	public void testadd(MarksheetBean.MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
//		Connection con = JdbcDatasource.get
		PreparedStatement ps = con.prepareStatement("insert into marksheet values (?,?,?,?,?,?)");
		
	   ps.setInt(1, bean.getId());
	   ps.setString(2, bean.getname());
	   ps.setInt(3, bean.getChemistry());
	   ps.setInt(4, bean.getMaths());
	   ps.setInt(5, bean.getPhysics());
	   ps.setInt(6, bean.getRollno());
	   
	   int i = ps.executeUpdate();
	   System.out.println("databases updated"+i);
		
	}
	
	public void testupdate(MarksheetBean.MarksheetBean mb )throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement ps = con.prepareStatement("update marksheet set name = ? , physics=?, chemistry =?, maths=? where id =?");
		
		ps.setString(1, mb.getname());
		ps.setInt(2, mb.getPhysics());
		ps.setInt(3, mb.getChemistry());
		ps.setInt(4, mb.getMaths());
		ps.setInt(5, mb.getId());
		 
		int i = ps.executeUpdate();
		System.out.println("database updated"+ i);
		
	}
	
	public MarksheetBean.MarksheetBean testdelete(int id ) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from marksheet where id = ? ");
		
		ps.setInt(1, id);
		int i = ps.executeUpdate();
		
		System.out.println("database deleted"+i);
		return null;
		
	}
	public MarksheetBean.MarksheetBean testfind(int id) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from marksheet where id = ?");
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
	      MarksheetBean.MarksheetBean mb = null;
		while (rs.next()) {
			mb = new MarksheetBean.MarksheetBean();
			mb.setId(rs.getInt(1));
			mb.setname(rs.getString(2));
			mb.setMaths(rs.getInt(3));
			mb.setChemistry(rs.getInt(4));
			mb.setPhysics(rs.getInt(5));
			
			
			
		}
		
		
		
		return mb;
		
	}

}
