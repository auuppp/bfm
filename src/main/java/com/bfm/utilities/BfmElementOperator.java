package com.bfm.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BfmElementOperator {

	public static void setElementValue(WebElement element,String value){
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"), value);//method1

		/*其他处理方式
		element.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"55");//method2
		element.sendKeys(Keys.CONTROL + "a");//method3
		element.sendKeys("55");//method3
		method4
		element.click(); 
		element.clear(); 
		element.sendKeys(Keys.BACK_SPACE ); 
		element.sendKeys(Keys.chord(Keys.CONTROL, "a")); 
		element.sendKeys(Keys.DELETE); 
		element.sendKeys("100"); 
		element.click(); */
	}
	
	public static void textElementsetValue(PageElementSearch pgSearch,String elementName,String value){
		WebElement element = pgSearch.getElement(elementName);
		setElementValue(element,value);
	}
	
	public static void selectElementSetValue(PageElementSearch pgSearch,String elementName,String key,String value){
		WebElement element = pgSearch.getElement(elementName);
		setElementValue(element,key);
		pgSearch.watiForElement(By.xpath(".//span[contains(text(),'"+key+":"+value+"')]")).click();
	}
	
	//债券下拉框
	public static void bondElementSetValue(PageElementSearch pgSearch,String elementName,String stockCode,String stockName){
		selectElementSetValue(pgSearch,elementName,stockCode,stockName);
	}
	
	//交易方式
	public static void tradeTypeElementSetValue(PageElementSearch pgSearch,String elementName,String tradeType){
		if("1".equals(tradeType)){
			selectElementSetValue(pgSearch,elementName,tradeType,"询价交易");
		}else{
			selectElementSetValue(pgSearch,elementName,tradeType,"点击成交");
		}
	}
	
	//交易方式
	public static void entrustDirectionElementSetValue(PageElementSearch pgSearch,String elementName,String direction){
		if("3".equals(direction)){
			selectElementSetValue(pgSearch,elementName,direction,"买入");
		}else if ("4".equals(direction)){
			selectElementSetValue(pgSearch,elementName,direction,"卖出");
		}
	}
	
	//清算速度
	public static void speedElementSetValue(PageElementSearch pgSearch,String elementName,String speed){
		if("0".equals(speed)){
			selectElementSetValue(pgSearch,elementName,speed,"T+0");
		}else{
			selectElementSetValue(pgSearch,elementName,speed,"T+1");
		}
	}
	
	//投资类型
	public static void investTypeElementSetValue(PageElementSearch pgSearch,String elementName,String investType){
		if("1".equals(investType)){
			selectElementSetValue(pgSearch,elementName,investType,"可交易");
		}else if("2".equals(investType)){
			selectElementSetValue(pgSearch,elementName,investType,"持有至到期");
		}else if("3".equals(investType)){
			selectElementSetValue(pgSearch,elementName,investType,"可供出售");
		}else if("4".equals(investType)){
			selectElementSetValue(pgSearch,elementName,investType,"贷款和应收款项");
		}
	}
	
	//组合
	public static void combiElementSetValue(PageElementSearch pgSearch,String elementName,String combiNo,String combiName){
		selectElementSetValue(pgSearch,elementName,combiNo,combiName);
	}
	
	//交易对手
	public static void rivalElementSetValue(PageElementSearch pgSearch,String elementName,String rivalName){
		WebElement element = pgSearch.getElement(elementName);
		setElementValue(element,rivalName);
		pgSearch.watiForElement(By.xpath(".//tr[td[div[div[contains(text(),'1')]]]]//div[contains(text(),"+rivalName+")]")).click();
	}
}
