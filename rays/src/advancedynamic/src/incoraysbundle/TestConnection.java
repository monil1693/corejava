package incoraysbundle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import incomraysutil.JdbcDatasource;

public class TestConnection {

	public static void main(String[] args) throws Exception {
	Connection con = JdbcDatasource.getconnection();
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from emp ");
	while (rs.next()) {
		System.out.print("\t"+ rs.getInt(1));
		System.out.print("\t"+ rs.getString(2));
		System.out.print("\t"+ rs.getString(3));
		System.out.println("\t"+ rs.getInt(4));
//		System.out.println("\t"+ rs.getInt(5));
	}
	

	}

}
