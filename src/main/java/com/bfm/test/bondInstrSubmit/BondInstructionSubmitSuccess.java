package com.bfm.test.bondInstrSubmit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bfm.bean.BondbsInstrBean;
import com.bfm.request.bondInstruction.BondbdsInstrService;
import com.bfm.request.login.LoginService;
import com.bfm.util.DataSource;
import com.bfm.util.XmlToBean;
/*
 * ��½������֤
 */
public class BondInstructionSubmitSuccess {
	private PreparedStatement pre = null;// ����Ԥ����������һ�㶼�����������Statement
	private ResultSet result = null;// ����һ��������
	private DataSource ds = null;
	private String userName = "xuhlzh1";
	private String passWord = "222222";
	
	@BeforeTest
	public void setUp(){
		int count = 0;
		ds = new DataSource();
		try {
			pre = ds.getCon().prepareStatement("update tsys_user set lock_status = '0'");
			count = pre.executeUpdate();
			if(0 == count){
				System.out.println("����ݸ���");
			}else{
				System.out.println("��ݸ��³ɹ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ds.closeDataSource(result, pre, null);
	}
	
	@Test
	public void bondSubmitWithoutRisk() throws Exception{
		String str = LoginService.login(userName, passWord).getCookie();
		BondbsInstrBean instr = (BondbsInstrBean)XmlToBean.getXmlVO("src/com/bfm/test/bondInstrSubmit/bondInstr.xml").get(0);

		BondbdsInstrService.submitBondInstr(instr, str);
	/*	Assert.assertNotNull(str);
		pre = ds.getCon().prepareStatement("select count(*) totalCount from tsys_user where user_id = 'admin' and lock_status = '1'");
		result = pre.executeQuery();
		if(result.next() )
			Assert.assertTrue(result.getInt("totalCount")>0, "��½�ɹ�");
		else
			Assert.fail("���ε�½ʧ��");*/
	}
	
	@AfterTest
	public void tearDown(){
		int count = 0;
		ds = new DataSource();
		try {
			pre = ds.getCon().prepareStatement("update tsys_user set lock_status = '0' where user_id = '"+userName+"'");
			count = pre.executeUpdate();
			if(0 == count){
				System.out.println("����ݸ���");
			}else{
				System.out.println("��ݸ��³ɹ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ds.closeDataSource(result, pre, null);
	}
}
