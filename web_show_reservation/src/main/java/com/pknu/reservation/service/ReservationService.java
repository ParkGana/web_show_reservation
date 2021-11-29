package com.pknu.reservation.service;

import java.util.HashMap;
import java.util.List;

import com.pknu.reservation.vo.ReservationVo;

public interface ReservationService {

	public List<ReservationVo> reservationList(HashMap<String, Object> map);

}
