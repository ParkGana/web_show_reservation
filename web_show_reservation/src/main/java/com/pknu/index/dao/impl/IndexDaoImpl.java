package com.pknu.index.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pknu.index.dao.IndexDao;
import com.pknu.index.vo.IndexVo;

@Repository("indexDao")
public class IndexDaoImpl implements IndexDao {

	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<IndexVo> rankShow(HashMap<String, Object> map) {
		return sqlSession.selectList("Index.RankShow", map);
	}

	@Override
	public List<IndexVo> rankGenre() {
		return sqlSession.selectList("Index.RankGenre");
	}

	@Override
	public List<IndexVo> rankGender() {
		return sqlSession.selectList("Index.RankGender");
	}

	@Override
	public List<IndexVo> rankAge() {
		return sqlSession.selectList("Index.RankAge");
	}
	
}
