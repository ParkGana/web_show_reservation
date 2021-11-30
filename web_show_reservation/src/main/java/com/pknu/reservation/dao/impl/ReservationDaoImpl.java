package com.pknu.reservation.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pknu.hall.vo.HallVo;
import com.pknu.reservation.dao.ReservationDao;
import com.pknu.reservation.vo.ReservationVo;

@Repository("reservationDao")
public class ReservationDaoImpl implements ReservationDao {

	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<ReservationVo> reservationList(HashMap<String, Object> map) {
		return sqlSession.selectList("Reservation.ReservationList", map);
	}

	@Override
	public List<HallVo> reservationHall(HashMap<String, Object> map) {
		return sqlSession.selectList("Reservation.ReservationHall", map);
	}

	@Override
	public List<ReservationVo> reservationSeat(HashMap<String, Object> map) {
		return sqlSession.selectList("Reservation.ReservationSeat", map);
	}
	
}
