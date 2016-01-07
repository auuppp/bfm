package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TmpTbcreditdetailId generated by hbm2java
 */
public class TmpTbcreditdetailId implements java.io.Serializable {

	private String totalCreditId;
	private BigDecimal creditType;
	private String creditSerialNo;
	private String opFlag;
	private String relateNo;
	private BigDecimal tradeDate;
	private String combiNo;
	private String interCode;
	private String businClass;
	private String rivalNo;
	private String oriCurrType;
	private BigDecimal oriBalance;
	private String currType;
	private BigDecimal oriCreditBalance;
	private BigDecimal balance;
	private BigDecimal postBalance;
	private String status;
	private String reserve;
	private BigDecimal notEffectiveDate;
	private String notEffectiveReason;

	public TmpTbcreditdetailId() {
	}

	public TmpTbcreditdetailId(String totalCreditId, BigDecimal creditType,
			String creditSerialNo, String opFlag, String relateNo,
			BigDecimal tradeDate, String combiNo, String interCode,
			String businClass, String rivalNo, String oriCurrType,
			BigDecimal oriBalance, String currType,
			BigDecimal oriCreditBalance, BigDecimal balance,
			BigDecimal postBalance, String status, String reserve,
			BigDecimal notEffectiveDate, String notEffectiveReason) {
		this.totalCreditId = totalCreditId;
		this.creditType = creditType;
		this.creditSerialNo = creditSerialNo;
		this.opFlag = opFlag;
		this.relateNo = relateNo;
		this.tradeDate = tradeDate;
		this.combiNo = combiNo;
		this.interCode = interCode;
		this.businClass = businClass;
		this.rivalNo = rivalNo;
		this.oriCurrType = oriCurrType;
		this.oriBalance = oriBalance;
		this.currType = currType;
		this.oriCreditBalance = oriCreditBalance;
		this.balance = balance;
		this.postBalance = postBalance;
		this.status = status;
		this.reserve = reserve;
		this.notEffectiveDate = notEffectiveDate;
		this.notEffectiveReason = notEffectiveReason;
	}

	public String getTotalCreditId() {
		return this.totalCreditId;
	}

	public void setTotalCreditId(String totalCreditId) {
		this.totalCreditId = totalCreditId;
	}

	public BigDecimal getCreditType() {
		return this.creditType;
	}

	public void setCreditType(BigDecimal creditType) {
		this.creditType = creditType;
	}

	public String getCreditSerialNo() {
		return this.creditSerialNo;
	}

	public void setCreditSerialNo(String creditSerialNo) {
		this.creditSerialNo = creditSerialNo;
	}

	public String getOpFlag() {
		return this.opFlag;
	}

	public void setOpFlag(String opFlag) {
		this.opFlag = opFlag;
	}

	public String getRelateNo() {
		return this.relateNo;
	}

	public void setRelateNo(String relateNo) {
		this.relateNo = relateNo;
	}

