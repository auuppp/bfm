package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TmpTbinstpaydatelistId generated by hbm2java
 */
public class TmpTbinstpaydatelistId implements java.io.Serializable {

	private String businNo;
	private BigDecimal legNo;
	private BigDecimal listNo;
	private BigDecimal versionNo;
	private BigDecimal payDate;
	private BigDecimal startDate;
	private BigDecimal endDate;
	private String reserve;
	private String reserve2;
	private String reserve3;
	private BigDecimal lastDate;
	private BigDecimal lastTime;

	public TmpTbinstpaydatelistId() {
	}

	public TmpTbinstpaydatelistId(String businNo, BigDecimal legNo,
			BigDecimal listNo, BigDecimal versionNo, BigDecimal payDate,
			BigDecimal startDate, BigDecimal endDate, String reserve,
			String reserve2, String reserve3, BigDecimal lastDate,
			BigDecimal lastTime) {
		this.businNo = businNo;
		this.legNo = legNo;
		this.listNo = listNo;
		this.versionNo = versionNo;
		this.payDate = payDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.reserve = reserve;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.lastDate = lastDate;
		this.lastTime = lastTime;
	}

	public String getBusinNo() {
		return this.businNo;
	}

	public void setBusinNo(String businNo) {
		this.businNo = businNo;
	}

	public BigDecimal getLegNo() {
		return this.legNo;
	}

	public void setLegNo(BigDecimal legNo) {
		this.legNo = legNo;
	}

	public BigDecimal getListNo() {
		return this.listNo;
	}

	public void setListNo(BigDecimal listNo) {
		this.listNo = listNo;
	}

	public BigDecimal getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(BigDecimal versionNo) {
		this.versionNo = versionNo;
	}

	public BigDecimal getPayDate() {
		return this.payDate;
	}

	public void setPayDate(BigDecimal payDate) {
		this.payDate = payDate;
	}

	public BigDecimal getStartDate() {
		return this.startDate;
	}

	public void setStartDate(BigDecimal startDate) {
		this.startDate = startDate;
	}

	public BigDecimal getEndDate() {
		return this.endDate;
	}

	public void setEndDate(BigDecimal endDate) {
		this.endDate = endDate;
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
		if (!(other instanceof TmpTbinstpaydatelistId))
			return false;
		TmpTbinstpaydatelistId castOther = (TmpTbinstpaydatelistId) other;

		return ((this.getBusinNo() == castOther.getBusinNo()) || (this
				.getBusinNo() != null && castOther.getBusinNo() != null && this
				.getBusinNo().equals(castOther.getBusinNo())))
				&& ((this.getLegNo() == castOther.getLegNo()) || (this
						.getLegNo() != null && castOther.getLegNo() != null && this
						.getLegNo().equals(castOther.getLegNo())))
				&& ((this.getListNo() == castOther.getListNo()) || (this
						.getListNo() != null && castOther.getListNo() != null && this
						.getListNo().equals(castOther.getListNo())))
				&& ((this.getVersionNo() == castOther.getVersionNo()) || (this
						.getVersionNo() != null
						&& castOther.getVersionNo() != null && this
						.getVersionNo().equals(castOther.getVersionNo())))
				&& ((this.getPayDate() == castOther.getPayDate()) || (this
						.getPayDate() != null && castOther.getPayDate() != null && this
						.getPayDate().equals(castOther.getPayDate())))
				&& ((this.getStartDate() == castOther.getStartDate()) || (this
						.getStartDate() != null
						&& castOther.getStartDate() != null && this
						.getStartDate().equals(castOther.getStartDate())))
				&& ((this.getEndDate() == castOther.getEndDate()) || (this
						.getEndDate() != null && castOther.getEndDate() != null && this
						.getEndDate().equals(castOther.getEndDate())))
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

		result = 37 * result
				+ (getBusinNo() == null ? 0 : this.getBusinNo().hashCode());
		result = 37 * result
				+ (getLegNo() == null ? 0 : this.getLegNo().hashCode());
		result = 37 * result
				+ (getListNo() == null ? 0 : this.getListNo().hashCode());
		result = 37 * result
				+ (getVersionNo() == null ? 0 : this.getVersionNo().hashCode());
		result = 37 * result
				+ (getPayDate() == null ? 0 : this.getPayDate().hashCode());
		result = 37 * result
				+ (getStartDate() == null ? 0 : this.getStartDate().hashCode());
		result = 37 * result
				+ (getEndDate() == null ? 0 : this.getEndDate().hashCode());
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
