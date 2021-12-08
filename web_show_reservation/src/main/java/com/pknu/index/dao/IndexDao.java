package com.pknu.index.dao;

import java.util.HashMap;
import java.util.List;

import com.pknu.index.vo.IndexVo;

public interface IndexDao {

	List<IndexVo> rankShow(HashMap<String, Object> map);

	List<IndexVo> rankGenre();

	List<IndexVo> rankGender();

	List<IndexVo> rankAge();

}
