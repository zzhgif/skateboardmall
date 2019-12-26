package com.skateboardmall.dao.impl;


import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.skateboardmall.bean.UserInfo;
import com.skateboardmall.dao.UserInfoDao;
import com.skateboardmall.utils.JDBCDataUtils;


public class UserInfoDaoImpl implements UserInfoDao {
	JdbcTemplate template =null;
	
	public UserInfoDaoImpl() {
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	
	public int insertUsers(UserInfo users) {		
		String sql = "insert into user_info values(null,?,?,?,?)";
		return template.update(sql,users.getUser_name(),users.getUser_pwd(),users.getUser_phone(),users.getUser_email());
	}
	
	public List<UserInfo> findAllUsers() {	
		String sql = "select * from user_info";		
		List<UserInfo>list =template.query(sql, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
		return list;
	}

	public UserInfo findAllUsersByUserName(String user_name) {
		String sql = "select * from user_info where user_name= ? ";
		return template.queryForObject(sql,new BeanPropertyRowMapper<UserInfo>(UserInfo.class),user_name);			
	}
	
	public UserInfo findAllUsersByUserPhone(String user_phone) {
		String sql = "select * from user_info where user_phone = ?";	
		return template.queryForObject(sql,new BeanPropertyRowMapper<UserInfo>(UserInfo.class),user_phone);
	}
	
	public UserInfo queryUsersByUserNameAndUserPwd(String user_name, String user_pwd) {		
		String sql = "select * from user_info where user_name = ? and user_pwd = ?";		
		return template.queryForObject(sql,new BeanPropertyRowMapper<UserInfo>(UserInfo.class),user_name,user_pwd);
	}
	
	public UserInfo queryUsersByUserNameAndUserPhone(String user_name, String user_phone) {
		String sql = "select * from user_info where user_name = ? and user_phone = ?";
		return template.queryForObject(sql,new BeanPropertyRowMapper<UserInfo>(UserInfo.class),user_name,user_phone);
	}

}
