package com.pknu.hall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pknu.hall.service.HallService;
import com.pknu.hall.vo.HallVo;

@Controller
public class HallController {

	@Autowired
	private HallService hallService;
	
	
	/***********************************************************************************************
	 * 상영관 안내 페이지 접근
	 ***********************************************************************************************/
	@RequestMapping(value="/hall")
	public ModelAndView hallPage() {
		List<HallVo> hallInfo = hallService.hallInfo();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("hallInfo", hallInfo);
		mv.setViewName("hall");
		
		return mv;
	}
	
}
