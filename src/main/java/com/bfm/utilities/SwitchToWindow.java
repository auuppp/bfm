package com.bfm.utilities;

import java.util.Set;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

public class SwitchToWindow {
	public boolean switchToWindow(WebDriver driver,String windowTitle){  
	    boolean flag = false;  
	    try {  
	        String currentHandle = driver.getWindowHandle();  
	        System.out.println(driver.getPageSource());
	        Set<String> handles = driver.getWindowHandles();  
	        for (String s : handles) {  
	            if (s.equals(currentHandle))  
	                continue;  
	            else {  
	                driver.switchTo().window(s);  
	                if (driver.getTitle().contains(windowTitle)) {  
	                    flag = true;  
	                    System.out.println("Switch to window: "  
	                            + windowTitle + " successfully!");  
	                    break;  
	                } else  
	                    continue;  
	            }  
	        }  
	    } catch (NoSuchWindowException e) {  
	        System.out.println("Window: " + windowTitle + " cound not found!");
	        e.fillInStackTrace();  
	        flag = false;  
	    }  
	    return flag;  
	}  
}
