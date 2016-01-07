package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * Tbtempmmtrade generated by hbm2java
 */
public class Tbtempmmtrade implements java.io.Serializable {

	private TbtempmmtradeId id;
	private BigDecimal transDate;
	private String dailyInstructionNo;
	private String effective;
	private String assetType;
	private String accountType;
	private String businFlag;
	private String businFlag2;
	private String businClass;
	private String contractNo;
	private String contractName;
	private String financeType;
	private String objectCode;
	private String rivalAccount;
	private BigDecimal beginDate;
	private BigDecimal endDate;
	private BigDecimal cashDate;
	private String interestDivert;
	private String amtSource;
	private BigDecimal upperLimit;
	private String autoContinueFlag;
	private String entrustDirection;
	private String withInterestFlag;
	private BigDecimal interestAmt;
	private BigDecimal settleAmt;
	private BigDecimal interest;
	private BigDecimal interestDate;
	private BigDecimal lastInterestEndDate;
	private String baseInterest;
	private String linkerName;
	private String linkerPhone;
	private String aheadAllow;
	private BigDecimal aheadAsNormal;
	private BigDecimal breakDayRate;
	private BigDecimal convertBreakDayRate;
	private String sameClientFlag;
	private String repurchaseOrg;
	private String entrustPurpose;
	private String transitionAccount;
	private String accountName;
	private String largePayNo;
	private String returnBranch;
	private String returnAccount;
	private String returnAccountName;
	private String returnLargePayNo;
	private String bookBranch;
	private String attributeBranch;
	private String bookBranchOpenBank;
	private String bookBranchOpenAccount;
	private String bookBranchOpenName;
	private String bookBranchLargePayNo;
	private String bookBranchSwiftCode;
	private String rivalOpenBank;
	private String rivalOpenAccount;
	private String rivalOpenName;
	private String rivalLargePayNo;
	private String rivalSwiftCode;
	private String amtConfirmFlag;
	private String amtSummary;
	private String reserve;
	private String reserve2;
	private String reserve3;

	public Tbtempmmtrade() {
	}

