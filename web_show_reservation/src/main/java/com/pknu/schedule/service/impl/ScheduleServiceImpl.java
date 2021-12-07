package com.pknu.schedule.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.hall.vo.HallVo;
import com.pknu.schedule.dao.ScheduleDao;
import com.pknu.schedule.service.ScheduleService;
import com.pknu.schedule.vo.ScheduleVo;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleDao scheduleDao;

	
	@Override
	public List<ScheduleVo> scheduleFullcalendar() {
		return scheduleDao.scheduleFullcalendar();
	}
	
	@Override
	public List<ScheduleVo> scheduleList(HashMap<String, Object> map) {
		return scheduleDao.scheduleList(map);
	}
	
	@Override
	public List<HallVo> scheduleHall(HashMap<String, Object> map) {
		return scheduleDao.scheduleHall(map);
	}

	@Override
	public ScheduleVo scheduleDetail(HashMap<String, Object> map) {
		return scheduleDao.scheduleDetail(map);
	}

}
