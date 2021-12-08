package com.pknu.index.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.index.dao.IndexDao;
import com.pknu.index.service.IndexService;
import com.pknu.index.vo.IndexVo;

@Service("indexService")
public class IndexServiceImpl implements IndexService {

	@Autowired
	private IndexDao indexDao;

	
	@Override
	public List<IndexVo> rankShow(HashMap<String, Object> map) {
		return indexDao.rankShow(map);
	}

	@Override
	public List<IndexVo> rankGenre() {
		return indexDao.rankGenre();
	}

	@Override
	public List<IndexVo> rankGender() {
		return indexDao.rankGender();
	}

	@Override
	public List<IndexVo> rankAge() {
		return indexDao.rankAge();
	}
	
}
