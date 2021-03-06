package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * Tbtradetoolext generated by hbm2java
 */
public class Tbtradetoolext implements java.io.Serializable {

	private TbtradetoolextId id;
	private String componentType;
	private String displayFlag;
	private String readonlyFlag;
	private String requiredFlag;
	private String defaultValue;
	private String visible;
	private String tipText;
	private BigDecimal maxLength;
	private BigDecimal minLength;
	private String labelTitle;
	private String textValue;
	private BigDecimal lastDate;
	private BigDecimal lastTime;

	public Tbtradetoolext() {
	}

	public Tbtradetoolext(TbtradetoolextId id, String componentType,
			String displayFlag, String readonlyFlag, String requiredFlag,
			String defaultValue, String visible, String tipText,
			BigDecimal maxLength, BigDecimal minLength, String labelTitle,
			String textValue, BigDecimal lastDate, BigDecimal lastTime) {
		this.id = id;
		this.componentType = componentType;
		this.displayFlag = displayFlag;
		this.readonlyFlag = readonlyFlag;
		this.requiredFlag = requiredFlag;
		this.defaultValue = defaultValue;
		this.visible = visible;
		this.tipText = tipText;
		this.maxLength = maxLength;
		this.minLength = minLength;
		this.labelTitle = labelTitle;
		this.textValue = textValue;
		this.lastDate = lastDate;
		this.lastTime = lastTime;
	}

	public TbtradetoolextId getId() {
		return this.id;
	}

	public void setId(TbtradetoolextId id) {
		this.id = id;
	}

	public String getComponentType() {
		return this.componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getDisplayFlag() {
		return this.displayFlag;
	}

	public void setDisplayFlag(String displayFlag) {
		this.displayFlag = displayFlag;
	}

	public String getReadonlyFlag() {
		return this.readonlyFlag;
	}

	public void setReadonlyFlag(String readonlyFlag) {
		this.readonlyFlag = readonlyFlag;
	}

	public String getRequiredFlag() {
		return this.requiredFlag;
	}

	public void setRequiredFlag(String requiredFlag) {
		this.requiredFlag = requiredFlag;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getVisible() {
		return this.visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public String getTipText() {
		return this.tipText;
	}

	public void setTipText(String tipText) {
		this.tipText = tipText;
	}

	public BigDecimal getMaxLength() {
		return this.maxLength;
	}

	public void setMaxLength(BigDecimal maxLength) {
		this.maxLength = maxLength;
	}

	public BigDecimal getMinLength() {
		return this.minLength;
	}

	public void setMinLength(BigDecimal minLength) {
		this.minLength = minLength;
	}

	public String getLabelTitle() {
		return this.labelTitle;
	}

	public void setLabelTitle(String labelTitle) {
		this.labelTitle = labelTitle;
	}

	public String getTextValue() {
		return this.textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
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
