package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TmpAtbcashflowId generated by hbm2java
 */
public class TmpAtbcashflowId implements java.io.Serializable {

	private String id;
	private String subflag;
	private String productid;
	private String assetCode;
	private String assetPort;
	private String accDate;
	private String transDate;
	private String currency;
	private BigDecimal shares;
	private BigDecimal amount;
	private char dealflag;
	private String certSerialno;
	private String assetType;
	private String tranCode;
	private String tranSubCode;
	private String impDate;
	private String operator;
	private String calBegin;
	private String calEnd;
	private String srcCashType;
	private char srcCashFlag;
	private String srcAcct;
	private String srcSerialNo;
	private String srcTranId;
	private String srcCashSubtype;
	private String rivalNo;
	private String bak;
	private String memo;
	private String innerFundNo;
	private String srcId;
	private String bookBranch;

	public TmpAtbcashflowId() {
	}

	public TmpAtbcashflowId(String id, String subflag, String productid,
			char dealflag, String assetType, String impDate,
			String srcCashType, char srcCashFlag, String srcAcct) {
		this.id = id;
		this.subflag = subflag;
		this.productid = productid;
		this.dealflag = dealflag;
		this.assetType = assetType;
		this.impDate = impDate;
		this.srcCashType = srcCashType;
		this.srcCashFlag = srcCashFlag;
		this.srcAcct = srcAcct;
	}

