package com.pknu.reservation.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pknu.account.vo.AccountVo;
import com.pknu.reservation.service.ReservationService;
import com.pknu.reservation.vo.ReservationVo;
import com.pknu.schedule.service.ScheduleService;
import com.pknu.schedule.vo.ScheduleVo;
import com.pknu.show.service.ShowService;
import com.pknu.show.vo.ShowVo;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@Autowired
	private ShowService showService;

	@Autowired
	private ScheduleService scheduleService;
		
		
	/***********************************************************************************************
	 * 공연 예매 페이지 접근
	 ***********************************************************************************************/
	@RequestMapping(value="/reservation")
	public ModelAndView reservation(@RequestParam HashMap<String, Object> map) {
		ShowVo showVo = showService.showDetail(map);
		List<ScheduleVo> scheduleVo = scheduleService.scheduleList(map);
		
		ModelAndView mv = new ModelAndView();

		mv.addObject("showInfo", showVo);
		mv.addObject("scheduleList", scheduleVo);
		mv.setViewName("reservation");

		return mv;
	}
	
	/***********************************************************************************************
	 * 공연 예매
	 ***********************************************************************************************/
	@RequestMapping(value="/reservation", method=RequestMethod.POST)
	@ResponseBody
	public void reservation(HttpSession session, @RequestParam HashMap<String, Object> map) {
		map.put("USER_ID", ((AccountVo) session.getAttribute("user")).getUSER_ID());
		
		reservationService.reservation(map);
	}
	
	/***********************************************************************************************
	 * 선택한 공연의 예매 좌석 정보 가져오기 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/reservation/seat")
	@ResponseBody
	public List<ReservationVo> reservationSeat(@RequestParam HashMap<String, Object> map) {
		return reservationService.reservationSeat(map);
	}
	
	/***********************************************************************************************
	 * 로그인한 사용자의 예매 목록 가져오기 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/reservation/list/my")
	@ResponseBody
	public List<ReservationVo> myReservationList(HttpSession session, @RequestParam HashMap<String, Object> map) {
		map.put("USER_ID", ((AccountVo) session.getAttribute("user")).getUSER_ID());
		
		return reservationService.myReservationList(map);
	}
	
	/***********************************************************************************************
	 * 로그인한 사용자의 예매 좌석 정보 가져오기 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/reservation/seat/my")
	@ResponseBody
	public List<ReservationVo> myReservationSeat(HttpSession session, @RequestParam HashMap<String, Object> map) {
		map.put("USER_ID", ((AccountVo) session.getAttribute("user")).getUSER_ID());
		
		return reservationService.myReservationSeat(map);
	}
	
}
