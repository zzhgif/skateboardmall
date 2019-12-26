package com.skateboardmall.dao;

import java.util.List;

import com.skateboardmall.bean.UserInfo;




public interface UserInfoDao {
	
	public int insertUsers(UserInfo users);
	
	public List<UserInfo> findAllUsers();
	
	public UserInfo findAllUsersByUserName(String user_name);
	
	public UserInfo findAllUsersByUserPhone(String user_phone);
	
	public UserInfo queryUsersByUserNameAndUserPwd(String user_name, String user_pwd);
	
	public UserInfo queryUsersByUserNameAndUserPhone(String user_name, String user_phone);
}
