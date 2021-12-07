package com.pknu.review.dao;

import java.util.HashMap;
import java.util.List;

import com.pknu.review.vo.ReviewVo;

public interface ReviewDao {

	List<ReviewVo> reviewList(HashMap<String, Object> map);
	
	void reviewWrite(HashMap<String, Object> map);

	void reviewWriteSuccess(HashMap<String, Object> map);
	
	void reviewRead(HashMap<String, Object> map);

}
