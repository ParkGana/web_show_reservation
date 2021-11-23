package com.pknu.schedule.vo;

public class ScheduleVo {
	private int    SCHEDULE_ID;
	private String SCHEDULE_NAME;
	private String SCHEDULE_HALL;
	private String SCHEDULE_DATE;
	private String SCHEDULE_TIME;
	
	public int getSCHEDULE_ID() {
		return SCHEDULE_ID;
	}
	public void setSCHEDULE_ID(int SCHEDULE_ID) {
		this.SCHEDULE_ID = SCHEDULE_ID;
	}
	public String getSCHEDULE_NAME() {
		return SCHEDULE_NAME;
	}
	public void setSCHEDULE_NAME(String SCHEDULE_NAME) {
		this.SCHEDULE_NAME = SCHEDULE_NAME;
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
	
	@Override
	public String toString() {
		return "ScheduleVo [SCHEDULE_ID=" + SCHEDULE_ID + ", SCHEDULE_NAME=" + SCHEDULE_NAME + ", SCHEDULE_HALL="
				+ SCHEDULE_HALL + ", SCHEDULE_DATE=" + SCHEDULE_DATE + ", SCHEDULE_TIME=" + SCHEDULE_TIME + "]";
	}
}
