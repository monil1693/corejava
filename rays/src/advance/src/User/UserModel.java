package User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;

public class UserModel {

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
			ub.setFirstname(rs.getString(2));
			ub.setLastName(rs.getString(3));
			ub.setLoginId(rs.getString(4));
			ub.setPassword(rs.getString(5));
			ub.setDob(rs.getDate(6));
			ub.setAddress(rs.getString(7));

		}

		return ub;

	}

	public List search3(UserBean ub) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");

		

		StringBuffer sql = new StringBuffer("select * from user where 1=1");
		if (ub != null) {

			if (ub.getDob() != null && ub.getDob().getTime() > 0) {
				sql.append(" and Dob like '" + new java.sql.Date(ub.getDob().getTime()) + "%'");

			}

		}
		System.out.println(sql);

		PreparedStatement ps = con.prepareStatement(sql.toString());
		ArrayList list = new ArrayList();
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			ub = new UserBean();

			ub.setId(rs.getInt(1));
			ub.setFirstname(rs.getString(2));
			ub.setLastName(rs.getString(3));
			ub.setLoginId(rs.getString(4));
			ub.setPassword(rs.getString(5));
			ub.setAddress(rs.getString(7));
			ub.setDob(rs.getDate(6));
			list.add(ub);

		}
		return list;

	}

	public void transaction(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		PreparedStatement p = con.prepareStatement(
				"insert into user values (5,'ravi','ojha','ravi@gmail.com','1234','1993-04-16','indore')");
		PreparedStatement p1 = con.prepareStatement(
				"insert into user values (6,'ravi','ojha','ravi@gmail.com','1234','1993-04-16','indore')");
////		p.setInt(1, bean.getId());
//		p.setInt(1, nextPk());
//		p.setString(2, bean.getFirstname());
//		p.setString(3, bean.getLastName());
//		p.setString(4, bean.getLoginId());
//		p.setString(5, bean.getPassword());
//		p.setDate(6, new java.sql.Date(bean.getDob().getTime()));
//		p.setString(7, bean.getAddress());

		int i = p.executeUpdate();
		int i1 = p.executeUpdate();
		System.out.println("database updated " + i);

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

	public void add(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		PreparedStatement p = con.prepareStatement("insert into user values (?,?,?,?,?,?,?)");

//	p.setInt(1, bean.getId());
		p.setInt(1, nextPk());
		p.setString(2, bean.getFirstname());
		p.setString(3, bean.getLastName());
		p.setString(4, bean.getLoginId());
		p.setString(5, bean.getPassword());
		p.setDate(6, new java.sql.Date(bean.getDob().getTime()));
		p.setString(7, bean.getAddress());

		int i = p.executeUpdate();
		System.out.println("database updated " + i);

	}

	public void Update(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		PreparedStatement p = con.prepareStatement(
				"update user set FirstName=? ,LastName=?, LoginId=?, Password= ? ,Dob=?,Address= ? where Id =?");

		p.setInt(7, bean.getId());
		p.setString(1, bean.getFirstname());
		p.setString(2, bean.getLastName());
		p.setString(3, bean.getLoginId());
		p.setString(4, bean.getPassword());
		p.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		p.setString(6, bean.getAddress());

		int i = p.executeUpdate();
		System.out.println("database updated " + i);

	}

	public static void TestDelete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from user where id = ?");

		ps.setInt(1, id);
		int i = ps.executeUpdate();
		System.out.println("deleted database=" + i);
	}

	public UserBean FindbyId(int Id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from user where id = ?");
		ps.setInt(1, Id);
		ResultSet rs = ps.executeQuery();
		UserBean ub = null;
		while (rs.next()) {
			ub = new UserBean();
			ub.setId(rs.getInt(1));
			ub.setFirstname(rs.getString(2));
			ub.setLastName(rs.getString(3));
			ub.setLoginId(rs.getString(4));
			ub.setPassword(rs.getString(5));
			ub.setDob(rs.getDate(6));
			ub.setAddress(rs.getString(7));
		}

		return ub;

	}

	public List Search(UserBean ub, int pageNo, int pageSize) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");
		StringBuffer sb = new StringBuffer("select * from user where 1=1 ");
		if (ub != null) {
			if (ub.getFirstname() != null && ub.getFirstname().length()< 0) {

				sb.append("and FirstName like '"+ ub.getFirstname() + "%'");
			}
		}
		if (pageSize>0) {
			pageNo = (pageNo - 1)*pageSize;
			sb.append(" limit "+pageNo +","+pageSize);

		}
		System.out.println(sb);

		PreparedStatement ps = con.prepareStatement(sb.toString());
		ResultSet rs = ps.executeQuery();
		ArrayList list = new ArrayList();
		while (rs.next()) {
			ub = new UserBean();
			ub.setId(rs.getInt(1));
			ub.setFirstname(rs.getString(2));
			ub.setLastName(rs.getString(3));
			ub.setLoginId(rs.getString(4));
			ub.setPassword(rs.getString(5));
			ub.setDob(rs.getDate(6));
			ub.setAddress(rs.getString(7));
			list.add(ub);

		}
		return list;

	}

	public List Search2(UserBean ub) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "root");

		PreparedStatement ps = con.prepareStatement("select * from user");
		ResultSet rs = ps.executeQuery();
		ArrayList list = new ArrayList();
		while (rs.next()) {
			ub = new UserBean();
			ub.setId(rs.getInt(1));
			ub.setFirstname(rs.getString(2));
			ub.setLastName(rs.getString(3));
			ub.setLoginId(rs.getString(4));
			ub.setPassword(rs.getString(5));
			ub.setDob(rs.getDate(6));
			ub.setAddress(rs.getString(7));
			list.add(ub);

		}
		return list;

	}

	public List Search2(Object ub, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
}