	public Tbtempmmtrade(TbtempmmtradeId id, BigDecimal transDate,
			String dailyInstructionNo, String effective, String assetType,
			String accountType, String businFlag, String businFlag2,
			String businClass, String contractNo, String contractName,
			String financeType, String objectCode, String rivalAccount,
			BigDecimal beginDate, BigDecimal endDate, BigDecimal cashDate,
			String interestDivert, String amtSource, BigDecimal upperLimit,
			String autoContinueFlag, String entrustDirection,
			String withInterestFlag, BigDecimal interestAmt,
			BigDecimal settleAmt, BigDecimal interest, BigDecimal interestDate,
			BigDecimal lastInterestEndDate, String baseInterest,
			String linkerName, String linkerPhone, String aheadAllow,
			BigDecimal aheadAsNormal, BigDecimal breakDayRate,
			BigDecimal convertBreakDayRate, String sameClientFlag,
			String repurchaseOrg, String entrustPurpose,
			String transitionAccount, String accountName, String largePayNo,
			String returnBranch, String returnAccount,
			String returnAccountName, String returnLargePayNo,
			String bookBranch, String attributeBranch,
			String bookBranchOpenBank, String bookBranchOpenAccount,
			String bookBranchOpenName, String bookBranchLargePayNo,
			String bookBranchSwiftCode, String rivalOpenBank,
			String rivalOpenAccount, String rivalOpenName,
			String rivalLargePayNo, String rivalSwiftCode,
			String amtConfirmFlag, String amtSummary, String reserve,
			String reserve2, String reserve3) {
		this.id = id;
		this.transDate = transDate;
		this.dailyInstructionNo = dailyInstructionNo;
		this.effective = effective;
		this.assetType = assetType;
		this.accountType = accountType;
		this.businFlag = businFlag;
		this.businFlag2 = businFlag2;
		this.businClass = businClass;
		this.contractNo = contractNo;
		this.contractName = contractName;
		this.financeType = financeType;
		this.objectCode = objectCode;
		this.rivalAccount = rivalAccount;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.cashDate = cashDate;
		this.interestDivert = interestDivert;
		this.amtSource = amtSource;
		this.upperLimit = upperLimit;
		this.autoContinueFlag = autoContinueFlag;
		this.entrustDirection = entrustDirection;
		this.withInterestFlag = withInterestFlag;
		this.interestAmt = interestAmt;
		this.settleAmt = settleAmt;
		this.interest = interest;
		this.interestDate = interestDate;
		this.lastInterestEndDate = lastInterestEndDate;
		this.baseInterest = baseInterest;
		this.linkerName = linkerName;
		this.linkerPhone = linkerPhone;
		this.aheadAllow = aheadAllow;
		this.aheadAsNormal = aheadAsNormal;
		this.breakDayRate = breakDayRate;
		this.convertBreakDayRate = convertBreakDayRate;
		this.sameClientFlag = sameClientFlag;
		this.repurchaseOrg = repurchaseOrg;
		this.entrustPurpose = entrustPurpose;
		this.transitionAccount = transitionAccount;
		this.accountName = accountName;
		this.largePayNo = largePayNo;
		this.returnBranch = returnBranch;
		this.returnAccount = returnAccount;
		this.returnAccountName = returnAccountName;
		this.returnLargePayNo = returnLargePayNo;
		this.bookBranch = bookBranch;
		this.attributeBranch = attributeBranch;
		this.bookBranchOpenBank = bookBranchOpenBank;
		this.bookBranchOpenAccount = bookBranchOpenAccount;
		this.bookBranchOpenName = bookBranchOpenName;
		this.bookBranchLargePayNo = bookBranchLargePayNo;
		this.bookBranchSwiftCode = bookBranchSwiftCode;
		this.rivalOpenBank = rivalOpenBank;
		this.rivalOpenAccount = rivalOpenAccount;
		this.rivalOpenName = rivalOpenName;
		this.rivalLargePayNo = rivalLargePayNo;
		this.rivalSwiftCode = rivalSwiftCode;
		this.amtConfirmFlag = amtConfirmFlag;
		this.amtSummary = amtSummary;
		this.reserve = reserve;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
	}

	public TbtempmmtradeId getId() {
		return this.id;
	}

	public void setId(TbtempmmtradeId id) {
		this.id = id;
	}

	public BigDecimal getTransDate() {
		return this.transDate;
	}

	public void setTransDate(BigDecimal transDate) {
		this.transDate = transDate;
	}

	public String getDailyInstructionNo() {
		return this.dailyInstructionNo;
	}

	public void setDailyInstructionNo(String dailyInstructionNo) {
		this.dailyInstructionNo = dailyInstructionNo;
	}

	public String getEffective() {
		return this.effective;
	}

	public void setEffective(String effective) {
		this.effective = effective;
	}

