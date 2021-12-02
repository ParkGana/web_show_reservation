package com.pknu.reservation.service;

import java.util.HashMap;
import java.util.List;

import com.pknu.reservation.vo.ReservationVo;

public interface ReservationService {

	public List<ReservationVo> reservationSeat(HashMap<String, Object> map);

	public List<ReservationVo> myReservationList(HashMap<String, Object> map);
	
	public List<ReservationVo> myReservationSeat(HashMap<String, Object> map);

	public void reservation(HashMap<String, Object> map);

}
