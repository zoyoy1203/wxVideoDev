package com.zyuanyuan.mapper;

import com.zyuanyuan.pojo.SearchRecords;
import com.zyuanyuan.utils.MyMapper;

import java.util.List;

public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
	
	public List<String> getHotwords();
}