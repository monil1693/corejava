package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateModel {
	public void Update(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb","root", "root");
		PreparedStatement p = con.prepareStatement("update user set FirstName=? ,LastName=?, LoginId=?, Password= ? ,Dob=?,Address= ? where Id =?");

		p.setInt(7, bean.getId());
		p.setString(1, bean.getFirstname());
		p.setString(2, bean.getLastName());
		p.setString(3, bean.getLoginId());
		p.setString(4, bean.getPassword());
		p.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		p.setString(6, bean.getAddress());
		
		int i = p.executeUpdate();
		System.out.println("database updated " + i );
		
			
	}
}
