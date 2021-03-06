package com.bfm.db.bean;

// Generated 2015-11-18 13:51:58 by Hibernate Tools 4.0.0

/**
 * TsysSubtransId generated by hbm2java
 */
public class TsysSubtransId implements java.io.Serializable {

	private String transCode;
	private String subTransCode;

	public TsysSubtransId() {
	}

	public TsysSubtransId(String transCode, String subTransCode) {
		this.transCode = transCode;
		this.subTransCode = subTransCode;
	}

	public String getTransCode() {
		return this.transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getSubTransCode() {
		return this.subTransCode;
	}

	public void setSubTransCode(String subTransCode) {
		this.subTransCode = subTransCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TsysSubtransId))
			return false;
		TsysSubtransId castOther = (TsysSubtransId) other;

		return ((this.getTransCode() == castOther.getTransCode()) || (this
				.getTransCode() != null && castOther.getTransCode() != null && this
				.getTransCode().equals(castOther.getTransCode())))
				&& ((this.getSubTransCode() == castOther.getSubTransCode()) || (this
						.getSubTransCode() != null
						&& castOther.getSubTransCode() != null && this
						.getSubTransCode().equals(castOther.getSubTransCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTransCode() == null ? 0 : this.getTransCode().hashCode());
		result = 37
				* result
				+ (getSubTransCode() == null ? 0 : this.getSubTransCode()
						.hashCode());
		return result;
	}

}
