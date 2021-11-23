package com.pknu.show.vo;

public class ShowVo {
	private String SHOW_ID;
	private String SHOW_NAME;
	private String SHOW_INFO;
	private String SHOW_GENRE_ID;
	private String SHOW_GENRE_NAME;
	
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
	public String getSHOW_INFO() {
		return SHOW_INFO;
	}
	public void setSHOW_INFO(String SHOW_INFO) {
		this.SHOW_INFO = SHOW_INFO;
	}
	public String getSHOW_GENRE_ID() {
		return SHOW_GENRE_ID;
	}
	public void setSHOW_GENRE_ID(String SHOW_GENRE_ID) {
		this.SHOW_GENRE_ID = SHOW_GENRE_ID;
	}
	public String getSHOW_GENRE_NAME() {
		return SHOW_GENRE_NAME;
	}
	public void setSHOW_GENRE_NAME(String SHOW_GENRE_NAME) {
		this.SHOW_GENRE_NAME = SHOW_GENRE_NAME;
	}
	
	@Override
	public String toString() {
		return "ShowVo [SHOW_ID=" + SHOW_ID + ", SHOW_NAME=" + SHOW_NAME + ", SHOW_INFO=" + SHOW_INFO
				+ ", SHOW_GENRE_ID=" + SHOW_GENRE_ID + ", SHOW_GENRE_NAME=" + SHOW_GENRE_NAME + "]";
	}
}
