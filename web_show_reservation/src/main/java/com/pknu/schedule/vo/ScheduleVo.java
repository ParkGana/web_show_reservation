package com.pknu.schedule.vo;

public class ScheduleVo {
	private int    SCHEDULE_ID;
	private String SHOW_ID;
	private String SHOW_NAME;
	private String SHOW_GENRE_NAME;
	private String SCHEDULE_HALL;
	private String SCHEDULE_DATE;
	private String SCHEDULE_TIME;
	private int    SCHEDULE_REMAIN_SEAT;
	
	public int getSCHEDULE_ID() {
		return SCHEDULE_ID;
	}
	public void setSCHEDULE_ID(int SCHEDULE_ID) {
		this.SCHEDULE_ID = SCHEDULE_ID;
	}
	public String getSHOW_ID() {
		return SHOW_ID;
	}
	public void setSHOW_ID(String SHOW_ID) {
		this.SHOW_ID = SHOW_ID;
	}
	public String getSHOW_NAME() {
		return SHOW_NAME;
	}
	public void setSHOW_NAME(String SHOW_NAME) {
		this.SHOW_NAME = SHOW_NAME;
	}
	public String getSHOW_GENRE_NAME() {
		return SHOW_GENRE_NAME;
	}
	public void setSHOW_GENRE_NAME(String SHOW_GENRE_NAME) {
		this.SHOW_GENRE_NAME = SHOW_GENRE_NAME;
	}
	public String getSCHEDULE_HALL() {
		return SCHEDULE_HALL;
	}
	public void setSCHEDULE_HALL(String SCHEDULE_HALL) {
		this.SCHEDULE_HALL = SCHEDULE_HALL;
	}
	public String getSCHEDULE_DATE() {
		return SCHEDULE_DATE;
	}
	public void setSCHEDULE_DATE(String SCHEDULE_DATE) {
		this.SCHEDULE_DATE = SCHEDULE_DATE;
	}
	public String getSCHEDULE_TIME() {
		return SCHEDULE_TIME;
	}
	public void setSCHEDULE_TIME(String SCHEDULE_TIME) {
		this.SCHEDULE_TIME = SCHEDULE_TIME;
	}
	public int getSCHEDULE_REMAIN_SEAT() {
		return SCHEDULE_REMAIN_SEAT;
	}
	public void setSCHEDULE_REMAIN_SEAT(int SCHEDULE_REMAIN_SEAT) {
		this.SCHEDULE_REMAIN_SEAT = SCHEDULE_REMAIN_SEAT;
	}
	
	@Override
	public String toString() {
		return "ScheduleVo [SCHEDULE_ID=" + SCHEDULE_ID + ", SHOW_ID=" + SHOW_ID + ", SHOW_NAME=" + SHOW_NAME
				+ ", SHOW_GENRE_NAME=" + SHOW_GENRE_NAME + ", SCHEDULE_HALL=" + SCHEDULE_HALL + ", SCHEDULE_DATE="
				+ SCHEDULE_DATE + ", SCHEDULE_TIME=" + SCHEDULE_TIME + ", SCHEDULE_REMAIN_SEAT=" + SCHEDULE_REMAIN_SEAT
				+ "]";
	}
}
