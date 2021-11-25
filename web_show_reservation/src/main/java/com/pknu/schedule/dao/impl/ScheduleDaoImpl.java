package com.pknu.schedule.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pknu.schedule.dao.ScheduleDao;
import com.pknu.schedule.vo.ScheduleVo;
import com.pknu.show.vo.ShowVo;

@Repository("scheduleDao")
public class ScheduleDaoImpl implements ScheduleDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<ScheduleVo> scheduleList() {
		return sqlSession.selectList("Schedule.ScheduleList");
	}

	@Override
	public ShowVo scheduleDetail(HashMap<String, Object> map) {
		return sqlSession.selectOne("Schedule.ScheduleDetail", map);
	}
	
}
