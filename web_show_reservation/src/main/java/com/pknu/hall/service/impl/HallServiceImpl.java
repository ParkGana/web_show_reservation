package com.pknu.hall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.hall.dao.HallDao;
import com.pknu.hall.service.HallService;
import com.pknu.hall.vo.HallVo;

@Service("hallService")
public class HallServiceImpl implements HallService {

	@Autowired
	private HallDao hallDao;

	
	@Override
	public List<HallVo> hallInfo() {
		return hallDao.hallInfo();
	}
	
}
