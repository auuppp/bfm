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
		//确认案例
		bankBondInstrPageSearch.getElement("confirmButton").click();
		instructionNo = bankBondInstrPageSearch.getElement("bondInstructionNo").getText();
		bankBondInstrPageSearch.getElement("alertConfirm").click();
		return instructionNo;
	}
	
	private void setBondElement(PageElementSearch bankBondInstrPageSearch,BankBondInstrVO instr){
		//设置债券代码
		BfmElementOperator.bondElementSetValue(bankBondInstrPageSearch,"interCode",instr.getInterCode(),instr.getStockName());
		//设置交易方式
		BfmElementOperator.tradeTypeElementSetValue(bankBondInstrPageSearch,"tradeType",instr.getTradeMethod());
		//设置组合
		BfmElementOperator.combiElementSetValue(bankBondInstrPageSearch,"combiNo",instr.getCombi(),instr.getCombiName());
		//设置投资类型
		BfmElementOperator.investTypeElementSetValue(bankBondInstrPageSearch,"investType",instr.getInvestType());
		//设置交易方向
		BfmElementOperator.entrustDirectionElementSetValue(bankBondInstrPageSearch,"entrustDirection",instr.getEntrustDirection());
		//设置清算速度
		BfmElementOperator.speedElementSetValue(bankBondInstrPageSearch,"settleSpeed",instr.getSettleSpeed());
		//设置净价
		BfmElementOperator.textElementsetValue(bankBondInstrPageSearch,"price",instr.getPrice());
		//设置券面总额
		BfmElementOperator.textElementsetValue(bankBondInstrPageSearch,"amount",instr.getAmount());
		//设置交易对手
		BfmElementOperator.rivalElementSetValue(bankBondInstrPageSearch,"rivalName",instr.getRivalNo());
	}
}
