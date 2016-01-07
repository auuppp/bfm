package com.bfm.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConstruction {
	private WebDriver driver=null;
	
	public WebDriver getWebDriver(String browser){
		if("fireFox".equals(browser)){
			System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if("chrome".equals(browser)){
			System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe"); 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else
			return null;
		return this.driver;
	}
}
