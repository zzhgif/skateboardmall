package com.skateboardmall.service;

import java.util.List;

import com.skateboardmall.bean.CarsInfo;


public interface ICarsInfoService {
	
	public List<CarsInfo> queryAllCarsInfos();
	
	
	public CarsInfo queryOneCarsInfo(String cart_id);
	
	
	public boolean insertCarsInfo(CarsInfo carsInfo);
	
	
	public boolean alterCarsInfo(CarsInfo carsInfo);
	
	
	public boolean deleteCarsInfoById(String cart_id);
	
	
	
}
