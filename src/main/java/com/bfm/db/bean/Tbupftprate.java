package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * Tbupftprate generated by hbm2java
 */
public class Tbupftprate implements java.io.Serializable {

	private TbupftprateId id;
	private String firstSubjectName;
	private String secondSubjectName;
	private BigDecimal upGuidRate;
	private BigDecimal upFtpRate;
	private String remark;
	private String reserve1;
	private String reserve2;
	private String reserve3;
	private BigDecimal lastDate;
	private BigDecimal lastTime;

	public Tbupftprate() {
	}

	public Tbupftprate(TbupftprateId id, String firstSubjectName,
			String secondSubjectName, BigDecimal upGuidRate,
			BigDecimal upFtpRate, String remark, String reserve1,
			String reserve2, String reserve3, BigDecimal lastDate,
			BigDecimal lastTime) {
		this.id = id;
		this.firstSubjectName = firstSubjectName;
		this.secondSubjectName = secondSubjectName;
		this.upGuidRate = upGuidRate;
		this.upFtpRate = upFtpRate;
		this.remark = remark;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.lastDate = lastDate;
		this.lastTime = lastTime;
	}

	public TbupftprateId getId() {
		return this.id;
	}

	public void setId(TbupftprateId id) {
		this.id = id;
	}

	public String getFirstSubjectName() {
		return this.firstSubjectName;
	}

	public void setFirstSubjectName(String firstSubjectName) {
		this.firstSubjectName = firstSubjectName;
	}

	public String getSecondSubjectName() {
		return this.secondSubjectName;
	}

	public void setSecondSubjectName(String secondSubjectName) {
		this.secondSubjectName = secondSubjectName;
	}

	public BigDecimal getUpGuidRate() {
		return this.upGuidRate;
	}

	public void setUpGuidRate(BigDecimal upGuidRate) {
		this.upGuidRate = upGuidRate;
	}

	public BigDecimal getUpFtpRate() {
		return this.upFtpRate;
	}

	public void setUpFtpRate(BigDecimal upFtpRate) {
		this.upFtpRate = upFtpRate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

}
