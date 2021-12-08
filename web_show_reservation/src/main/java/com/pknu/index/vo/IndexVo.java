package com.pknu.index.vo;

public class IndexVo {
	private String ITEM_ID;
	private String ITEM_NAME;
	private int ITEM_CNT;
	
	public String getITEM_ID() {
		return ITEM_ID;
	}
	public void setITEM_ID(String ITEM_ID) {
		this.ITEM_ID = ITEM_ID;
	}
	public String getITEM_NAME() {
		return ITEM_NAME;
	}
	public void setITEM_NAME(String ITEM_NAME) {
		this.ITEM_NAME = ITEM_NAME;
	}
	public int getITEM_CNT() {
		return ITEM_CNT;
	}
	public void setITEM_CNT(int ITEM_CNT) {
		this.ITEM_CNT = ITEM_CNT;
	}
	
	@Override
	public String toString() {
		return "IndexVo [ITEM_ID=" + ITEM_ID + ", ITEM_NAME=" + ITEM_NAME + ", ITEM_CNT=" + ITEM_CNT + "]";
	}
}
