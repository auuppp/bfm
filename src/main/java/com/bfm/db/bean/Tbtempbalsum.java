package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * Tbtempbalsum generated by hbm2java
 */
public class Tbtempbalsum implements java.io.Serializable {

	private TbtempbalsumId id;
	private BigDecimal balsum;

	public Tbtempbalsum() {
	}

	public Tbtempbalsum(TbtempbalsumId id, BigDecimal balsum) {
		this.id = id;
		this.balsum = balsum;
	}

	public TbtempbalsumId getId() {
		return this.id;
	}

	public void setId(TbtempbalsumId id) {
		this.id = id;
	}

	public BigDecimal getBalsum() {
		return this.balsum;
	}

	public void setBalsum(BigDecimal balsum) {
		this.balsum = balsum;
	}

}
