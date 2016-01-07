package com.bfm.ui.suit;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CheckGridOne {
	MainClass ts = new MainClass();
	WebDriver driver = ts.driver;

	DesiredCapabilities capability = null;

	/**
	 * 
	 * @param Browser
	 * @throws Exception
	 * @code = To launch a Browser for Compatibility Testing purpose.
	 */

	@Test
//	@Parameters({ "Browser" })
	public void browserLaunch(String Browser) throws Exception {

	    // Checking condition for a Firefox.
	    if (Browser.equalsIgnoreCase("firefox")) {
	        System.out.println("Firefox");

	        capability = DesiredCapabilities.firefox();
	        capability.setBrowserName("firefox");
	        capability.setPlatform(org.openqa.selenium.Platform.WINDOWS);

	        URL url = new URL("http://lo***st:4444/wd/hub");
	        System.out.println("testing");
	        driver = new RemoteWebDriver(url, capability);

	        System.out.println("test");
	    }

	    // Checking condition for a iexplorer.
	    if (Browser.equalsIgnoreCase("iexplorer")) {
	        System.out.println("IE");

	        System.setProperty(
	                "webdriver.ie.driver",
	                "E:\\FW\\Test-2.28.0(Feb-18)\\IEDriverServer\\64-Bit\\IEDriverServer.exe");

	        capability = DesiredCapabilities.internetExplorer();
	        capability.setBrowserName("internet explorer");
	        capability.setPlatform(org.openqa.selenium.Platform.ANY);
	        System.out.println("testing");
	        driver = new RemoteWebDriver(new URL("http://lo***st:4444/wd/hub"), capability);
	        System.out.println("test");
	    }

	    // Checking condition for a chrome.
	    if (Browser.equalsIgnoreCase("chrome")) {
	        System.out.println("chrome");

	    }   
	}
	   }