	public String getAssetType() {
		return this.assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBusinFlag() {
		return this.businFlag;
	}

	public void setBusinFlag(String businFlag) {
		this.businFlag = businFlag;
	}

	public String getBusinFlag2() {
		return this.businFlag2;
	}

	public void setBusinFlag2(String businFlag2) {
		this.businFlag2 = businFlag2;
	}

	public String getBusinClass() {
		return this.businClass;
	}

	public void setBusinClass(String businClass) {
		this.businClass = businClass;
	}

	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractName() {
		return this.contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getFinanceType() {
		return this.financeType;
	}

	public void setFinanceType(String financeType) {
		this.financeType = financeType;
	}

	public String getObjectCode() {
		return this.objectCode;
	}

	public void setObjectCode(String objectCode) {
		this.objectCode = objectCode;
	}

	public String getRivalAccount() {
		return this.rivalAccount;
	}

	public void setRivalAccount(String rivalAccount) {
		this.rivalAccount = rivalAccount;
	}

	public BigDecimal getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(BigDecimal beginDate) {
		this.beginDate = beginDate;
	}

	public BigDecimal getEndDate() {
		return this.endDate;
	}

	public void setEndDate(BigDecimal endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getCashDate() {
		return this.cashDate;
	}

	public void setCashDate(BigDecimal cashDate) {
		this.cashDate = cashDate;
	}

	public String getInterestDivert() {
		return this.interestDivert;
	}

	public void setInterestDivert(String interestDivert) {
		this.interestDivert = interestDivert;
	}

	public String getAmtSource() {
		return this.amtSource;
	}

	public void setAmtSource(String amtSource) {
		this.amtSource = amtSource;
	}

	public BigDecimal getUpperLimit() {
		return this.upperLimit;
	}

	public void setUpperLimit(BigDecimal upperLimit) {
		this.upperLimit = upperLimit;
	}

	public String getAutoContinueFlag() {
		return this.autoContinueFlag;
	}

	public void setAutoContinueFlag(String autoContinueFlag) {
		this.autoContinueFlag = autoContinueFlag;
	}

	public String getEntrustDirection() {
		return this.entrustDirection;
	}

	public void setEntrustDirection(String entrustDirection) {
		this.entrustDirection = entrustDirection;
	}

	public String getWithInterestFlag() {
		return this.withInterestFlag;
	}

	public void setWithInterestFlag(String withInterestFlag) {
		this.withInterestFlag = withInterestFlag;
	}

	public BigDecimal getInterestAmt() {
		return this.interestAmt;
	}

	public void setInterestAmt(BigDecimal interestAmt) {
		this.interestAmt = interestAmt;
	}

	public BigDecimal getSettleAmt() {
		return this.settleAmt;
	}

	public void setSettleAmt(BigDecimal settleAmt) {
		this.settleAmt = settleAmt;
	}

	public BigDecimal getInterest() {
		return this.interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getInterestDate() {
		return this.interestDate;
	}

	public void setInterestDate(BigDecimal interestDate) {
		this.interestDate = interestDate;
	}

	public BigDecimal getLastInterestEndDate() {
		return this.lastInterestEndDate;
	}

	public void setLastInterestEndDate(BigDecimal lastInterestEndDate) {
		this.lastInterestEndDate = lastInterestEndDate;
	}

	public String getBaseInterest() {
		return this.baseInterest;
	}

	public void setBaseInterest(String baseInterest) {
		this.baseInterest = baseInterest;
	}

	public String getLinkerName() {
		return this.linkerName;
	}

	public void setLinkerName(String linkerName) {
		this.linkerName = linkerName;
	}

	public String getLinkerPhone() {
		return this.linkerPhone;
	}

	public void setLinkerPhone(String linkerPhone) {
		this.linkerPhone = linkerPhone;
	}

	public String getAheadAllow() {
		return this.aheadAllow;
	}

	public void setAheadAllow(String aheadAllow) {
		this.aheadAllow = aheadAllow;
	}

	public BigDecimal getAheadAsNormal() {
		return this.aheadAsNormal;
	}

	public void setAheadAsNormal(BigDecimal aheadAsNormal) {
		this.aheadAsNormal = aheadAsNormal;
	}

	public BigDecimal getBreakDayRate() {
		return this.breakDayRate;
	}

	public void setBreakDayRate(BigDecimal breakDayRate) {
		this.breakDayRate = breakDayRate;
	}

	public BigDecimal getConvertBreakDayRate() {
		return this.convertBreakDayRate;
	}

	public void setConvertBreakDayRate(BigDecimal convertBreakDayRate) {
		this.convertBreakDayRate = convertBreakDayRate;
	}

	public String getSameClientFlag() {
		return this.sameClientFlag;
	}

	public void setSameClientFlag(String sameClientFlag) {
		this.sameClientFlag = sameClientFlag;
	}

	public String getRepurchaseOrg() {
		return this.repurchaseOrg;
	}

	public void setRepurchaseOrg(String repurchaseOrg) {
		this.repurchaseOrg = repurchaseOrg;
	}

	public String getEntrustPurpose() {
		return this.entrustPurpose;
	}

	public void setEntrustPurpose(String entrustPurpose) {
		this.entrustPurpose = entrustPurpose;
	}

	public String getTransitionAccount() {
		return this.transitionAccount;
	}

	public void setTransitionAccount(String transitionAccount) {
		this.transitionAccount = transitionAccount;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getLargePayNo() {
		return this.largePayNo;
	}

	public void setLargePayNo(String largePayNo) {
		this.largePayNo = largePayNo;
	}

	public String getReturnBranch() {
		return this.returnBranch;
	}

	public void setReturnBranch(String returnBranch) {
		this.returnBranch = returnBranch;
	}

	public String getReturnAccount() {
		return this.returnAccount;
	}

	public void setReturnAccount(String returnAccount) {
		this.returnAccount = returnAccount;
	}

	public String getReturnAccountName() {
		return this.returnAccountName;
	}

	public void setReturnAccountName(String returnAccountName) {
		this.returnAccountName = returnAccountName;
	}

	public String getReturnLargePayNo() {
		return this.returnLargePayNo;
	}

	public void setReturnLargePayNo(String returnLargePayNo) {
		this.returnLargePayNo = returnLargePayNo;
	}

	public String getBookBranch() {
		return this.bookBranch;
	}

	public void setBookBranch(String bookBranch) {
		this.bookBranch = bookBranch;
	}

	public String getAttributeBranch() {
		return this.attributeBranch;
	}

	public void setAttributeBranch(String attributeBranch) {
		this.attributeBranch = attributeBranch;
	}

	public String getBookBranchOpenBank() {
		return this.bookBranchOpenBank;
	}

	public void setBookBranchOpenBank(String bookBranchOpenBank) {
		this.bookBranchOpenBank = bookBranchOpenBank;
	}

	public String getBookBranchOpenAccount() {
		return this.bookBranchOpenAccount;
	}

	public void setBookBranchOpenAccount(String bookBranchOpenAccount) {
		this.bookBranchOpenAccount = bookBranchOpenAccount;
	}

	public String getBookBranchOpenName() {
		return this.bookBranchOpenName;
	}

	public void setBookBranchOpenName(String bookBranchOpenName) {
		this.bookBranchOpenName = bookBranchOpenName;
	}

	public String getBookBranchLargePayNo() {
		return this.bookBranchLargePayNo;
	}

	public void setBookBranchLargePayNo(String bookBranchLargePayNo) {
		this.bookBranchLargePayNo = bookBranchLargePayNo;
	}

	public String getBookBranchSwiftCode() {
		return this.bookBranchSwiftCode;
	}

	public void setBookBranchSwiftCode(String bookBranchSwiftCode) {
		this.bookBranchSwiftCode = bookBranchSwiftCode;
	}

	public String getRivalOpenBank() {
		return this.rivalOpenBank;
	}

	public void setRivalOpenBank(String rivalOpenBank) {
		this.rivalOpenBank = rivalOpenBank;
	}

	public String getRivalOpenAccount() {
		return this.rivalOpenAccount;
	}

	public void setRivalOpenAccount(String rivalOpenAccount) {
		this.rivalOpenAccount = rivalOpenAccount;
	}

	public String getRivalOpenName() {
		return this.rivalOpenName;
	}

	public void setRivalOpenName(String rivalOpenName) {
		this.rivalOpenName = rivalOpenName;
	}

	public String getRivalLargePayNo() {
		return this.rivalLargePayNo;
	}

	public void setRivalLargePayNo(String rivalLargePayNo) {
		this.rivalLargePayNo = rivalLargePayNo;
	}

	public String getRivalSwiftCode() {
		return this.rivalSwiftCode;
	}

	public void setRivalSwiftCode(String rivalSwiftCode) {
		this.rivalSwiftCode = rivalSwiftCode;
	}

	public String getAmtConfirmFlag() {
		return this.amtConfirmFlag;
	}

	public void setAmtConfirmFlag(String amtConfirmFlag) {
		this.amtConfirmFlag = amtConfirmFlag;
	}

	public String getAmtSummary() {
		return this.amtSummary;
	}

	public void setAmtSummary(String amtSummary) {
		this.amtSummary = amtSummary;
	}

	public String getReserve() {
		return this.reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	public String getReserve3() {
		return this.reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

}
