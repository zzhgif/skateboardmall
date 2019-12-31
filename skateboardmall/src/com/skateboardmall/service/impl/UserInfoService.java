package com.skateboardmall.service.impl;

import java.util.List;

import com.skateboardmall.bean.UserInfo;
import com.skateboardmall.dao.UserInfoDao;
import com.skateboardmall.dao.impl.UserInfoDaoImpl;
import com.skateboardmall.service.IUserInfoService;


public class UserInfoService implements IUserInfoService {
	private UserInfoDao userDao;
	public UserInfoService() {
		userDao = new UserInfoDaoImpl();
	}
	public boolean insertUsers(UserInfo users) {
		return userDao.insertUsers(users) > 0 ? true : false ;
	}
	public List<UserInfo> findAllUsers() {
		return userDao.findAllUsers();
	}
	public UserInfo findAllUsersByUserName(String user_name) {
		return userDao.findAllUsersByUserName(user_name);
	}
	public UserInfo findAllUsersByUserPhone(String user_phone) {
		return userDao.findAllUsersByUserPhone(user_phone);
	}
	public boolean isUserNameExit(String user_name) {
		UserInfo user = userDao.findAllUsersByUserName(user_name);	
		if(user == null) {
			return true;
		}
		return false;
	}
	public boolean isUserPhoneExit(String user_phone) {
		UserInfo user = userDao.findAllUsersByUserPhone(user_phone);
		if(user == null) {
			return true;
		}
		return false;
	}
	
	public boolean queryUsersByUserNameAndUserPwd(String user_name, String user_pwd) {
		if(userDao.queryUsersByUserNameAndUserPwd(user_name, user_pwd) != null) {
			return true;
		}
		return false;
	}
	
	public boolean queryUsersByUserNameAndUserPhone(String user_name, String user_phone) {
		if(userDao.queryUsersByUserNameAndUserPhone(user_name, user_phone) != null) {
			return true;
		}
		return false;
	}
	
}
