package com.skateboardmall.service;

import java.util.List;
import java.util.Map;

import com.skateboardmall.bean.Comments;

public interface ICommentsService {
	
	public List<Comments> queryAllcComments();
	
	
	public Comments queryone(String com_id);
	
	
	public boolean insert(Comments comment);
	
	
	public boolean alter(Comments comment);
	
	
	public boolean delete(String com_id);
	
	
	public String getCom_content(String com_id);
	
}
