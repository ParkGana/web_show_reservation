package com.pknu.show.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.show.dao.ShowDao;
import com.pknu.show.service.ShowService;
import com.pknu.show.vo.ShowVo;

@Service("showService")
public class ShowServiceImpl implements ShowService {
	
	@Autowired
	private ShowDao showDao;

	
	@Override
	public List<ShowVo> genreList() {
		return showDao.genreList();
	}
	
	@Override
	public List<ShowVo> showList(HashMap<String, Object> map) {
		return showDao.showList(map);
	}

	@Override
	public ShowVo showDetail(HashMap<String, Object> map) {
		return showDao.showDetail(map);
	}

}
