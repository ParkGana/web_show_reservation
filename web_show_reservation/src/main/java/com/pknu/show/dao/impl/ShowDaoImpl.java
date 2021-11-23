package com.pknu.show.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pknu.show.dao.ShowDao;
import com.pknu.show.vo.ShowVo;

@Repository("showDao")
public class ShowDaoImpl implements ShowDao {
	
	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<ShowVo> genreList() {
		return sqlSession.selectList("Show.GenreList");
	}
	
	@Override
	public List<ShowVo> showList(HashMap<String, Object> map) {
		return sqlSession.selectList("Show.ShowList", map);
	}

	@Override
	public ShowVo showDetail(HashMap<String, Object> map) {
		return sqlSession.selectOne("Show.ShowDetail", map);
	}

}
