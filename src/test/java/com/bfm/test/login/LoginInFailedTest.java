package com.bfm.test.login;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import com.bfm.db.bean.TsysUser;
import com.bfm.db.bean.TsysUserHome;
import com.bfm.request.login.LoginService;
import com.bfm.utilities.*;;

/*
 * ��֤�û�����������󣬵�½���ɹ��ĳ���
 */
public class LoginInFailedTest {
	private static final Log log = LogFactory.getLog(LoginInFailedTest.class);
	private String userId = "admin";
	private String passWord = "222222";
	
	@BeforeTest
	public void setUp(){
		//��֤��½�û���½ʱ�Ѿ����ڵ�½״̬
		log.debug("LoginFailedTest case setup");
		TsysUserHome tsysUserDao = null;
		TsysUser tsysUser = null;
		tsysUserDao =  new TsysUserHome();
		tsysUser = tsysUserDao.findById(userId);
		
		if("1".equals(tsysUser.getLockStatus())){
			log.info("This user is logined :  " + userId);
			log.warn("This user is uppdatting to loginOut : " + userId);
			tsysUser.setLockStatus("0");
			tsysUserDao.attachDirty(tsysUser);
		}
	}
	
	@Test
	public void loginFailTest() throws Exception{
		
		passWord = "admin";
		String str = LoginService.login(userName, passWord).getCookie();
		Assert.assertNotNull(str);
		pre = ds.getCon().prepareStatement("select count(*) totalCount from tsys_user where user_id = 'admin' and lock_status = '1'");
		result = pre.executeQuery();
		if(result.next() )
			Assert.assertTrue(result.getInt("totalCount")==0, "��½�ɹ�");
		else
			Assert.fail("���ε�½ʧ��");
	}
	
	@AfterTest
	public void tearDown(){
		int count = 0;
		ds = new DataSource();
		try {
			pre = ds.getCon().prepareStatement("update tsys_user set lock_status = '0' where user_id = '"+userName+"'");
			count = pre.executeUpdate();
			if(0 == count){
				System.out.println("����ݸ���?);
			}else{
				System.out.println("��ݸ��³ɹ�?);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ds.closeDataSource(result, pre, null);
	}
}
