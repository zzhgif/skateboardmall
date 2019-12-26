package com.skateboardmall.service.impl;

import java.util.List;

import com.skateboardmall.bean.CarsInfo;
import com.skateboardmall.dao.CarsInfoDao;
import com.skateboardmall.dao.impl.CarsInfoDaoImpl;
import com.skateboardmall.service.ICarsInfoService;

public class CarsInfoService implements ICarsInfoService{
	private CarsInfoDao cdao=null;
	
	public CarsInfoService() {
		cdao=new CarsInfoDaoImpl();
	}

	@Override
	public List<CarsInfo> queryAllCarsInfos() {
		List<CarsInfo> list=cdao.querAll();
		if (list.size()!=0) {
			return list;
		}
		return null;
	}

	@Override
	public CarsInfo queryOneCarsInfo(String cart_id) {
		return cdao.query(cart_id);
	}

	@Override
	public boolean insertCarsInfo(CarsInfo carsInfo) {
		return (cdao.insert(carsInfo)>0)?true:false;
	}

	@Override
	public boolean alterCarsInfo(CarsInfo carsInfo) {
		return (cdao.alter(carsInfo)>0)?true:false;
	}

	@Override
	public boolean deleteCarsInfoById(String cart_id) {
		return (cdao.delete(cart_id)>0)?true:false;
	}

}
