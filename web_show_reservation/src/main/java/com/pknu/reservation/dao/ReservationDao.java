package com.pknu.reservation.dao;

import java.util.HashMap;
import java.util.List;

import com.pknu.hall.vo.HallVo;
import com.pknu.reservation.vo.ReservationVo;

public interface ReservationDao {

	public List<ReservationVo> reservationList(HashMap<String, Object> map);

	public List<HallVo> reservationHall(HashMap<String, Object> map);

	public List<ReservationVo> reservationSeat(HashMap<String, Object> map);

}
