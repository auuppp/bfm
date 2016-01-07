package com.bfm.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BfmElementOperator {

	public static void setElementValue(WebElement element,String value){
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"), value);//method1

		/*��������ʽ
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
	
	//ծȯ������
	public static void bondElementSetValue(PageElementSearch pgSearch,String elementName,String stockCode,String stockName){
		selectElementSetValue(pgSearch,elementName,stockCode,stockName);
	}
	
	//���׷�ʽ
	public static void tradeTypeElementSetValue(PageElementSearch pgSearch,String elementName,String tradeType){
		if("1".equals(tradeType)){
			selectElementSetValue(pgSearch,elementName,tradeType,"ѯ�۽���");
		}else{
			selectElementSetValue(pgSearch,elementName,tradeType,"����ɽ�");
		}
	}
	
	//���׷�ʽ
	public static void entrustDirectionElementSetValue(PageElementSearch pgSearch,String elementName,String direction){
		if("3".equals(direction)){
			selectElementSetValue(pgSearch,elementName,direction,"����");
		}else if ("4".equals(direction)){
			selectElementSetValue(pgSearch,elementName,direction,"����");
		}
	}
	
	//�����ٶ�
	public static void speedElementSetValue(PageElementSearch pgSearch,String elementName,String speed){
		if("0".equals(speed)){
			selectElementSetValue(pgSearch,elementName,speed,"T+0");
		}else{
			selectElementSetValue(pgSearch,elementName,speed,"T+1");
		}
	}
	
	//Ͷ������
	public static void investTypeElementSetValue(PageElementSearch pgSearch,String elementName,String investType){
		if("1".equals(investType)){
			selectElementSetValue(pgSearch,elementName,investType,"�ɽ���");
		}else if("2".equals(investType)){
			selectElementSetValue(pgSearch,elementName,investType,"����������");
		}else if("3".equals(investType)){
			selectElementSetValue(pgSearch,elementName,investType,"�ɹ�����");
		}else if("4".equals(investType)){
			selectElementSetValue(pgSearch,elementName,investType,"�����Ӧ�տ���");
		}
	}
	
	//���
	public static void combiElementSetValue(PageElementSearch pgSearch,String elementName,String combiNo,String combiName){
		selectElementSetValue(pgSearch,elementName,combiNo,combiName);
	}
	
	//���׶���
	public static void rivalElementSetValue(PageElementSearch pgSearch,String elementName,String rivalName){
		WebElement element = pgSearch.getElement(elementName);
		setElementValue(element,rivalName);
		pgSearch.watiForElement(By.xpath(".//tr[td[div[div[contains(text(),'1')]]]]//div[contains(text(),"+rivalName+")]")).click();
	}
}
