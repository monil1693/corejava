package incomraysmodel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import incomraysbean.MarksheetBean;
import incomraysbean.UserBean;
import incomraysutil.JdbcDatasource;

public class MarksheetModel {
	public void testadd(MarksheetBean bean) throws Exception {
		Connection con = JdbcDatasource.getconnection();
		PreparedStatement ps = con.prepareStatement("insert into marksheet values (?,?,?,?,?)");
		
	   ps.setInt(1, bean.getId());
	   ps.setString(2, bean.getName());
	   ps.setInt(3, bean.getChemistry());
	   ps.setInt(4, bean.getMaths());
	   ps.setInt(5, bean.getPhysics());
	   
	   int i = ps.executeUpdate();
	   System.out.println("databases updated"+i);
		
	}
	
	public void testupdate(MarksheetBean mb )throws Exception {
		Connection con = JdbcDatasource.getconnection();
		PreparedStatement ps = con.prepareStatement("update marksheet set name = ? , physics=?, chemistry =?, maths=? where id =?");
		
		ps.setString(1, mb.getName());
		ps.setInt(2, mb.getPhysics());
		ps.setInt(3, mb.getChemistry());
		ps.setInt(4, mb.getMaths());
		ps.setInt(5, mb.getId());
		 
		int i = ps.executeUpdate();
		System.out.println("database updated"+ i);
		
	}
	
	public MarksheetBean testdelete(int id ) throws Exception{
		Connection con = JdbcDatasource.getconnection();
		PreparedStatement ps = con.prepareStatement("delete from marksheet where id = ? ");
		
		ps.setInt(1, id);
		int i = ps.executeUpdate();
		
		System.out.println("database deleted"+i);
		return null;
		
	}
	public MarksheetBean testfind(int id) throws Exception{
		Connection con = JdbcDatasource.getconnection();
		PreparedStatement ps = con.prepareStatement("select * from marksheet where id = ?");
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		MarksheetBean mb = null;
		while (rs.next()) {
			mb = new MarksheetBean();
			mb.setId(rs.getInt(1));
			mb.setName(rs.getString(2));
			mb.setMaths(rs.getInt(3));
			mb.setChemistry(rs.getInt(4));
			mb.setPhysics(rs.getInt(5));
			
			
			
		}
		
		
		
		return mb;
		
	}

	
	
	
}

