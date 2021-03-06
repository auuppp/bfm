package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TmpTbassetrealdealId generated by hbm2java
 */
public class TmpTbassetrealdealId implements java.io.Serializable {

	private String dealSerialNo;
	private BigDecimal versionNo;
	private BigDecimal price;
	private BigDecimal dealAmount;
	private String dealNo;
	private BigDecimal dealTime;
	private BigDecimal innerFee;
	private String withInterestFlag;
	private BigDecimal interestAmt;
	private BigDecimal settleAmt;
	private BigDecimal discountAmt;
	private String reserve;
	private String reserve2;
	private String reserve3;
	private BigDecimal lastDate;
	private BigDecimal lastTime;

	public TmpTbassetrealdealId() {
	}

	public TmpTbassetrealdealId(String dealSerialNo, BigDecimal versionNo,
			BigDecimal price, BigDecimal dealAmount, String dealNo,
			BigDecimal dealTime, BigDecimal innerFee, String withInterestFlag,
			BigDecimal interestAmt, BigDecimal settleAmt,
			BigDecimal discountAmt, String reserve, String reserve2,
			String reserve3, BigDecimal lastDate, BigDecimal lastTime) {
		this.dealSerialNo = dealSerialNo;
		this.versionNo = versionNo;
		this.price = price;
		this.dealAmount = dealAmount;
		this.dealNo = dealNo;
		this.dealTime = dealTime;
		this.innerFee = innerFee;
		this.withInterestFlag = withInterestFlag;
		this.interestAmt = interestAmt;
		this.settleAmt = settleAmt;
		this.discountAmt = discountAmt;
		this.reserve = reserve;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.lastDate = lastDate;
		this.lastTime = lastTime;
	}

	public String getDealSerialNo() {
		return this.dealSerialNo;
	}

	public void setDealSerialNo(String dealSerialNo) {
		this.dealSerialNo = dealSerialNo;
	}

