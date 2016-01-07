package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TbtempinstrcreditassetId generated by hbm2java
 */
public class TbtempinstrcreditassetId implements java.io.Serializable {

	private String dailyInstructionNo;
	private BigDecimal indexDailyModify;

	public TbtempinstrcreditassetId() {
	}

	public TbtempinstrcreditassetId(String dailyInstructionNo,
			BigDecimal indexDailyModify) {
		this.dailyInstructionNo = dailyInstructionNo;
		this.indexDailyModify = indexDailyModify;
	}

	public String getDailyInstructionNo() {
		return this.dailyInstructionNo;
	}

	public void setDailyInstructionNo(String dailyInstructionNo) {
		this.dailyInstructionNo = dailyInstructionNo;
	}

	public BigDecimal getIndexDailyModify() {
		return this.indexDailyModify;
	}

	public void setIndexDailyModify(BigDecimal indexDailyModify) {
		this.indexDailyModify = indexDailyModify;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbtempinstrcreditassetId))
			return false;
		TbtempinstrcreditassetId castOther = (TbtempinstrcreditassetId) other;

		return ((this.getDailyInstructionNo() == castOther
				.getDailyInstructionNo()) || (this.getDailyInstructionNo() != null
				&& castOther.getDailyInstructionNo() != null && this
				.getDailyInstructionNo().equals(
						castOther.getDailyInstructionNo())))
				&& ((this.getIndexDailyModify() == castOther
						.getIndexDailyModify()) || (this.getIndexDailyModify() != null
						&& castOther.getIndexDailyModify() != null && this
						.getIndexDailyModify().equals(
								castOther.getIndexDailyModify())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDailyInstructionNo() == null ? 0 : this
						.getDailyInstructionNo().hashCode());
		result = 37
				* result
				+ (getIndexDailyModify() == null ? 0 : this
						.getIndexDailyModify().hashCode());
		return result;
	}

}
