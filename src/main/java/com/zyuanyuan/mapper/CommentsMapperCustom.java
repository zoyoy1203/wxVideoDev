package com.zyuanyuan.mapper;

import com.zyuanyuan.pojo.Comments;
import com.zyuanyuan.pojo.vo.CommentsVO;
import com.zyuanyuan.utils.MyMapper;

import java.util.List;

public interface CommentsMapperCustom extends MyMapper<Comments> {
	
	public List<CommentsVO> queryComments(String videoId);
}