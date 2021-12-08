package com.pknu.index.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pknu.index.service.IndexService;
import com.pknu.index.vo.IndexVo;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;
	
	
	/***********************************************************************************************
	 * 메인 페이지 접근
	 ***********************************************************************************************/
	@RequestMapping(value="/")
	public ModelAndView indexPage(@RequestParam HashMap<String, Object> map) {
		List<IndexVo> rankShow = indexService.rankShow(map);
		
		map.put("USER_GENDER", "M");
		List<IndexVo> rankShowOfMale = indexService.rankShow(map);
		
		map.put("USER_GENDER", "F");
		List<IndexVo> rankShowOfFemale = indexService.rankShow(map);

		map.remove("USER_GENDER");

		map.put("USER_AGE", 2);
		List<IndexVo> rankShowOfTwenty = indexService.rankShow(map);
		
		map.put("USER_AGE", 3);
		List<IndexVo> rankShowOfThirty = indexService.rankShow(map);
		
		map.put("USER_AGE", 4);
		List<IndexVo> rankShowOfForty = indexService.rankShow(map);
		
		map.put("USER_AGE", 5);
		List<IndexVo> rankShowOfFifty = indexService.rankShow(map);
		
		map.put("USER_AGE", 6);
		List<IndexVo> rankShowOfSixty = indexService.rankShow(map);
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("rankShow", rankShow);
		mv.addObject("rankShowOfMale", rankShowOfMale);
		mv.addObject("rankShowOfFemale", rankShowOfFemale);
		mv.addObject("rankShowOfTwenty", rankShowOfTwenty);
		mv.addObject("rankShowOfThirty", rankShowOfThirty);
		mv.addObject("rankShowOfForty", rankShowOfForty);
		mv.addObject("rankShowOfFifty", rankShowOfFifty);
		mv.addObject("rankShowOfSixty", rankShowOfSixty);
		mv.setViewName("index");
		
		return mv;
	}
	
	/***********************************************************************************************
	 * 예매 통계 - 장르 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/rank/genre")
	@ResponseBody
	public List<IndexVo> rankGenre() {
		return indexService.rankGenre();
	}
	
	/***********************************************************************************************
	 * 예매 통계 - 성별 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/rank/gender")
	@ResponseBody
	public List<IndexVo> rankGender() {
		return indexService.rankGender();
	}
	
	/***********************************************************************************************
	 * 예매 통계 - 나이대 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/rank/age")
	@ResponseBody
	public List<IndexVo> rankAge() {
		return indexService.rankAge();
	}
	
}
