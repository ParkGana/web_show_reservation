package com.pknu.hall.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pknu.hall.dao.HallDao;
import com.pknu.hall.vo.HallVo;

@Repository("hallDao")
public class HallDaoImpl implements HallDao {

	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<HallVo> hallInfo() {
		return sqlSession.selectList("Hall.HallInfo");
	}
	
}
