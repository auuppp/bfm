package com.bfm.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSource {
	
	private Connection con = null;// ����һ����ݿ�����

    public DataSource(){
    	try {
    		Connection connection = null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:" + "thin:@192.168.53.96:1521:orcl";
	        String user = "bfmcpv";// �û���,ϵͳĬ�ϵ��˻���
	        String password = "bfmcpv";// �㰲װʱѡ���õ�����
	        try {
	        	connection = DriverManager.getConnection(url, user, password);
	        	this.setCon(connection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// ��ȡ����
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// ����Oracle�����		
    }
    
    public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public void createConnection(){
    	
	}

	//�ر������ݿ����
    public void closeDataSource(ResultSet result,PreparedStatement pre,Connection con){
        if (result != null)
			try {
				result.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        
        if (pre != null)
			try {
				pre.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        
        if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    }
}