	public BigDecimal getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(BigDecimal versionNo) {
		this.versionNo = versionNo;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getDealAmount() {
		return this.dealAmount;
	}

	public void setDealAmount(BigDecimal dealAmount) {
		this.dealAmount = dealAmount;
	}

	public String getDealNo() {
		return this.dealNo;
	}

	public void setDealNo(String dealNo) {
		this.dealNo = dealNo;
	}

	public BigDecimal getDealTime() {
		return this.dealTime;
	}

	public void setDealTime(BigDecimal dealTime) {
		this.dealTime = dealTime;
	}

	public BigDecimal getInnerFee() {
		return this.innerFee;
	}

	public void setInnerFee(BigDecimal innerFee) {
		this.innerFee = innerFee;
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

	public BigDecimal getDiscountAmt() {
		return this.discountAmt;
	}

	public void setDiscountAmt(BigDecimal discountAmt) {
		this.discountAmt = discountAmt;
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

	public BigDecimal getLastDate() {
		return this.lastDate;
	}

	public void setLastDate(BigDecimal lastDate) {
		this.lastDate = lastDate;
	}

	public BigDecimal getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(BigDecimal lastTime) {
		this.lastTime = lastTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TmpTbassetrealdealId))
			return false;
		TmpTbassetrealdealId castOther = (TmpTbassetrealdealId) other;

		return ((this.getDealSerialNo() == castOther.getDealSerialNo()) || (this
				.getDealSerialNo() != null
				&& castOther.getDealSerialNo() != null && this
				.getDealSerialNo().equals(castOther.getDealSerialNo())))
				&& ((this.getVersionNo() == castOther.getVersionNo()) || (this
						.getVersionNo() != null
						&& castOther.getVersionNo() != null && this
						.getVersionNo().equals(castOther.getVersionNo())))
				&& ((this.getPrice() == castOther.getPrice()) || (this
						.getPrice() != null && castOther.getPrice() != null && this
						.getPrice().equals(castOther.getPrice())))
				&& ((this.getDealAmount() == castOther.getDealAmount()) || (this
						.getDealAmount() != null
						&& castOther.getDealAmount() != null && this
						.getDealAmount().equals(castOther.getDealAmount())))
				&& ((this.getDealNo() == castOther.getDealNo()) || (this
						.getDealNo() != null && castOther.getDealNo() != null && this
						.getDealNo().equals(castOther.getDealNo())))
				&& ((this.getDealTime() == castOther.getDealTime()) || (this
						.getDealTime() != null
						&& castOther.getDealTime() != null && this
						.getDealTime().equals(castOther.getDealTime())))
				&& ((this.getInnerFee() == castOther.getInnerFee()) || (this
						.getInnerFee() != null
						&& castOther.getInnerFee() != null && this
						.getInnerFee().equals(castOther.getInnerFee())))
				&& ((this.getWithInterestFlag() == castOther
						.getWithInterestFlag()) || (this.getWithInterestFlag() != null
						&& castOther.getWithInterestFlag() != null && this
						.getWithInterestFlag().equals(
								castOther.getWithInterestFlag())))
				&& ((this.getInterestAmt() == castOther.getInterestAmt()) || (this
						.getInterestAmt() != null
						&& castOther.getInterestAmt() != null && this
						.getInterestAmt().equals(castOther.getInterestAmt())))
				&& ((this.getSettleAmt() == castOther.getSettleAmt()) || (this
						.getSettleAmt() != null
						&& castOther.getSettleAmt() != null && this
						.getSettleAmt().equals(castOther.getSettleAmt())))
				&& ((this.getDiscountAmt() == castOther.getDiscountAmt()) || (this
						.getDiscountAmt() != null
						&& castOther.getDiscountAmt() != null && this
						.getDiscountAmt().equals(castOther.getDiscountAmt())))
				&& ((this.getReserve() == castOther.getReserve()) || (this
						.getReserve() != null && castOther.getReserve() != null && this
						.getReserve().equals(castOther.getReserve())))
				&& ((this.getReserve2() == castOther.getReserve2()) || (this
						.getReserve2() != null
						&& castOther.getReserve2() != null && this
						.getReserve2().equals(castOther.getReserve2())))
				&& ((this.getReserve3() == castOther.getReserve3()) || (this
						.getReserve3() != null
						&& castOther.getReserve3() != null && this
						.getReserve3().equals(castOther.getReserve3())))
				&& ((this.getLastDate() == castOther.getLastDate()) || (this
						.getLastDate() != null
						&& castOther.getLastDate() != null && this
						.getLastDate().equals(castOther.getLastDate())))
				&& ((this.getLastTime() == castOther.getLastTime()) || (this
						.getLastTime() != null
						&& castOther.getLastTime() != null && this
						.getLastTime().equals(castOther.getLastTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDealSerialNo() == null ? 0 : this.getDealSerialNo()
						.hashCode());
		result = 37 * result
				+ (getVersionNo() == null ? 0 : this.getVersionNo().hashCode());
		result = 37 * result
				+ (getPrice() == null ? 0 : this.getPrice().hashCode());
		result = 37
				* result
				+ (getDealAmount() == null ? 0 : this.getDealAmount()
						.hashCode());
		result = 37 * result
				+ (getDealNo() == null ? 0 : this.getDealNo().hashCode());
		result = 37 * result
				+ (getDealTime() == null ? 0 : this.getDealTime().hashCode());
		result = 37 * result
				+ (getInnerFee() == null ? 0 : this.getInnerFee().hashCode());
		result = 37
				* result
				+ (getWithInterestFlag() == null ? 0 : this
						.getWithInterestFlag().hashCode());
		result = 37
				* result
				+ (getInterestAmt() == null ? 0 : this.getInterestAmt()
						.hashCode());
		result = 37 * result
				+ (getSettleAmt() == null ? 0 : this.getSettleAmt().hashCode());
		result = 37
				* result
				+ (getDiscountAmt() == null ? 0 : this.getDiscountAmt()
						.hashCode());
		result = 37 * result
				+ (getReserve() == null ? 0 : this.getReserve().hashCode());
		result = 37 * result
				+ (getReserve2() == null ? 0 : this.getReserve2().hashCode());
		result = 37 * result
				+ (getReserve3() == null ? 0 : this.getReserve3().hashCode());
		result = 37 * result
				+ (getLastDate() == null ? 0 : this.getLastDate().hashCode());
		result = 37 * result
				+ (getLastTime() == null ? 0 : this.getLastTime().hashCode());
		return result;
	}

}
