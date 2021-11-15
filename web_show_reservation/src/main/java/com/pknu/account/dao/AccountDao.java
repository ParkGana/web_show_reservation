package com.pknu.account.dao;

import java.util.HashMap;

import com.pknu.account.vo.AccountVo;

public interface AccountDao {

	public AccountVo Login(HashMap<String, Object> map);
	
	public void Join(HashMap<String, Object> map);
	
	public AccountVo checkID(HashMap<String, Object> map);
	
}
