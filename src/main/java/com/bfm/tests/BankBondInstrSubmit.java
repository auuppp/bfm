package com.bfm.tests;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bfm.VO.BankBondInstrVO;
import com.bfm.task.BankBondInstrPageTask;
import com.bfm.task.LoginTask;
import com.bfm.task.MainPageTask;
import com.bfm.utilities.WebDriverConstruction;
import com.bfm.utilities.XmlToJavaVO;

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
			BankBondInstrVO instr = (BankBondInstrVO)XmlToJavaVO.getXmlVO().get(0);
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
