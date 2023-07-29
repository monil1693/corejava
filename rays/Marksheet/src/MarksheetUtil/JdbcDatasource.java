package MarksheetUtil;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcDatasource {
	public static Object ds;

	public final static class JdbcDa {
		 private static JdbcDatasource jds  = null;
		 private ComboPooledDataSource ds = null;
		 
		 private void JdbcDatasource() {
			 try { ResourceBundle rb = ResourceBundle.getBundle("incoraysbundle.JdbcConnection");
				 ds = new ComboPooledDataSource(); 
				 ds.setDriverClass(rb.getString("Driver"));
				 ds.setJdbcUrl(rb.getString("url"));
				 ds.setUser(rb.getString("user"));
				 ds.setPassword(rb.getString("password"));
				 ds.setInitialPoolSize(Integer.parseInt(rb.getString("initial")));
				 ds.setAcquireIncrement(Integer.parseInt(rb.getString("acquire")));
				 ds.setMaxPoolSize(Integer.parseInt(rb.getString("Maximum")));
				 
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		 }
			public static JdbcDatasource getinstance() {
				if(jds==null) {
					jds= new JdbcDatasource();
				}
				return jds;
			}
			public static Connection getconnection() {
				try {
					return ((Statement) getinstance().ds).getConnection();
					
				} catch (SQLException e) {
					return null;
					
				}
			}
			public static void closeConnection(Connection con , Statement stmt, ResultSet rs ) {
				try {
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(con!=null)con.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
					
				}
			}
			public static void closeConnection(Connection con , Statement stmt) {
				closeConnection(con, stmt,null);
			}
			public static void closeConnection(Connection con) {
				closeConnection(con, null, null);
			}
	}
}
