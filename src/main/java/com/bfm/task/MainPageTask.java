package com.bfm.task;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import com.bfm.utilities.PageElementSearch;
import com.bfm.utilities.YamlReader;
import com.bfm.utilities.yamlFileDirector;

public class MainPageTask {
	HashMap<String, HashMap<String, String>> yMainPage = new YamlReader().getYamlFile(yamlFileDirector.mainPage);
	public void logOut(WebDriver driver){
		driver.switchTo().defaultContent();
		PageElementSearch mPageSearch = new PageElementSearch(driver,yMainPage);
		mPageSearch.getElement("logout").click();
		mPageSearch.getElement("logoutConfirm").click();
	}
	
	public void openPage(WebDriver driver,String pageName){
		PageElementSearch mPageSearch = new PageElementSearch(driver,yMainPage);
		mPageSearch.getElement(pageName).click();
	}
}
