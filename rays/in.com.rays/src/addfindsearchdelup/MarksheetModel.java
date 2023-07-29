package addfindsearchdelup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {
	public void testadd(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv","root", "root");
		PreparedStatement p = con.prepareStatement("insert into marksheet values (?,?,?,?,?)");
		
		p.setInt(1, bean.getId());
		p.setString(2, bean.getName());
		p.setInt(3, bean.getChemistry());
		p.setInt(4, bean.getMaths());
		p.setInt(5, bean.getPhysics());
		
		int i = p.executeUpdate();
		
		System.out.println("database updated"+i);
		
	}
	public MarksheetBean testfindbyid(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement p = con.prepareStatement("select * from marksheet where id = ?");
		
		p.setInt(1, id);
		ResultSet rs = p.executeQuery();
		MarksheetBean mb = null;
		while (rs.next()) {
			mb = new MarksheetBean();
			mb.setId(rs.getInt(1));
			mb.setName(rs.getString(2));
			mb.setChemistry(rs.getInt(3));
			mb.setMaths(rs.getInt(4));
			mb.setPhysics(rs.getInt(5));
		
	} return mb;

}
	
	public void testupdate(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root","root");
		PreparedStatement p = con.prepareStatement("update marksheet set name = ? , physics = ?, chemistry=?,maths=? where id = ?");
		
		p.setString(1, bean.getName());
		p.setInt(2, bean.getPhysics());
		p.setInt(3, bean.getChemistry());
		p.setInt(4, bean.getMaths());
		p.setInt(5, bean.getId());
		
		int i = p.executeUpdate();
		System.out.println("database updated"+ i);
		
		
	}
	public static void testdelete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		PreparedStatement p = con.prepareStatement("delete from marksheet where id =?");
		
		p.setInt(1, id);
		int i = p.executeUpdate();
		System.out.println("database deleted ="+i);
		
	}
	public List search(MarksheetBean b, int pageNo, int pageSize)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root","root");
		StringBuffer sb = new StringBuffer("select * from marksheet where 1=1");
		if(b!=null) {
			if (b.getName()!=null&& b.getName().length()<0) {
				sb.append("and name like '"+ b.getName() + "%'");
			}
			if (b.getId()<0) {
				sb.append("and id ='"+b.getId()+"'");
				
			
		}}
			if (pageSize >0) {
				pageNo = (pageNo-1)*pageSize;
				sb.append(" limit " + pageNo+","+ pageSize); 
				
			}System.out.println(sb);
		PreparedStatement p = con.prepareStatement(sb.toString());
		ResultSet rs = p.executeQuery();
		ArrayList list = new ArrayList();
		while (rs.next()) {
			b = new MarksheetBean();
			b.setId(rs.getInt(1));
			b.setName(rs.getString(2));
			b.setChemistry(rs.getInt(3));
			b.setMaths(rs.getInt(4));
			b.setPhysics(rs.getInt(5));
			list.add(b);
			
		}
		
		return list;
		
	}
}
