package com.pknu.account.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.account.dao.AccountDao;
import com.pknu.account.service.AccountService;
import com.pknu.account.vo.AccountVo;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao accountDao;


	@Override
	public AccountVo login(HashMap<String, Object> map) {
		return accountDao.login(map);
	}

	@Override
	public void join(HashMap<String, Object> map) {
		accountDao.join(map);
	}

	@Override
	public AccountVo checkID(HashMap<String, Object> map) {
		return accountDao.checkID(map);
	}
	
}
