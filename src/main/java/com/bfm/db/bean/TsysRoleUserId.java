package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * TsysRoleUserId generated by hbm2java
 */
public class TsysRoleUserId implements java.io.Serializable {

	private String userCode;
	private String roleCode;
	private String rightFlag;

	public TsysRoleUserId() {
	}

	public TsysRoleUserId(String userCode, String roleCode, String rightFlag) {
		this.userCode = userCode;
		this.roleCode = roleCode;
		this.rightFlag = rightFlag;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRightFlag() {
		return this.rightFlag;
	}

	public void setRightFlag(String rightFlag) {
		this.rightFlag = rightFlag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TsysRoleUserId))
			return false;
		TsysRoleUserId castOther = (TsysRoleUserId) other;

		return ((this.getUserCode() == castOther.getUserCode()) || (this
				.getUserCode() != null && castOther.getUserCode() != null && this
				.getUserCode().equals(castOther.getUserCode())))
				&& ((this.getRoleCode() == castOther.getRoleCode()) || (this
						.getRoleCode() != null
						&& castOther.getRoleCode() != null && this
						.getRoleCode().equals(castOther.getRoleCode())))
				&& ((this.getRightFlag() == castOther.getRightFlag()) || (this
						.getRightFlag() != null
						&& castOther.getRightFlag() != null && this
						.getRightFlag().equals(castOther.getRightFlag())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUserCode() == null ? 0 : this.getUserCode().hashCode());
		result = 37 * result
				+ (getRoleCode() == null ? 0 : this.getRoleCode().hashCode());
		result = 37 * result
				+ (getRightFlag() == null ? 0 : this.getRightFlag().hashCode());
		return result;
	}

}