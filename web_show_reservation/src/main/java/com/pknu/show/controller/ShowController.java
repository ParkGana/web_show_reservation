package com.pknu.show.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pknu.show.service.ShowService;
import com.pknu.show.vo.ShowVo;

@Controller
public class ShowController {
	
	@Autowired
	private ShowService showService;

	
	/***********************************************************************************************
	 * 공연 안내 페이지 접근
	 ***********************************************************************************************/
	@RequestMapping(value="/show")
	public ModelAndView showPage(@RequestParam HashMap<String, Object> map) {
		List<ShowVo> genreList = showService.genreList();
		List<ShowVo> showList = showService.showList(map);
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("genreList", genreList);
		mv.addObject("showList", showList);
		mv.setViewName("show");
		
		return mv;
	}
	
	/***********************************************************************************************
	 * 공연 상세정보 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/show/detail")
	@ResponseBody
	public ShowVo showDetail(@RequestParam HashMap<String, Object> map) {
		return showService.showDetail(map);
	}
	
}
