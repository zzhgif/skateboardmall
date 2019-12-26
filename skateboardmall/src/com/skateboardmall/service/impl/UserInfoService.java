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
	//�����û���Ϣ
	public int insertUsers(UserInfo users) {
		return userDao.insertUsers(users);
	}
	//���������û�
	public List<UserInfo> findAllUsers() {
		return userDao.findAllUsers();
	}
	//ͨ���û������������û�
	public UserInfo findAllUsersByUserName(String user_name) {
		return userDao.findAllUsersByUserName(user_name);
	}
	//ͨ���绰�����ѯ�����û�
	public UserInfo findAllUsersByUserPhone(String user_phone) {
		return userDao.findAllUsersByUserPhone(user_phone);
	}
	//�ж��û����Ƿ����
	public boolean isUserNameExit(String user_name) {		
		UserInfo user = userDao.findAllUsersByUserName(user_name);		
		if(user == null) {
			return true;
		}
		return false;
	}
	//�жϵ绰�����Ƿ�ע���
	public boolean isUserPhoneExit(String user_phone) {
		UserInfo user = userDao.findAllUsersByUserPhone(user_phone);
		if(user == null) {
			return true;
		}
		return false;
	}
	
}
