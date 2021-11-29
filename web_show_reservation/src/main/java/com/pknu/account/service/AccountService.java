package com.pknu.account.service;

import java.util.HashMap;

import com.pknu.account.vo.AccountVo;

public interface AccountService {

	public AccountVo login(HashMap<String, Object> map);
	
	public void join(HashMap<String, Object> map);
	
	public AccountVo checkID(HashMap<String, Object> map);
	
}
