package com.pknu.reservation.dao;

import java.util.HashMap;
import java.util.List;

import com.pknu.reservation.vo.ReservationVo;

public interface ReservationDao {

	public List<ReservationVo> myReservationList(HashMap<String, Object> map);

	public List<ReservationVo> myReservationSeat(HashMap<String, Object> map);

}
