package com.skateboardmall.service.impl;

import java.util.List;

import com.skateboardmall.bean.Comments;
import com.skateboardmall.bean.ReplyCommemt;
import com.skateboardmall.dao.ReplyCommentDao;
import com.skateboardmall.dao.impl.ReplyCommentDaoImpl;
import com.skateboardmall.service.ICommentsService;
import com.skateboardmall.service.IReplyCommentService;

public class ReplyCommentService implements IReplyCommentService {
	private ReplyCommentDao redao=null;
	
	public ReplyCommentService() {
		redao=new ReplyCommentDaoImpl();
	}

	@Override
	public List<ReplyCommemt> queryAllReplyCommemts() {
		List<ReplyCommemt> list=redao.querAll();
		if (list.size()!=0) {
			return list;
		}
		return null;
	}

	@Override
	public ReplyCommemt queryOneReplyCommemt(String rep_id) {
		return redao.query(rep_id);
	}

	@Override
	public boolean insertReplyCommemt(ReplyCommemt replyComment) {
		
		return (redao.insert(replyComment)>0)?true:false;
	}

	@Override
	public boolean alterReplyCommemtById(ReplyCommemt replyCommemt) {
		
		return (redao.alter(replyCommemt)>0)?true:false;
	}

	@Override
	public boolean deleteReplyCommemtById(String rep_id) {
		
		return (redao.delete(rep_id)>0)?true:false;
	}

	

}
