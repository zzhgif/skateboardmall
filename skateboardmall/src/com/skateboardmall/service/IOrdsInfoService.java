package com.skateboardmall.service;

import java.util.List;

import com.skateboardmall.bean.OrdsInfo;

public interface IOrdsInfoService {
	
	public List<OrdsInfo> querAll();
	
	
	public OrdsInfo query(String rec_id);
	
	public List<OrdsInfo> queryOrdsInfos(Integer order_id);
	
	
	
	public boolean insert(OrdsInfo ordsInfo);
	
	
	public boolean alter(OrdsInfo ordsInfo);
	
	
	public boolean delete(String ords_id);

}
