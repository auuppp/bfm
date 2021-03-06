package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * TsysDictItem generated by hbm2java
 */
public class TsysDictItem implements java.io.Serializable {

	private TsysDictItemId id;
	private String dictItemName;
	private BigDecimal dictItemOrder;

	public TsysDictItem() {
	}

	public TsysDictItem(TsysDictItemId id, String dictItemName,
			BigDecimal dictItemOrder) {
		this.id = id;
		this.dictItemName = dictItemName;
		this.dictItemOrder = dictItemOrder;
	}

	public TsysDictItemId getId() {
		return this.id;
	}

	public void setId(TsysDictItemId id) {
		this.id = id;
	}

	public String getDictItemName() {
		return this.dictItemName;
	}

	public void setDictItemName(String dictItemName) {
		this.dictItemName = dictItemName;
	}

	public BigDecimal getDictItemOrder() {
		return this.dictItemOrder;
	}

	public void setDictItemOrder(BigDecimal dictItemOrder) {
		this.dictItemOrder = dictItemOrder;
	}

}
