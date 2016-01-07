package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * TsysDbKeyword generated by hbm2java
 */
public class TsysDbKeyword implements java.io.Serializable {

	private String dbKeyword;
	private String stdTypeCode;
	private String dbType;
	private String dbVersion;
	private String defFlag;

	public TsysDbKeyword() {
	}

	public TsysDbKeyword(String dbKeyword, String dbType, String dbVersion) {
		this.dbKeyword = dbKeyword;
		this.dbType = dbType;
		this.dbVersion = dbVersion;
	}

	public TsysDbKeyword(String dbKeyword, String stdTypeCode, String dbType,
			String dbVersion, String defFlag) {
		this.dbKeyword = dbKeyword;
		this.stdTypeCode = stdTypeCode;
		this.dbType = dbType;
		this.dbVersion = dbVersion;
		this.defFlag = defFlag;
	}

	public String getDbKeyword() {
		return this.dbKeyword;
	}

	public void setDbKeyword(String dbKeyword) {
		this.dbKeyword = dbKeyword;
	}

	public String getStdTypeCode() {
		return this.stdTypeCode;
	}

	public void setStdTypeCode(String stdTypeCode) {
		this.stdTypeCode = stdTypeCode;
	}

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getDbVersion() {
		return this.dbVersion;
	}

	public void setDbVersion(String dbVersion) {
		this.dbVersion = dbVersion;
	}

	public String getDefFlag() {
		return this.defFlag;
	}

	public void setDefFlag(String defFlag) {
		this.defFlag = defFlag;
	}

}
