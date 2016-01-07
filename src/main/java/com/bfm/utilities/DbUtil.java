package com.bfm.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.dbunit.database.DatabaseConnection;

/*
 * 20151112 暂支持oracle的数据连接
 * 返回dbunit数据库连接，DatabaseConnection
 */
public class DbUtil {
    /*
     * 创建数据库连接，每一次调用都会创建一个数据库连接
     */
	public static DatabaseConnection getConnection(){
		DatabaseConnection connection = null;
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:" + "thin:@127.0.0.1:1521:orcl1";
	        String user = "tzyhsc";
	        String password = "tzyhsc";
	        
	        try {
	        	con = DriverManager.getConnection(url, user, password);
	        	//设置数据库连接schema，默认与oracle用户名一致，大写；
	        	connection = new DatabaseConnection(con,"TZYHSC");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
 
	public static void close(Connection con) {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement ps) {
		try {
			if (ps != null)
				ps.close();
		} catch (SQLException e) {
	    	e.printStackTrace();
	    }
	}
	
	public static void close(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
