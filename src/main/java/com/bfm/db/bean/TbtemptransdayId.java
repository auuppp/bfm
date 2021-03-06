package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TbtemptransdayId generated by hbm2java
 */
public class TbtemptransdayId implements java.io.Serializable {

	private String dateType;
	private String assoCode;
	private BigDecimal transDate;
	private BigDecimal lastDate;

	public TbtemptransdayId() {
	}

	public TbtemptransdayId(String dateType, String assoCode,
			BigDecimal transDate, BigDecimal lastDate) {
		this.dateType = dateType;
		this.assoCode = assoCode;
		this.transDate = transDate;
		this.lastDate = lastDate;
	}

	public String getDateType() {
		return this.dateType;
	}

	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public String getAssoCode() {
		return this.assoCode;
	}

	public void setAssoCode(String assoCode) {
		this.assoCode = assoCode;
	}

	public BigDecimal getTransDate() {
		return this.transDate;
	}

	public void setTransDate(BigDecimal transDate) {
		this.transDate = transDate;
	}

	public BigDecimal getLastDate() {
		return this.lastDate;
	}

	public void setLastDate(BigDecimal lastDate) {
		this.lastDate = lastDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbtemptransdayId))
			return false;
		TbtemptransdayId castOther = (TbtemptransdayId) other;

		return ((this.getDateType() == castOther.getDateType()) || (this
				.getDateType() != null && castOther.getDateType() != null && this
				.getDateType().equals(castOther.getDateType())))
				&& ((this.getAssoCode() == castOther.getAssoCode()) || (this
						.getAssoCode() != null
						&& castOther.getAssoCode() != null && this
						.getAssoCode().equals(castOther.getAssoCode())))
				&& ((this.getTransDate() == castOther.getTransDate()) || (this
						.getTransDate() != null
						&& castOther.getTransDate() != null && this
						.getTransDate().equals(castOther.getTransDate())))
				&& ((this.getLastDate() == castOther.getLastDate()) || (this
						.getLastDate() != null
						&& castOther.getLastDate() != null && this
						.getLastDate().equals(castOther.getLastDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDateType() == null ? 0 : this.getDateType().hashCode());
		result = 37 * result
				+ (getAssoCode() == null ? 0 : this.getAssoCode().hashCode());
		result = 37 * result
				+ (getTransDate() == null ? 0 : this.getTransDate().hashCode());
		result = 37 * result
				+ (getLastDate() == null ? 0 : this.getLastDate().hashCode());
		return result;
	}

}
