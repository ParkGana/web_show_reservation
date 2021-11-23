package com.pknu.show.service;

import java.util.HashMap;
import java.util.List;

import com.pknu.show.vo.ShowVo;

public interface ShowService {

	public List<ShowVo> genreList();
	
	public List<ShowVo> showList(HashMap<String, Object> map);

	public ShowVo showDetail(HashMap<String, Object> map);

}
