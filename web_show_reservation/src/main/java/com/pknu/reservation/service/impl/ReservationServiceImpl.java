package com.pknu.reservation.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.hall.vo.HallVo;
import com.pknu.reservation.dao.ReservationDao;
import com.pknu.reservation.service.ReservationService;
import com.pknu.reservation.vo.ReservationVo;

@Service("reservationService")
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDao reservationDao;

	
	@Override
	public List<ReservationVo> reservationList(HashMap<String, Object> map) {
		return reservationDao.reservationList(map);
	}

	@Override
	public List<HallVo> reservationHall(HashMap<String, Object> map) {
		return reservationDao.reservationHall(map);
	}

	@Override
	public List<ReservationVo> reservationSeat(HashMap<String, Object> map) {
		return reservationDao.reservationSeat(map);
	}
	
}
