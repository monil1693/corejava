package incomraysmodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import incomraysbean.UserBean;
import incomraysutil.JdbcDatasource;

public class UserModel {
	
	public void Add(UserBean Bean) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		Connection con = JdbcDatasource.getconnection();
		PreparedStatement ps = con.prepareStatement("insert into user values (?,?,?,?,?,?,?)");
		
		
		ps.setInt(1, nextPk());
		ps.setString(2, Bean.getFirstName());
		ps.setString(3, Bean.getLastName());
		ps.setString(4, Bean.getLoginId());
		ps.setString(5, Bean.getPassword());
		ps.setDate(6,new java.sql.Date(Bean.getDob().getTime()));
		ps.setString(7, Bean.getAddress());
		int i = ps.executeUpdate();
		System.out.println("database inserted"+i);
	}
	
	public void update(UserBean bean)throws Exception{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		Connection con = JdbcDatasource.getconnection();
		PreparedStatement ps = con.prepareStatement("update user set FirstName = ? , lastName =?, LoginId = ?, password=?, Dob=?,Address=? where id = ?");
		
		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getLoginId());
		ps.setString(4, bean.getPassword());
		ps.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(6, bean.getAddress());
		ps.setInt(7, bean.getId());
		
		int i = ps.executeUpdate();
		System.out.println("database updates"+ i);
		
	}
	public void testDelete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from user where id = ? ");
        
		ps.setInt(1, id);
		int i = ps.executeUpdate();
		System.out.println("database deleted"+i);

		
	}
	public UserBean testfind(Date date )throws Exception {
		Connection con = JdbcDatasource.getconnection();
		PreparedStatement ps = con.prepareStatement(" select * from user where Dob = ?");
		
	ps.setDate(1, new java.sql.Date(date.getTime()));
	ResultSet rs = ps.executeQuery();
	UserBean ub = null;
	while(rs.next()) {
		ub = new UserBean();
		ub.setId(rs.getInt(1));
		ub.setFirstName(rs.getString(2));
		ub.setLastName(rs.getString(3));
		ub.setLoginId(rs.getString(4));
		ub.setPassword(rs.getString(5));
		ub.setDob(new java.sql.Date(rs.getDate(6).getTime()));
		ub.setAddress(rs.getString(7));

		}
		return ub;
	} 
	
	public List search(UserBean bean, int pageNo, int pageSize) throws Exception {
		Connection conn = JdbcDatasource.getconnection();
		StringBuffer sql = new StringBuffer("select * from user where 1=1 ");
		if (bean!= null) {
			if (bean.getDob() != null && bean.getDob().getTime() > 0) {
				sql.append(" and Dob like '" + new java.sql.Date(bean.getDob().getTime()) + "%'");
			}
			if (bean.getFirstName() != null && bean.getFirstName().length() > 0) {
				sql.append(" and FirstName like '" + bean.getFirstName() + "%'");
			}
			if (bean.getLoginId() != null && bean.getLoginId().length() > 0) {
				sql.append(" and LoginId like '" + bean.getLoginId() + "%'");
			}
		}
		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" limit " + pageNo + "," + pageSize);
		}
		System.out.println(sql);
		PreparedStatement ps = conn.prepareStatement(sql.toString());
		ResultSet rs = ps.executeQuery();
		List list = new ArrayList();
		while (rs.next()) {
			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setDob(rs.getDate(6));
			bean.setAddress(rs.getString(7));
			list.add(bean);
		}
		return list;
	}
	
	
	public Integer nextPk() throws Exception {
		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		PreparedStatement p = con.prepareStatement("select max(id) from user ");
		ResultSet rs = p.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);

		}

		return pk + 1;
	
	

}
	public UserBean authentication(String LoginId, String password) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from user where loginId = ? and password =? ");
		ps.setString(1, LoginId);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		UserBean ub = null;
		while (rs.next()) {
			ub = new UserBean();
			ub.setId(rs.getInt(1));
			ub.setFirstName(rs.getString(2));
			ub.setLastName(rs.getString(3));
			ub.setLoginId(rs.getString(4));
			ub.setPassword(rs.getString(5));
			ub.setDob(rs.getDate(6));
			ub.setAddress(rs.getString(7));

		}

		return ub;

	}
	public UserBean findbypk(int Id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from user where id = ?");
		ps.setInt(1, Id);
		ResultSet rs = ps.executeQuery();
		UserBean ub = null;
		while (rs.next()) {
			ub = new UserBean();
			ub.setId(rs.getInt(1));
			ub.setFirstName(rs.getString(2));
			ub.setLastName(rs.getString(3));
			ub.setLoginId(rs.getString(4));
			ub.setPassword(rs.getString(5));
			ub.setDob(rs.getDate(6));
			ub.setAddress(rs.getString(7));

		} return ub;
		
	}

}
