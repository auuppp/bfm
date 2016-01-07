package com.bfm.ui.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bfm.ui.test.LoginTask;
import com.bfm.ui.test.MainPageTask;
import com.bfm.util.WebDriverConstruction;

public class LoginSuccessTest{
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
        Object[][] retObjArr = {{ "admin", "111111" }};  
        return (retObjArr);  
    }
    
	@Test(dataProvider = "userInfo")
	public void loginSuccessTest(String userName,String passWord) throws InterruptedException{
		try {
			LoginTask lgTask = new LoginTask();
			lgTask.loginPageTask(dr,userName,passWord);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
		assertLoginSuccessTest(dr);
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
