package com.pknu.review.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pknu.account.vo.AccountVo;
import com.pknu.review.service.ReviewService;
import com.pknu.review.vo.ReviewVo;
import com.pknu.schedule.service.ScheduleService;
import com.pknu.schedule.vo.ScheduleVo;
import com.pknu.show.service.ShowService;
import com.pknu.show.vo.ShowVo;

@Controller
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private ScheduleService scheduleService;
	
	@Autowired
	private ShowService showService;
	
	
	/***********************************************************************************************
	 * 리뷰 페이지 접근
	 ***********************************************************************************************/
	@RequestMapping(value="/review")
	public String reviewPage(HttpSession session) {
		// 로그인 되어있는 경우
		if (session.getAttribute("user") != null) {
			return "/review";
		}
		// 로그인 되어있지 않은 경우
		else {
			return "redirect:/login";
		}
	}
	
	/***********************************************************************************************
	 * 리뷰 목록 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/review/list")
	@ResponseBody
	public ModelAndView reviewList(@RequestParam HashMap<String, Object> map) {
		List<ShowVo> genreList = showService.genreList();
		List<ShowVo> showList = showService.showList(map);
		List<ReviewVo> reviewList = reviewService.reviewList(map);
		
		ModelAndView mv = new ModelAndView("jsonView");
		
		mv.addObject("genreList", genreList);
		mv.addObject("showList", showList);
		mv.addObject("reviewList", reviewList);
		
		return mv;
	}
	
	/***********************************************************************************************
	 * 리뷰 작성 페이지 접근
	 ***********************************************************************************************/
	@RequestMapping(value="/review/write")
	public ModelAndView reviewWritePage(HttpSession session, @RequestParam HashMap<String, Object> map) {
		map.put("USER_ID", ((AccountVo) session.getAttribute("user")).getUSER_ID());
		
		ScheduleVo scheduleVo = scheduleService.scheduleDetail(map);
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("scheduleInfo", scheduleVo);
		mv.setViewName("reviewWrite");
		
		return mv;
	}
	
	/***********************************************************************************************
	 * 리뷰 작성
	 ***********************************************************************************************/
	@RequestMapping(value="/review/write", method=RequestMethod.POST)
	public String reviewWrite(HttpSession session, @RequestParam HashMap<String, Object> map) {
		map.put("USER_ID", ((AccountVo) session.getAttribute("user")).getUSER_ID());

		reviewService.reviewWrite(map);
		
		reviewService.reviewWriteSuccess(map);
		
		return "redirect:/review";
	}
	
	/***********************************************************************************************
	 * 리뷰 조회 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/review/read")
	@ResponseBody
	public void reviewRead(@RequestParam HashMap<String, Object> map) {
		reviewService.reviewRead(map);
	}
	
}
