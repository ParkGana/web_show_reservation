package com.pknu.schedule.service;

import java.util.HashMap;
import java.util.List;

import com.pknu.schedule.vo.ScheduleVo;
import com.pknu.show.vo.ShowVo;

public interface ScheduleService {

	public List<ScheduleVo> scheduleList();

	public ShowVo scheduleDetail(HashMap<String, Object> map);

}
