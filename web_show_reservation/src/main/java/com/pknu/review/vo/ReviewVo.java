package com.pknu.review.vo;

public class ReviewVo {
	private int    REVIEW_ID;
	private String REVIEW_TITLE;
	private String REVIEW_CONTENT;
	private String REVIEW_DATE;
	private int    REVIEW_READ;
	private String USER_ID;
	private String SCHEDULE_ID;
	private String SHOW_ID;
	private String SHOW_NAME;
	
	public int getREVIEW_ID() {
		return REVIEW_ID;
	}
	public void setREVIEW_ID(int REVIEW_ID) {
		this.REVIEW_ID = REVIEW_ID;
	}
	public String getREVIEW_TITLE() {
		return REVIEW_TITLE;
	}
	public void setREVIEW_TITLE(String REVIEW_TITLE) {
		this.REVIEW_TITLE = REVIEW_TITLE;
	}
	public String getREVIEW_CONTENT() {
		return REVIEW_CONTENT;
	}
	public void setREVIEW_CONTENT(String REVIEW_CONTENT) {
		this.REVIEW_CONTENT = REVIEW_CONTENT;
	}
	public String getREVIEW_DATE() {
		return REVIEW_DATE;
	}
	public void setREVIEW_DATE(String REVIEW_DATE) {
		this.REVIEW_DATE = REVIEW_DATE;
	}
	public int getREVIEW_READ() {
		return REVIEW_READ;
	}
	public void setREVIEW_READ(int REVIEW_READ) {
		this.REVIEW_READ = REVIEW_READ;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID;
	}
	public String getSCHEDULE_ID() {
		return SCHEDULE_ID;
	}
	public void setSCHEDULE_ID(String SCHEDULE_ID) {
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
	
	@Override
	public String toString() {
		return "ReviewVo [REVIEW_ID=" + REVIEW_ID + ", REVIEW_TITLE=" + REVIEW_TITLE + ", REVIEW_CONTENT="
				+ REVIEW_CONTENT + ", REVIEW_DATE=" + REVIEW_DATE + ", REVIEW_READ=" + REVIEW_READ + ", USER_ID="
				+ USER_ID + ", SCHEDULE_ID=" + SCHEDULE_ID + ", SHOW_ID=" + SHOW_ID + ", SHOW_NAME=" + SHOW_NAME + "]";
	}
}
