package com.pknu.schedule.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pknu.hall.vo.HallVo;
import com.pknu.schedule.service.ScheduleService;
import com.pknu.schedule.vo.ScheduleVo;

@Controller
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;
	
	
	/***********************************************************************************************
	 * 공연 일정 페이지 접근
	 ***********************************************************************************************/
	@RequestMapping(value="/schedule")
	public String schedulePage() {
		return "/schedule";
	}
	
	/***********************************************************************************************
	 * 공연 일정 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/schedule/fullcalendar")
	@ResponseBody
	public List<ScheduleVo> scheduleFullcalendar() {
		return scheduleService.scheduleFullcalendar();
	}
	
	/***********************************************************************************************
	 * 공연 상영관 정보 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/schedule/hall")
	@ResponseBody
	public List<HallVo> scheduleHall(@RequestParam HashMap<String, Object> map) {
		return scheduleService.scheduleHall(map);
	}
	
}
