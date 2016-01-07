package com.bfm.ui.tests;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bfm.bean.BankBondInstrVO;
import com.bfm.ui.test.BankBondInstrPageTask;
import com.bfm.ui.test.LoginTask;
import com.bfm.ui.test.MainPageTask;
import com.bfm.util.WebDriverConstruction;
import com.bfm.util.XmlToBean;

public class BankBondInstrSubmit {
WebDriver dr = null;
	
	@BeforeTest
	public void setUp(){
		dr = (new WebDriverConstruction()).getWebDriver("fireFox");
	}
	
	@AfterTest
	public void tearDown(){
		MainPageTask mPageTask = new MainPageTask();
		mPageTask.logOut(dr);
		dr.quit();
	}
	
	@DataProvider(name = "userInfo")
    public Object[][] createData() {  
        Object[][] retObjArr = {{ "xit1", "111111" }};  
        return (retObjArr);  
    }
    
	@Test(dataProvider = "userInfo")
	public void bondBondInstSubmitSuccess(String userName,String passWord) throws InterruptedException, AWTException{
		try {
			LoginTask lgTask = new LoginTask();
			lgTask.loginPageTask(dr,userName,passWord);
			BankBondInstrVO instr = (BankBondInstrVO)XmlToBean.getXmlVO(getClass().getResource(".").getFile().toString()+"/TestData1.xml").get(0);
			BankBondInstrPageTask bondInstrTask = new BankBondInstrPageTask();
			bondInstrTask.bankBondInstrSubmit(dr, instr);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
	}
	
	public boolean assertLoginSuccessTest(WebDriver driver){
		try{
			driver.getCurrentUrl().contains("indexFrame.jsp");
			return true;
		}catch(NullPointerException e){
			return false;
		}
	}
}
