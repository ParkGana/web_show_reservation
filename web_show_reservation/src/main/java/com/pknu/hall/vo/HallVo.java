package com.pknu.hall.vo;

public class HallVo {
	private String HALL_ID;
	private String HALL_NAME;
	private String HALL_SEAT_ID;
	private String HALL_SEAT_NAME;
	
	public String getHALL_ID() {
		return HALL_ID;
	}
	public void setHALL_ID(String HALL_ID) {
		this.HALL_ID = HALL_ID;
	}
	public String getHALL_NAME() {
		return HALL_NAME;
	}
	public void setHALL_NAME(String HALL_NAME) {
		this.HALL_NAME = HALL_NAME;
	}
	public String getHALL_SEAT_ID() {
		return HALL_SEAT_ID;
	}
	public void setHALL_SEAT_ID(String HALL_SEAT_ID) {
		this.HALL_SEAT_ID = HALL_SEAT_ID;
	}
	public String getHALL_SEAT_NAME() {
		return HALL_SEAT_NAME;
	}
	public void setHALL_SEAT_NAME(String HALL_SEAT_NAME) {
		this.HALL_SEAT_NAME = HALL_SEAT_NAME;
	}
	
	@Override
	public String toString() {
		return "HallVo [HALL_ID=" + HALL_ID + ", HALL_NAME=" + HALL_NAME + ", HALL_SEAT_ID=" + HALL_SEAT_ID
				+ ", HALL_SEAT_NAME=" + HALL_SEAT_NAME + "]";
	}
}
