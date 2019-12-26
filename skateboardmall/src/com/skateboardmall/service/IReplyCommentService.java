package com.skateboardmall.service;

import java.util.List;

import com.skateboardmall.bean.ReplyCommemt;

public interface IReplyCommentService {
	
	
	public List<ReplyCommemt> queryAllReplyCommemts();
	
	
	public ReplyCommemt queryOneReplyCommemt(String rep_id);
	
	
	public boolean insertReplyCommemt(ReplyCommemt replyComment);
	
	
	public boolean alterReplyCommemtById(ReplyCommemt replyCommemt);
	
	
	public boolean deleteReplyCommemtById(String rep_id);
}
