package com.pknu.account.vo;

public class AccountVo {
	private String USER_ID;
	private String USER_PWD;
	private String USER_NAME;
	private String USER_PHONE;
	private String USER_BIRTH;
	private String USER_GENDER;
	
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID;
	}
	public String getUSER_PWD() {
		return USER_PWD;
	}
	public void setUSER_PWD(String USER_PWD) {
		this.USER_PWD = USER_PWD;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String USER_NAME) {
		this.USER_NAME = USER_NAME;
	}
	public String getUSER_PHONE() {
		return USER_PHONE;
	}
	public void setUSER_PHONE(String USER_PHONE) {
		this.USER_PHONE = USER_PHONE;
	}
	public String getUSER_BIRTH() {
		return USER_BIRTH;
	}
	public void setUSER_BIRTH(String USER_BIRTH) {
		this.USER_BIRTH = USER_BIRTH;
	}
	public String getUSER_GENDER() {
		return USER_GENDER;
	}
	public void setUSER_GENDER(String USER_GENDER) {
		this.USER_GENDER = USER_GENDER;
	}
	
	@Override
	public String toString() {
		return "AccountVo [USER_ID=" + USER_ID + ", USER_PWD=" + USER_PWD + ", USER_NAME=" + USER_NAME + ", USER_PHONE="
				+ USER_PHONE + ", USER_BIRTH=" + USER_BIRTH + ", USER_GENDER=" + USER_GENDER + "]";
	}
}
