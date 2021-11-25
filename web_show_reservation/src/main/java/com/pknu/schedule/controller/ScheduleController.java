package com.pknu.schedule.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pknu.schedule.service.ScheduleService;
import com.pknu.schedule.vo.ScheduleVo;
import com.pknu.show.vo.ShowVo;

@Controller
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;
	
	
	/***********************************************************************************************
	 * 공연 일정 페이지 접근
	 ***********************************************************************************************/
	@RequestMapping(value="/schedule")
	public String schedule() {
		return "/schedule";
	}
	
	/***********************************************************************************************
	 * 공연 일정 가져오기 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/schedule/list")
	@ResponseBody
	public List<ScheduleVo> scheduleList() {
		return scheduleService.scheduleList();
	}
	
	/***********************************************************************************************
	 * 공연 정보 가져오기 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/schedule/detail")
	@ResponseBody
	public ShowVo scheduleDetail(@RequestParam HashMap<String, Object> map) {
		return scheduleService.scheduleDetail(map);
	}
	
}