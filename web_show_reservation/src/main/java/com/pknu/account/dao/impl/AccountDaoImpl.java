package com.pknu.account.dao.impl;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pknu.account.dao.AccountDao;
import com.pknu.account.vo.AccountVo;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public AccountVo login(HashMap<String, Object> map) {
		return sqlSession.selectOne("Account.Login", map);
	}

	@Override
	public void join(HashMap<String, Object> map) {
		sqlSession.insert("Account.Join", map);
	}

	@Override
	public AccountVo checkID(HashMap<String, Object> map) {
		return sqlSession.selectOne("Account.CheckID", map);
	}
	
}
