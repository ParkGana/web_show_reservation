package com.pknu.schedule.service;

import java.util.HashMap;
import java.util.List;

import com.pknu.hall.vo.HallVo;
import com.pknu.schedule.vo.ScheduleVo;

public interface ScheduleService {

	public List<ScheduleVo> scheduleFullcalendar();
	
	public List<ScheduleVo> scheduleList(HashMap<String, Object> map);
	
	public List<HallVo> scheduleHall(HashMap<String, Object> map);

	public ScheduleVo scheduleDetail(HashMap<String, Object> map);

}
