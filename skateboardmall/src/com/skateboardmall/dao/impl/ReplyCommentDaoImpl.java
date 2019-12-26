package com.skateboardmall.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.skateboardmall.bean.ReplyCommemt;
import com.skateboardmall.dao.ReplyCommentDao;
import com.skateboardmall.utils.JDBCDataUtils;



public class ReplyCommentDaoImpl implements ReplyCommentDao{
	JdbcTemplate template =null;
	
	public ReplyCommentDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<ReplyCommemt> querAll() {
		String sql="select * from replycomment";
		List<ReplyCommemt>list =template.query(sql, new BeanPropertyRowMapper<ReplyCommemt>(ReplyCommemt.class));
		return list;
	} 

	@Override
	public ReplyCommemt query(String rep_id) {
		ReplyCommemt replyCommemt=null;
		String sql="select * from replycomment where rep_id=?";
		try {
			replyCommemt=template.queryForObject(sql, ReplyCommemt.class, rep_id);
		} catch (Exception e) {}
		
		return replyCommemt;
	}

	@Override
	public int insert(ReplyCommemt replyComment) {
		String sql="insert into replycomment values(null,?,?,?,?)";
		return template.update(sql, replyComment.getRep_id(),replyComment.getUser_id(),replyComment.getReply_content(),replyComment.getReply_time(),replyComment.getCom_id());
	}

	@Override
	public int alter(ReplyCommemt replyCommemt) {
		String sql="update replycomment set user_id = ?, reply_content  = ?,reply_time  =? ,com_id=? where rep_id = ?";
		return template.update(sql, replyCommemt.getUser_id(),replyCommemt.getReply_content(),replyCommemt.getReply_time(),replyCommemt.getCom_id(),replyCommemt.getRep_id());
	}

	@Override
	public int delete(String rep_id) {
		String sql="delete from replycomment where rep_id=?";
		return template.update(sql, rep_id);
	}

}
