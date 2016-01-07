package com.bfm.task;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import com.bfm.utilities.BfmElementOperator;
import com.bfm.utilities.PageElementSearch;
import com.bfm.utilities.YamlReader;
import com.bfm.utilities.yamlFileDirector;

public class LoginTask {
	//��¼��������ȡ���������������û����ã�
	public void loginPageTask(WebDriver driver,String userName,String passWord) throws InterruptedException{
		driver.get((new YamlReader().getYamlFile(yamlFileDirector.ymlUrl)).get("loginUrl").get("value"));//���ʵ�¼��ַ��
		HashMap<String, HashMap<String, String>> ymlLogin = new YamlReader().getYamlFile(yamlFileDirector.loginPage);
		PageElementSearch lgPageSearch = new PageElementSearch(driver,ymlLogin);
		System.err.println("Construction_task: "+driver);

		BfmElementOperator.setElementValue(lgPageSearch.getElement("userName"), userName);
		BfmElementOperator.setElementValue(lgPageSearch.getElement("passWord"), passWord);
		lgPageSearch.getElement("loginSubmit").click();
	}
}
