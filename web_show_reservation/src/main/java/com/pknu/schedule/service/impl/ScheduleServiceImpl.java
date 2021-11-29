package com.pknu.schedule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.schedule.dao.ScheduleDao;
import com.pknu.schedule.service.ScheduleService;
import com.pknu.schedule.vo.ScheduleVo;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleDao scheduleDao;

	
	@Override
	public List<ScheduleVo> scheduleList() {
		return scheduleDao.scheduleList();
	}
	
}
