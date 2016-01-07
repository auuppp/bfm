package com.bfm.utilities;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class PageElementSearch {
    public WebDriver driver;
    private HashMap<String, HashMap<String, String>> yml; 
     
	public PageElementSearch(WebDriver driver,HashMap<String, HashMap<String, String>> yml){
		this.driver = driver;
		this.yml = yml;
	} 
    
    private By getBy(String type, String value) {
        By by = null;
        if (type.equals("id")) {
            by = By.id(value);
        }
        if (type.equals("name")) {
            by = By.name(value);
        }
        if (type.equals("xpath")) {
            by = By.xpath(value);
        }
        if (type.equals("class")) {
            by = By.className(value);
        }
        if (type.equals("linkText")) {
            by = By.linkText(value);
        }
        return by;
    }
    
    public WebElement watiForElement(final By by) {
        WebElement element = null;
        int waitTime = 3;//Integer.parseInt(Config.getConfig("waitTime"));
        try {
            element = new WebDriverWait(driver, 20000)
                    .until(new ExpectedCondition<WebElement>() {
                    	@Override
                        public WebElement apply(WebDriver d) {
                            return d.findElement(by);
                        }
                    });
        } catch (Exception e) {
            System.out.println(by.toString() + " is not exist until " + waitTime);
        }
        
       if(!this.waitElementToBeDisplayed(element))
            element = null;
        
        return element;
    }
    
    private boolean waitElementToBeDisplayed(final WebElement element) {
        boolean wait = false;
        if (element == null)
            return wait;
        try {
            wait = new WebDriverWait(driver,20000)
                    .until(new ExpectedCondition<Boolean>() {
                        public Boolean apply(WebDriver d) {
                            return element.isDisplayed();
                        }
                    });
        } catch (Exception e) {
            System.out.println(element.toString() + " is not displayed");
        }
        return wait;
    }
	
	public WebElement getElement(String elementKey){
		String type = this.yml.get(elementKey).get("type");
        String value = this.yml.get(elementKey).get("value");
		return this.watiForElement(this.getBy(type, value));
	}
	
}
