package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * TsysBranchUserId generated by hbm2java
 */
public class TsysBranchUserId implements java.io.Serializable {

	private String userId;
	private String branchCode;

	public TsysBranchUserId() {
	}

	public TsysBranchUserId(String userId, String branchCode) {
		this.userId = userId;
		this.branchCode = branchCode;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TsysBranchUserId))
			return false;
		TsysBranchUserId castOther = (TsysBranchUserId) other;

		return ((this.getUserId() == castOther.getUserId()) || (this
				.getUserId() != null && castOther.getUserId() != null && this
				.getUserId().equals(castOther.getUserId())))
				&& ((this.getBranchCode() == castOther.getBranchCode()) || (this
						.getBranchCode() != null
						&& castOther.getBranchCode() != null && this
						.getBranchCode().equals(castOther.getBranchCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37
				* result
				+ (getBranchCode() == null ? 0 : this.getBranchCode()
						.hashCode());
		return result;
	}

}