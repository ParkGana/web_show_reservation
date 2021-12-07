package com.pknu.review.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pknu.review.dao.ReviewDao;
import com.pknu.review.vo.ReviewVo;

@Repository("reviewDao")
public class ReviewDaoImpl implements ReviewDao {

	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<ReviewVo> reviewList(HashMap<String, Object> map) {
		return sqlSession.selectList("Review.ReviewList", map);
	}
	
	@Override
	public void reviewWrite(HashMap<String, Object> map) {
		sqlSession.insert("Review.ReviewWrite", map);
	}
	
	@Override
	public void reviewWriteSuccess(HashMap<String, Object> map) {
		sqlSession.update("Review.ReviewWriteSuccess", map);
	}

	@Override
	public void reviewRead(HashMap<String, Object> map) {
		sqlSession.update("Review.ReviewRead", map);
	}
	
}
