package com.pknu.review.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.review.dao.ReviewDao;
import com.pknu.review.service.ReviewService;
import com.pknu.review.vo.ReviewVo;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewDao reviewDao;

	
	@Override
	public List<ReviewVo> reviewList(HashMap<String, Object> map) {
		return reviewDao.reviewList(map);
	}
	
	@Override
	public void reviewWrite(HashMap<String, Object> map) {
		reviewDao.reviewWrite(map);
	}
	
	@Override
	public void reviewWriteSuccess(HashMap<String, Object> map) {
		reviewDao.reviewWriteSuccess(map);
	}
	
	@Override
	public void reviewRead(HashMap<String, Object> map) {
		reviewDao.reviewRead(map);
	}
	
}
