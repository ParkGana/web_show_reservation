package com.pknu.reservation.vo;

public class ReservationVo {
	private int    RESERVATION_ID;
	private String USER_ID;
	private int    SCHEDULE_ID;
	private String SHOW_NAME;
	private String SHOW_DATE;
	private String SHOW_TIME;
	private String RESERVATION_SEAT;
	private String RESERVATION_DATE;
	
	public int getRESERVATION_ID() {
		return RESERVATION_ID;
	}
	public void setRESERVATION_ID(int RESERVATION_ID) {
		this.RESERVATION_ID = RESERVATION_ID;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID;
	}
	public int getSCHEDULE_ID() {
		return SCHEDULE_ID;
	}
	public void setSCHEDULE_ID(int SCHEDULE_ID) {
		this.SCHEDULE_ID = SCHEDULE_ID;
	}
	public String getSHOW_NAME() {
		return SHOW_NAME;
	}
	public void setSHOW_NAME(String SHOW_NAME) {
		this.SHOW_NAME = SHOW_NAME;
	}
	public String getSHOW_DATE() {
		return SHOW_DATE;
	}
	public void setSHOW_DATE(String SHOW_DATE) {
		this.SHOW_DATE = SHOW_DATE;
	}
	public String getSHOW_TIME() {
		return SHOW_TIME;
	}
	public void setSHOW_TIME(String SHOW_TIME) {
		this.SHOW_TIME = SHOW_TIME;
	}
	public String getRESERVATION_SEAT() {
		return RESERVATION_SEAT;
	}
	public void setRESERVATION_SEAT(String RESERVATION_SEAT) {
		this.RESERVATION_SEAT = RESERVATION_SEAT;
	}
	public String getRESERVATION_DATE() {
		return RESERVATION_DATE;
	}
	public void setRESERVATION_DATE(String RESERVATION_DATE) {
		this.RESERVATION_DATE = RESERVATION_DATE;
	}
	
	@Override
	public String toString() {
		return "ReservationVo [RESERVATION_ID=" + RESERVATION_ID + ", USER_ID=" + USER_ID + ", SCHEDULE_ID="
				+ SCHEDULE_ID + ", SHOW_NAME=" + SHOW_NAME + ", SHOW_DATE=" + SHOW_DATE + ", SHOW_TIME=" + SHOW_TIME
				+ ", RESERVATION_SEAT=" + RESERVATION_SEAT + ", RESERVATION_DATE=" + RESERVATION_DATE + "]";
	}
}
