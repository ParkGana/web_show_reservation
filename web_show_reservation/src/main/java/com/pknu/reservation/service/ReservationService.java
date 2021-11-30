package com.pknu.reservation.service;

import java.util.HashMap;
import java.util.List;

import com.pknu.hall.vo.HallVo;
import com.pknu.reservation.vo.ReservationVo;

public interface ReservationService {

	public List<ReservationVo> reservationList(HashMap<String, Object> map);

	public List<HallVo> reservationHall(HashMap<String, Object> map);

	public List<ReservationVo> reservationSeat(HashMap<String, Object> map);

}
