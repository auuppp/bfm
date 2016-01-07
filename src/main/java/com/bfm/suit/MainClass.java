package com.bfm.suit;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class MainClass {
	public WebDriver driver = null;
	public void gid() {
		try {
			CreateTestngXml.gridHubLaunching();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CreateTestngXml.grid("firefox", "chrome");
		driver.close();
	}

	public static void main(String a[]) {
		MainClass ts = new MainClass();
		try{
			ts.gid();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}