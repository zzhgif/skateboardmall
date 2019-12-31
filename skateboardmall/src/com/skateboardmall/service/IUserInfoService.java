package com.skateboardmall.service;

import java.util.List;

import com.skateboardmall.bean.UserInfo;




public interface IUserInfoService {
	
	public boolean insertUsers(UserInfo users);
	
	public List<UserInfo> findAllUsers();
	
	public UserInfo findAllUsersByUserName(String user_name);
	
	public UserInfo findAllUsersByUserPhone(String user_phone);
	
	public boolean isUserNameExit(String user_name);
	
	public boolean isUserPhoneExit(String user_phone);
	
	public boolean queryUsersByUserNameAndUserPwd(String user_name, String user_pwd);
	
	public boolean queryUsersByUserNameAndUserPhone(String user_name, String user_phone);
}
