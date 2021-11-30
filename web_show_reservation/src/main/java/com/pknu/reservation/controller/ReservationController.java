package com.pknu.reservation.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pknu.account.vo.AccountVo;
import com.pknu.hall.vo.HallVo;
import com.pknu.reservation.service.ReservationService;
import com.pknu.reservation.vo.ReservationVo;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	
	/***********************************************************************************************
	 * 예매 목록 가져오기 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/reservation/list")
	@ResponseBody
	public List<ReservationVo> reservationList(HttpSession session, @RequestParam HashMap<String, Object> map) {
		map.put("USER_ID", ((AccountVo) session.getAttribute("user")).getUSER_ID());
		
		return reservationService.reservationList(map);
	}
	
	/***********************************************************************************************
	 * 예매한 공연의 상영관 정보 가져오기 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/reservation/hall")
	@ResponseBody
	public List<HallVo> reservationHall(@RequestParam HashMap<String, Object> map) {
		return reservationService.reservationHall(map);
	}
	
	/***********************************************************************************************
	 * 예매 좌석 정보 가져오기 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/reservation/seat")
	@ResponseBody
	public List<ReservationVo> reservationSeat(HttpSession session, @RequestParam HashMap<String, Object> map) {
		map.put("USER_ID", ((AccountVo) session.getAttribute("user")).getUSER_ID());
		
		return reservationService.reservationSeat(map);
	}
	
}
