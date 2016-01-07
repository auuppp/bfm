package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TsysUser generated by hbm2java
 */
public class TsysUser implements java.io.Serializable {

	private String userId;
	private String branchCode;
	private String depCode;
	private String userName;
	private String userPwd;
	private String userType;
	private String userStatus;
	private String lockStatus;
	private BigDecimal createDate;
	private BigDecimal modifyDate;
	private BigDecimal passModifyDate;
	private String remark;
	private String extField1;
	private String extField2;
	private String extField3;
	private String extField4;
	private String extField5;

	public TsysUser() {
	}

	public TsysUser(String userId, String userName, String userPwd,
			String userType, String userStatus, String lockStatus,
			BigDecimal createDate) {
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userType = userType;
		this.userStatus = userStatus;
		this.lockStatus = lockStatus;
		this.createDate = createDate;
	}

	public TsysUser(String userId, String branchCode, String depCode,
			String userName, String userPwd, String userType,
			String userStatus, String lockStatus, BigDecimal createDate,
			BigDecimal modifyDate, BigDecimal passModifyDate, String remark,
			String extField1, String extField2, String extField3,
			String extField4, String extField5) {
		this.userId = userId;
		this.branchCode = branchCode;
		this.depCode = depCode;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userType = userType;
		this.userStatus = userStatus;
		this.lockStatus = lockStatus;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.passModifyDate = passModifyDate;
		this.remark = remark;
		this.extField1 = extField1;
		this.extField2 = extField2;
		this.extField3 = extField3;
		this.extField4 = extField4;
		this.extField5 = extField5;
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

	public String getDepCode() {
		return this.depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getLockStatus() {
		return this.lockStatus;
	}

	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}

	public BigDecimal getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(BigDecimal createDate) {
		this.createDate = createDate;
	}

	public BigDecimal getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(BigDecimal modifyDate) {
		this.modifyDate = modifyDate;
	}

	public BigDecimal getPassModifyDate() {
		return this.passModifyDate;
	}

	public void setPassModifyDate(BigDecimal passModifyDate) {
		this.passModifyDate = passModifyDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getExtField1() {
		return this.extField1;
	}

	public void setExtField1(String extField1) {
		this.extField1 = extField1;
	}

	public String getExtField2() {
		return this.extField2;
	}

	public void setExtField2(String extField2) {
		this.extField2 = extField2;
	}

	public String getExtField3() {
		return this.extField3;
	}

	public void setExtField3(String extField3) {
		this.extField3 = extField3;
	}

	public String getExtField4() {
		return this.extField4;
	}

	public void setExtField4(String extField4) {
		this.extField4 = extField4;
	}

	public String getExtField5() {
		return this.extField5;
	}

	public void setExtField5(String extField5) {
		this.extField5 = extField5;
	}

}
