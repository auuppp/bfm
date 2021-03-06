package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * Tbtrans generated by hbm2java
 */
public class Tbtrans implements java.io.Serializable {

	private String transCode;
	private String transName;
	private String enableFlag;
	private String channels;
	private String hostOnline;
	private String transType;
	private String monitorStatus;
	private String logLevel;
	private String cancelFlag;
	private String eraseFlag;
	private String monTransType;
	private String reserve1;
	private String reserve2;
	private String reserve3;

	public Tbtrans() {
	}

	public Tbtrans(String transCode, String transName, String enableFlag,
			String channels, String hostOnline, String transType,
			String monitorStatus, String logLevel, String cancelFlag,
			String eraseFlag, String monTransType, String reserve1,
			String reserve2, String reserve3) {
		this.transCode = transCode;
		this.transName = transName;
		this.enableFlag = enableFlag;
		this.channels = channels;
		this.hostOnline = hostOnline;
		this.transType = transType;
		this.monitorStatus = monitorStatus;
		this.logLevel = logLevel;
		this.cancelFlag = cancelFlag;
		this.eraseFlag = eraseFlag;
		this.monTransType = monTransType;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
	}

	public String getTransCode() {
		return this.transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getTransName() {
		return this.transName;
	}

	public void setTransName(String transName) {
		this.transName = transName;
	}

	public String getEnableFlag() {
		return this.enableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getChannels() {
		return this.channels;
	}

	public void setChannels(String channels) {
		this.channels = channels;
	}

	public String getHostOnline() {
		return this.hostOnline;
	}

	public void setHostOnline(String hostOnline) {
		this.hostOnline = hostOnline;
	}

	public String getTransType() {
		return this.transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getMonitorStatus() {
		return this.monitorStatus;
	}

	public void setMonitorStatus(String monitorStatus) {
		this.monitorStatus = monitorStatus;
	}

	public String getLogLevel() {
		return this.logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public String getCancelFlag() {
		return this.cancelFlag;
	}

	public void setCancelFlag(String cancelFlag) {
		this.cancelFlag = cancelFlag;
	}

	public String getEraseFlag() {
		return this.eraseFlag;
	}

	public void setEraseFlag(String eraseFlag) {
		this.eraseFlag = eraseFlag;
	}

	public String getMonTransType() {
		return this.monTransType;
	}

	public void setMonTransType(String monTransType) {
		this.monTransType = monTransType;
	}

	public String getReserve1() {
		return this.reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
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

}
