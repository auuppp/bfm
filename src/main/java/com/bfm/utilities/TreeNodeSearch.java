package com.bfm.utilities;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TreeNodeSearch {
	public WebDriver driver;
    
	public TreeNodeSearch(){

	} 
	
    public TreeNodeSearch(WebDriver driver){
		this.driver = driver;
	} 

	private WebElement watiForElement(final By by) {
		WebElement element = null;
		int waitTime = 3;// Integer.parseInt(Config.getConfig("waitTime"));
		try {
			element = new WebDriverWait(driver, 400000)
					.until(new ExpectedCondition<WebElement>() {
						@Override
						public WebElement apply(WebDriver d) {
							return d.findElement(by);
						}
					});
		} catch (Exception e) {
			System.out.println(by.toString() + " is not exist until "
					+ waitTime);
		}

		if (!this.waitElementToBeDisplayed(element))
			element = null;

		return element;
	}

	private boolean waitElementToBeDisplayed(final WebElement element) {
		boolean wait = false;
		if (element == null)
			return wait;
		try {
			wait = new WebDriverWait(driver, 400000)
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

	public void openIframe(String nodeName) throws InterruptedException {
		HashMap<String, HashMap<String, String>> yml = (new YamlReader()).getYamlFile(yamlFileDirector.mainPageTreeNode);
		int nodeSize = yml.get(nodeName).size();
		String[] nodeTree = new String[nodeSize];
		for(int i=0;i<nodeSize;i++){
			nodeTree[i] = yml.get(nodeName).get("level" +i);
			System.err.println(nodeTree[i]);
			this.watiForElement(By.xpath(nodeTree[i])).click();
		}
	}
	
	public static void main (String args[]) throws InterruptedException{
		TreeNodeSearch n1 = new TreeNodeSearch();
		n1.openIframe("bankBondInstr");
	}
}
