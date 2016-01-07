package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * TsysDep generated by hbm2java
 */
public class TsysDep implements java.io.Serializable {

	private String depCode;
	private String depName;
	private String shortName;
	private String parentCode;
	private String branchCode;
	private String depPath;
	private String remark;
	private String extField1;
	private String extField2;
	private String extField3;

	public TsysDep() {
	}

	public TsysDep(String depCode) {
		this.depCode = depCode;
	}

	public TsysDep(String depCode, String depName, String shortName,
			String parentCode, String branchCode, String depPath,
			String remark, String extField1, String extField2, String extField3) {
		this.depCode = depCode;
		this.depName = depName;
		this.shortName = shortName;
		this.parentCode = parentCode;
		this.branchCode = branchCode;
		this.depPath = depPath;
		this.remark = remark;
		this.extField1 = extField1;
		this.extField2 = extField2;
		this.extField3 = extField3;
	}

	public String getDepCode() {
		return this.depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getParentCode() {
		return this.parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getDepPath() {
		return this.depPath;
	}

	public void setDepPath(String depPath) {
		this.depPath = depPath;
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

}
