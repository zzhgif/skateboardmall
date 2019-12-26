package com.skateboardmall.service.impl;

import java.util.List;

import com.skateboardmall.bean.AdminInfo;
import com.skateboardmall.service.IAdminInfoService;

public class AdminInfoServiceImpl implements IAdminInfoService{
	

	@Override
	public List<AdminInfo> queryAllAdminInfos() {
		
		return null;
	}

	@Override
	public AdminInfo queryAdminInfoById(String emp_id) {
		// TODO Auto-generated method stub
		return null;
	} 

	@Override
	public int insertAdminInfo(AdminInfo adminInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int alterAdminInfoById(AdminInfo adminInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAdminInfoById(String emp_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getAdminNameById(String emp_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAdminIdByName(String emp_name) {
		// TODO Auto-generated method stub
		return null;
	}

}
