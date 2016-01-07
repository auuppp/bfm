package com.bfm.task;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.bfm.VO.BankBondInstrVO;
import com.bfm.utilities.BfmElementOperator;
import com.bfm.utilities.PageElementSearch;
import com.bfm.utilities.TreeNodeSearch;
import com.bfm.utilities.YamlReader;
import com.bfm.utilities.yamlFileDirector;

public class BankBondInstrPageTask {

	public String bankBondInstrSubmit(WebDriver driver,BankBondInstrVO instr) throws InterruptedException{
		String instructionNo = null;
		(new TreeNodeSearch(driver)).openIframe("bankBondInstr");
		driver.switchTo().frame(driver.findElement(By.xpath((new YamlReader().getYamlFile(yamlFileDirector.iframes)).get("bankBondInstrIframe").get("value"))));
		HashMap<String, HashMap<String, String>> ymlBankBondInstr = new YamlReader().getYamlFile(yamlFileDirector.bankBondInstr);
		PageElementSearch bankBondInstrPageSearch = new PageElementSearch(driver,ymlBankBondInstr);
		setBondElement(bankBondInstrPageSearch,instr);
		bankBondInstrPageSearch.getElement("submit").click();
		//ȷ�ϰ���
		bankBondInstrPageSearch.getElement("confirmButton").click();
		instructionNo = bankBondInstrPageSearch.getElement("bondInstructionNo").getText();
		bankBondInstrPageSearch.getElement("alertConfirm").click();
		return instructionNo;
	}
	
	private void setBondElement(PageElementSearch bankBondInstrPageSearch,BankBondInstrVO instr){
		//����ծȯ����
		BfmElementOperator.bondElementSetValue(bankBondInstrPageSearch,"interCode",instr.getInterCode(),instr.getStockName());
		//���ý��׷�ʽ
		BfmElementOperator.tradeTypeElementSetValue(bankBondInstrPageSearch,"tradeType",instr.getTradeMethod());
		//�������
		BfmElementOperator.combiElementSetValue(bankBondInstrPageSearch,"combiNo",instr.getCombi(),instr.getCombiName());
		//����Ͷ������
		BfmElementOperator.investTypeElementSetValue(bankBondInstrPageSearch,"investType",instr.getInvestType());
		//���ý��׷���
		BfmElementOperator.entrustDirectionElementSetValue(bankBondInstrPageSearch,"entrustDirection",instr.getEntrustDirection());
		//���������ٶ�
		BfmElementOperator.speedElementSetValue(bankBondInstrPageSearch,"settleSpeed",instr.getSettleSpeed());
		//���þ���
		BfmElementOperator.textElementsetValue(bankBondInstrPageSearch,"price",instr.getPrice());
		//����ȯ���ܶ�
		BfmElementOperator.textElementsetValue(bankBondInstrPageSearch,"amount",instr.getAmount());
		//���ý��׶���
		BfmElementOperator.rivalElementSetValue(bankBondInstrPageSearch,"rivalName",instr.getRivalNo());
	}
}
