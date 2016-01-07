package com.bfm.ui.test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bfm.bean.BankBondInstrVO;
import com.bfm.util.BfmElementOperator;
import com.bfm.util.PageElementSearch;
import com.bfm.util.TreeNodeSearch;
import com.bfm.util.YamlReader;
import com.bfm.util.yamlFileDirector;

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