	public BigDecimal getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(BigDecimal tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getCombiNo() {
		return this.combiNo;
	}

	public void setCombiNo(String combiNo) {
		this.combiNo = combiNo;
	}

	public String getInterCode() {
		return this.interCode;
	}

	public void setInterCode(String interCode) {
		this.interCode = interCode;
	}

	public String getBusinClass() {
		return this.businClass;
	}

	public void setBusinClass(String businClass) {
		this.businClass = businClass;
	}

	public String getRivalNo() {
		return this.rivalNo;
	}

	public void setRivalNo(String rivalNo) {
		this.rivalNo = rivalNo;
	}

	public String getOriCurrType() {
		return this.oriCurrType;
	}

	public void setOriCurrType(String oriCurrType) {
		this.oriCurrType = oriCurrType;
	}

	public BigDecimal getOriBalance() {
		return this.oriBalance;
	}

	public void setOriBalance(BigDecimal oriBalance) {
		this.oriBalance = oriBalance;
	}

	public String getCurrType() {
		return this.currType;
	}

	public void setCurrType(String currType) {
		this.currType = currType;
	}

	public BigDecimal getOriCreditBalance() {
		return this.oriCreditBalance;
	}

	public void setOriCreditBalance(BigDecimal oriCreditBalance) {
		this.oriCreditBalance = oriCreditBalance;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getPostBalance() {
		return this.postBalance;
	}

	public void setPostBalance(BigDecimal postBalance) {
		this.postBalance = postBalance;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReserve() {
		return this.reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public BigDecimal getNotEffectiveDate() {
		return this.notEffectiveDate;
	}

	public void setNotEffectiveDate(BigDecimal notEffectiveDate) {
		this.notEffectiveDate = notEffectiveDate;
	}

	public String getNotEffectiveReason() {
		return this.notEffectiveReason;
	}

	public void setNotEffectiveReason(String notEffectiveReason) {
		this.notEffectiveReason = notEffectiveReason;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TmpTbcreditdetailId))
			return false;
		TmpTbcreditdetailId castOther = (TmpTbcreditdetailId) other;

		return ((this.getTotalCreditId() == castOther.getTotalCreditId()) || (this
				.getTotalCreditId() != null
				&& castOther.getTotalCreditId() != null && this
				.getTotalCreditId().equals(castOther.getTotalCreditId())))
				&& ((this.getCreditType() == castOther.getCreditType()) || (this
						.getCreditType() != null
						&& castOther.getCreditType() != null && this
						.getCreditType().equals(castOther.getCreditType())))
				&& ((this.getCreditSerialNo() == castOther.getCreditSerialNo()) || (this
						.getCreditSerialNo() != null
						&& castOther.getCreditSerialNo() != null && this
						.getCreditSerialNo().equals(
								castOther.getCreditSerialNo())))
				&& ((this.getOpFlag() == castOther.getOpFlag()) || (this
						.getOpFlag() != null && castOther.getOpFlag() != null && this
						.getOpFlag().equals(castOther.getOpFlag())))
				&& ((this.getRelateNo() == castOther.getRelateNo()) || (this
						.getRelateNo() != null
						&& castOther.getRelateNo() != null && this
						.getRelateNo().equals(castOther.getRelateNo())))
				&& ((this.getTradeDate() == castOther.getTradeDate()) || (this
						.getTradeDate() != null
						&& castOther.getTradeDate() != null && this
						.getTradeDate().equals(castOther.getTradeDate())))
				&& ((this.getCombiNo() == castOther.getCombiNo()) || (this
						.getCombiNo() != null && castOther.getCombiNo() != null && this
						.getCombiNo().equals(castOther.getCombiNo())))
				&& ((this.getInterCode() == castOther.getInterCode()) || (this
						.getInterCode() != null
						&& castOther.getInterCode() != null && this
						.getInterCode().equals(castOther.getInterCode())))
				&& ((this.getBusinClass() == castOther.getBusinClass()) || (this
						.getBusinClass() != null
						&& castOther.getBusinClass() != null && this
						.getBusinClass().equals(castOther.getBusinClass())))
				&& ((this.getRivalNo() == castOther.getRivalNo()) || (this
						.getRivalNo() != null && castOther.getRivalNo() != null && this
						.getRivalNo().equals(castOther.getRivalNo())))
				&& ((this.getOriCurrType() == castOther.getOriCurrType()) || (this
						.getOriCurrType() != null
						&& castOther.getOriCurrType() != null && this
						.getOriCurrType().equals(castOther.getOriCurrType())))
				&& ((this.getOriBalance() == castOther.getOriBalance()) || (this
						.getOriBalance() != null
						&& castOther.getOriBalance() != null && this
						.getOriBalance().equals(castOther.getOriBalance())))
				&& ((this.getCurrType() == castOther.getCurrType()) || (this
						.getCurrType() != null
						&& castOther.getCurrType() != null && this
						.getCurrType().equals(castOther.getCurrType())))
				&& ((this.getOriCreditBalance() == castOther
						.getOriCreditBalance()) || (this.getOriCreditBalance() != null
						&& castOther.getOriCreditBalance() != null && this
						.getOriCreditBalance().equals(
								castOther.getOriCreditBalance())))
				&& ((this.getBalance() == castOther.getBalance()) || (this
						.getBalance() != null && castOther.getBalance() != null && this
						.getBalance().equals(castOther.getBalance())))
				&& ((this.getPostBalance() == castOther.getPostBalance()) || (this
						.getPostBalance() != null
						&& castOther.getPostBalance() != null && this
						.getPostBalance().equals(castOther.getPostBalance())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())))
				&& ((this.getReserve() == castOther.getReserve()) || (this
						.getReserve() != null && castOther.getReserve() != null && this
						.getReserve().equals(castOther.getReserve())))
				&& ((this.getNotEffectiveDate() == castOther
						.getNotEffectiveDate()) || (this.getNotEffectiveDate() != null
						&& castOther.getNotEffectiveDate() != null && this
						.getNotEffectiveDate().equals(
								castOther.getNotEffectiveDate())))
				&& ((this.getNotEffectiveReason() == castOther
						.getNotEffectiveReason()) || (this
						.getNotEffectiveReason() != null
						&& castOther.getNotEffectiveReason() != null && this
						.getNotEffectiveReason().equals(
								castOther.getNotEffectiveReason())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTotalCreditId() == null ? 0 : this.getTotalCreditId()
						.hashCode());
		result = 37
				* result
				+ (getCreditType() == null ? 0 : this.getCreditType()
						.hashCode());
		result = 37
				* result
				+ (getCreditSerialNo() == null ? 0 : this.getCreditSerialNo()
						.hashCode());
		result = 37 * result
				+ (getOpFlag() == null ? 0 : this.getOpFlag().hashCode());
		result = 37 * result
				+ (getRelateNo() == null ? 0 : this.getRelateNo().hashCode());
		result = 37 * result
				+ (getTradeDate() == null ? 0 : this.getTradeDate().hashCode());
		result = 37 * result
				+ (getCombiNo() == null ? 0 : this.getCombiNo().hashCode());
		result = 37 * result
				+ (getInterCode() == null ? 0 : this.getInterCode().hashCode());
		result = 37
				* result
				+ (getBusinClass() == null ? 0 : this.getBusinClass()
						.hashCode());
		result = 37 * result
				+ (getRivalNo() == null ? 0 : this.getRivalNo().hashCode());
		result = 37
				* result
				+ (getOriCurrType() == null ? 0 : this.getOriCurrType()
						.hashCode());
		result = 37
				* result
				+ (getOriBalance() == null ? 0 : this.getOriBalance()
						.hashCode());
		result = 37 * result
				+ (getCurrType() == null ? 0 : this.getCurrType().hashCode());
		result = 37
				* result
				+ (getOriCreditBalance() == null ? 0 : this
						.getOriCreditBalance().hashCode());
		result = 37 * result
				+ (getBalance() == null ? 0 : this.getBalance().hashCode());
		result = 37
				* result
				+ (getPostBalance() == null ? 0 : this.getPostBalance()
						.hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result
				+ (getReserve() == null ? 0 : this.getReserve().hashCode());
		result = 37
				* result
				+ (getNotEffectiveDate() == null ? 0 : this
						.getNotEffectiveDate().hashCode());
		result = 37
				* result
				+ (getNotEffectiveReason() == null ? 0 : this
						.getNotEffectiveReason().hashCode());
		return result;
	}

}
