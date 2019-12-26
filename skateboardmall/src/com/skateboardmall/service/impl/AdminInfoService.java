package com.skateboardmall.service.impl;

import java.util.List;

import com.skateboardmall.bean.AdminInfo;
import com.skateboardmall.dao.AdminInfoDao;
import com.skateboardmall.dao.impl.AdminInfoDaoImpl;
import com.skateboardmall.service.IAdminInfoService;

public class AdminInfoService implements IAdminInfoService{
	private AdminInfoDao aDao=null;
	
	public AdminInfoService() {
		aDao=new AdminInfoDaoImpl();
	}
	

	@Override
	public List<AdminInfo> queryAllAdminInfos() {
		List<AdminInfo> list = aDao.querAll();
		if (list.size()!=0) {
			return list;
		} 
		return null;
	}

	@Override
	public AdminInfo queryAdminInfoById(String emp_id){
		return aDao.query(emp_id);
	} 

	@Override
	public boolean insertAdminInfo(AdminInfo adminInfo) {
		return (aDao.insert(adminInfo)>0)?true:false;
	}

	@Override
	public boolean alterAdminInfoById(AdminInfo adminInfo) {
		return (aDao.alter(adminInfo)>0)?true:false;
	}

	@Override
	public boolean deleteAdminInfoById(String emp_id) {
		return (aDao.delete(emp_id)>0)?true:false;
	}

	@Override
	public String getAdminNameById(String emp_id) {
		return aDao.getName(emp_id);
	}

	@Override
	public String getAdminIdByName(String emp_name) {
		return aDao.getEmpId(emp_name);
	}

}