	public TmpAtbcashflowId(String id, String subflag, String productid,
			String assetCode, String assetPort, String accDate,
			String transDate, String currency, BigDecimal shares,
			BigDecimal amount, char dealflag, String certSerialno,
			String assetType, String tranCode, String tranSubCode,
			String impDate, String operator, String calBegin, String calEnd,
			String srcCashType, char srcCashFlag, String srcAcct,
			String srcSerialNo, String srcTranId, String srcCashSubtype,
			String rivalNo, String bak, String memo, String innerFundNo,
			String srcId, String bookBranch) {
		this.id = id;
		this.subflag = subflag;
		this.productid = productid;
		this.assetCode = assetCode;
		this.assetPort = assetPort;
		this.accDate = accDate;
		this.transDate = transDate;
		this.currency = currency;
		this.shares = shares;
		this.amount = amount;
		this.dealflag = dealflag;
		this.certSerialno = certSerialno;
		this.assetType = assetType;
		this.tranCode = tranCode;
		this.tranSubCode = tranSubCode;
		this.impDate = impDate;
		this.operator = operator;
		this.calBegin = calBegin;
		this.calEnd = calEnd;
		this.srcCashType = srcCashType;
		this.srcCashFlag = srcCashFlag;
		this.srcAcct = srcAcct;
		this.srcSerialNo = srcSerialNo;
		this.srcTranId = srcTranId;
		this.srcCashSubtype = srcCashSubtype;
		this.rivalNo = rivalNo;
		this.bak = bak;
		this.memo = memo;
		this.innerFundNo = innerFundNo;
		this.srcId = srcId;
		this.bookBranch = bookBranch;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubflag() {
		return this.subflag;
	}

	public void setSubflag(String subflag) {
		this.subflag = subflag;
	}

	public String getProductid() {
		return this.productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getAssetCode() {
		return this.assetCode;
	}

	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	public String getAssetPort() {
		return this.assetPort;
	}

	public void setAssetPort(String assetPort) {
		this.assetPort = assetPort;
	}

	public String getAccDate() {
		return this.accDate;
	}

	public void setAccDate(String accDate) {
		this.accDate = accDate;
	}

	public String getTransDate() {
		return this.transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getShares() {
		return this.shares;
	}

	public void setShares(BigDecimal shares) {
		this.shares = shares;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public char getDealflag() {
		return this.dealflag;
	}

	public void setDealflag(char dealflag) {
		this.dealflag = dealflag;
	}

	public String getCertSerialno() {
		return this.certSerialno;
	}

	public void setCertSerialno(String certSerialno) {
		this.certSerialno = certSerialno;
	}

	public String getAssetType() {
		return this.assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getTranCode() {
		return this.tranCode;
	}

	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

	public String getTranSubCode() {
		return this.tranSubCode;
	}

	public void setTranSubCode(String tranSubCode) {
		this.tranSubCode = tranSubCode;
	}

	public String getImpDate() {
		return this.impDate;
	}

	public void setImpDate(String impDate) {
		this.impDate = impDate;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCalBegin() {
		return this.calBegin;
	}

	public void setCalBegin(String calBegin) {
		this.calBegin = calBegin;
	}

	public String getCalEnd() {
		return this.calEnd;
	}

	public void setCalEnd(String calEnd) {
		this.calEnd = calEnd;
	}

	public String getSrcCashType() {
		return this.srcCashType;
	}

	public void setSrcCashType(String srcCashType) {
		this.srcCashType = srcCashType;
	}

	public char getSrcCashFlag() {
		return this.srcCashFlag;
	}

	public void setSrcCashFlag(char srcCashFlag) {
		this.srcCashFlag = srcCashFlag;
	}

	public String getSrcAcct() {
		return this.srcAcct;
	}

	public void setSrcAcct(String srcAcct) {
		this.srcAcct = srcAcct;
	}

	public String getSrcSerialNo() {
		return this.srcSerialNo;
	}

	public void setSrcSerialNo(String srcSerialNo) {
		this.srcSerialNo = srcSerialNo;
	}

	public String getSrcTranId() {
		return this.srcTranId;
	}

	public void setSrcTranId(String srcTranId) {
		this.srcTranId = srcTranId;
	}

	public String getSrcCashSubtype() {
		return this.srcCashSubtype;
	}

	public void setSrcCashSubtype(String srcCashSubtype) {
		this.srcCashSubtype = srcCashSubtype;
	}

	public String getRivalNo() {
		return this.rivalNo;
	}

	public void setRivalNo(String rivalNo) {
		this.rivalNo = rivalNo;
	}

	public String getBak() {
		return this.bak;
	}

	public void setBak(String bak) {
		this.bak = bak;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getInnerFundNo() {
		return this.innerFundNo;
	}

	public void setInnerFundNo(String innerFundNo) {
		this.innerFundNo = innerFundNo;
	}

	public String getSrcId() {
		return this.srcId;
	}

	public void setSrcId(String srcId) {
		this.srcId = srcId;
	}

	public String getBookBranch() {
		return this.bookBranch;
	}

	public void setBookBranch(String bookBranch) {
		this.bookBranch = bookBranch;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TmpAtbcashflowId))
			return false;
		TmpAtbcashflowId castOther = (TmpAtbcashflowId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getSubflag() == castOther.getSubflag()) || (this
						.getSubflag() != null && castOther.getSubflag() != null && this
						.getSubflag().equals(castOther.getSubflag())))
				&& ((this.getProductid() == castOther.getProductid()) || (this
						.getProductid() != null
						&& castOther.getProductid() != null && this
						.getProductid().equals(castOther.getProductid())))
				&& ((this.getAssetCode() == castOther.getAssetCode()) || (this
						.getAssetCode() != null
						&& castOther.getAssetCode() != null && this
						.getAssetCode().equals(castOther.getAssetCode())))
				&& ((this.getAssetPort() == castOther.getAssetPort()) || (this
						.getAssetPort() != null
						&& castOther.getAssetPort() != null && this
						.getAssetPort().equals(castOther.getAssetPort())))
				&& ((this.getAccDate() == castOther.getAccDate()) || (this
						.getAccDate() != null && castOther.getAccDate() != null && this
						.getAccDate().equals(castOther.getAccDate())))
				&& ((this.getTransDate() == castOther.getTransDate()) || (this
						.getTransDate() != null
						&& castOther.getTransDate() != null && this
						.getTransDate().equals(castOther.getTransDate())))
				&& ((this.getCurrency() == castOther.getCurrency()) || (this
						.getCurrency() != null
						&& castOther.getCurrency() != null && this
						.getCurrency().equals(castOther.getCurrency())))
				&& ((this.getShares() == castOther.getShares()) || (this
						.getShares() != null && castOther.getShares() != null && this
						.getShares().equals(castOther.getShares())))
				&& ((this.getAmount() == castOther.getAmount()) || (this
						.getAmount() != null && castOther.getAmount() != null && this
						.getAmount().equals(castOther.getAmount())))
				&& (this.getDealflag() == castOther.getDealflag())
				&& ((this.getCertSerialno() == castOther.getCertSerialno()) || (this
						.getCertSerialno() != null
						&& castOther.getCertSerialno() != null && this
						.getCertSerialno().equals(castOther.getCertSerialno())))
				&& ((this.getAssetType() == castOther.getAssetType()) || (this
						.getAssetType() != null
						&& castOther.getAssetType() != null && this
						.getAssetType().equals(castOther.getAssetType())))
				&& ((this.getTranCode() == castOther.getTranCode()) || (this
						.getTranCode() != null
						&& castOther.getTranCode() != null && this
						.getTranCode().equals(castOther.getTranCode())))
				&& ((this.getTranSubCode() == castOther.getTranSubCode()) || (this
						.getTranSubCode() != null
						&& castOther.getTranSubCode() != null && this
						.getTranSubCode().equals(castOther.getTranSubCode())))
				&& ((this.getImpDate() == castOther.getImpDate()) || (this
						.getImpDate() != null && castOther.getImpDate() != null && this
						.getImpDate().equals(castOther.getImpDate())))
				&& ((this.getOperator() == castOther.getOperator()) || (this
						.getOperator() != null
						&& castOther.getOperator() != null && this
						.getOperator().equals(castOther.getOperator())))
				&& ((this.getCalBegin() == castOther.getCalBegin()) || (this
						.getCalBegin() != null
						&& castOther.getCalBegin() != null && this
						.getCalBegin().equals(castOther.getCalBegin())))
				&& ((this.getCalEnd() == castOther.getCalEnd()) || (this
						.getCalEnd() != null && castOther.getCalEnd() != null && this
						.getCalEnd().equals(castOther.getCalEnd())))
				&& ((this.getSrcCashType() == castOther.getSrcCashType()) || (this
						.getSrcCashType() != null
						&& castOther.getSrcCashType() != null && this
						.getSrcCashType().equals(castOther.getSrcCashType())))
				&& (this.getSrcCashFlag() == castOther.getSrcCashFlag())
				&& ((this.getSrcAcct() == castOther.getSrcAcct()) || (this
						.getSrcAcct() != null && castOther.getSrcAcct() != null && this
						.getSrcAcct().equals(castOther.getSrcAcct())))
				&& ((this.getSrcSerialNo() == castOther.getSrcSerialNo()) || (this
						.getSrcSerialNo() != null
						&& castOther.getSrcSerialNo() != null && this
						.getSrcSerialNo().equals(castOther.getSrcSerialNo())))
				&& ((this.getSrcTranId() == castOther.getSrcTranId()) || (this
						.getSrcTranId() != null
						&& castOther.getSrcTranId() != null && this
						.getSrcTranId().equals(castOther.getSrcTranId())))
				&& ((this.getSrcCashSubtype() == castOther.getSrcCashSubtype()) || (this
						.getSrcCashSubtype() != null
						&& castOther.getSrcCashSubtype() != null && this
						.getSrcCashSubtype().equals(
								castOther.getSrcCashSubtype())))
				&& ((this.getRivalNo() == castOther.getRivalNo()) || (this
						.getRivalNo() != null && castOther.getRivalNo() != null && this
						.getRivalNo().equals(castOther.getRivalNo())))
				&& ((this.getBak() == castOther.getBak()) || (this.getBak() != null
						&& castOther.getBak() != null && this.getBak().equals(
						castOther.getBak())))
				&& ((this.getMemo() == castOther.getMemo()) || (this.getMemo() != null
						&& castOther.getMemo() != null && this.getMemo()
						.equals(castOther.getMemo())))
				&& ((this.getInnerFundNo() == castOther.getInnerFundNo()) || (this
						.getInnerFundNo() != null
						&& castOther.getInnerFundNo() != null && this
						.getInnerFundNo().equals(castOther.getInnerFundNo())))
				&& ((this.getSrcId() == castOther.getSrcId()) || (this
						.getSrcId() != null && castOther.getSrcId() != null && this
						.getSrcId().equals(castOther.getSrcId())))
				&& ((this.getBookBranch() == castOther.getBookBranch()) || (this
						.getBookBranch() != null
						&& castOther.getBookBranch() != null && this
						.getBookBranch().equals(castOther.getBookBranch())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getSubflag() == null ? 0 : this.getSubflag().hashCode());
		result = 37 * result
				+ (getProductid() == null ? 0 : this.getProductid().hashCode());
		result = 37 * result
				+ (getAssetCode() == null ? 0 : this.getAssetCode().hashCode());
		result = 37 * result
				+ (getAssetPort() == null ? 0 : this.getAssetPort().hashCode());
		result = 37 * result
				+ (getAccDate() == null ? 0 : this.getAccDate().hashCode());
		result = 37 * result
				+ (getTransDate() == null ? 0 : this.getTransDate().hashCode());
		result = 37 * result
				+ (getCurrency() == null ? 0 : this.getCurrency().hashCode());
		result = 37 * result
				+ (getShares() == null ? 0 : this.getShares().hashCode());
		result = 37 * result
				+ (getAmount() == null ? 0 : this.getAmount().hashCode());
		result = 37 * result + this.getDealflag();
		result = 37
				* result
				+ (getCertSerialno() == null ? 0 : this.getCertSerialno()
						.hashCode());
		result = 37 * result
				+ (getAssetType() == null ? 0 : this.getAssetType().hashCode());
		result = 37 * result
				+ (getTranCode() == null ? 0 : this.getTranCode().hashCode());
		result = 37
				* result
				+ (getTranSubCode() == null ? 0 : this.getTranSubCode()
						.hashCode());
		result = 37 * result
				+ (getImpDate() == null ? 0 : this.getImpDate().hashCode());
		result = 37 * result
				+ (getOperator() == null ? 0 : this.getOperator().hashCode());
		result = 37 * result
				+ (getCalBegin() == null ? 0 : this.getCalBegin().hashCode());
		result = 37 * result
				+ (getCalEnd() == null ? 0 : this.getCalEnd().hashCode());
		result = 37
				* result
				+ (getSrcCashType() == null ? 0 : this.getSrcCashType()
						.hashCode());
		result = 37 * result + this.getSrcCashFlag();
		result = 37 * result
				+ (getSrcAcct() == null ? 0 : this.getSrcAcct().hashCode());
		result = 37
				* result
				+ (getSrcSerialNo() == null ? 0 : this.getSrcSerialNo()
						.hashCode());
		result = 37 * result
				+ (getSrcTranId() == null ? 0 : this.getSrcTranId().hashCode());
		result = 37
				* result
				+ (getSrcCashSubtype() == null ? 0 : this.getSrcCashSubtype()
						.hashCode());
		result = 37 * result
				+ (getRivalNo() == null ? 0 : this.getRivalNo().hashCode());
		result = 37 * result
				+ (getBak() == null ? 0 : this.getBak().hashCode());
		result = 37 * result
				+ (getMemo() == null ? 0 : this.getMemo().hashCode());
		result = 37
				* result
				+ (getInnerFundNo() == null ? 0 : this.getInnerFundNo()
						.hashCode());
		result = 37 * result
				+ (getSrcId() == null ? 0 : this.getSrcId().hashCode());
		result = 37
				* result
				+ (getBookBranch() == null ? 0 : this.getBookBranch()
						.hashCode());
		return result;
	}

}
