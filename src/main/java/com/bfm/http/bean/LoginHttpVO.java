package com.bfm.http.bean;

public class LoginHttpVO {
	private String userName;
	private String passWord;
	private String opCode;
	private String resCode;
	private String forceLoginFlag;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**
	 * @return the opCode
	 */
	public String getOpCode() {
		return opCode;
	}
	/**
	 * @param opCode the opCode to set
	 */
	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}
	/**
	 * @return the resCode
	 */
	public String getResCode() {
		return resCode;
	}
	/**
	 * @param resCode the resCode to set
	 */
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	/**
	 * @return the forceLoginFlag
	 */
	public String getForceLoginFlag() {
		return forceLoginFlag;
	}
	/**
	 * @param forceLoginFlag the forceLoginFlag to set
	 */
	public void setForceLoginFlag(String forceLoginFlag) {
		this.forceLoginFlag = forceLoginFlag;
	}
}
