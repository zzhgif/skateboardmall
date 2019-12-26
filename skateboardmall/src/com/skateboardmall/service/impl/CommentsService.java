package com.skateboardmall.service.impl;

import java.util.List;

import com.skateboardmall.bean.Comments;
import com.skateboardmall.dao.CommentsDao;
import com.skateboardmall.dao.impl.CommentsDaoImpl;
import com.skateboardmall.service.ICommentsService;

public class CommentsService implements ICommentsService {
	private CommentsDao comDao=null;
	
	public CommentsService() {
		comDao=new CommentsDaoImpl();
	}

	@Override
	public List<Comments> queryAllcComments() {
		List<Comments> list =comDao.querAll();
		if (list.size()!=0) {
			return list;
		}
		return null;
	}

	@Override
	public Comments queryone(String com_id) {
		return comDao.query(com_id);
	}

	@Override
	public boolean insert(Comments comment) {
		return (comDao.insert(comment)>0)?true:false;
	}

	@Override
	public boolean alter(Comments comment) {
		return (comDao.alter(comment)>0)?true:false;
	}

	@Override
	public boolean delete(String com_id) {
		return (comDao.delete(com_id)>0)?true:false;
	}

	@Override
	public String getCom_content(String com_id) {
		return comDao.getCom_content(com_id);
	}

}
