package com.pknu.index.service;

import java.util.HashMap;
import java.util.List;

import com.pknu.index.vo.IndexVo;

public interface IndexService {

	List<IndexVo> rankShow(HashMap<String, Object> map);

	List<IndexVo> rankGenre();

	List<IndexVo> rankGender();

	List<IndexVo> rankAge();

}
