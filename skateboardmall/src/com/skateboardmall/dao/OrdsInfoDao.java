package com.skateboardmall.dao;

import java.util.List;

import com.skateboardmall.bean.OrderInfo;
import com.skateboardmall.bean.OrdsInfo;

public interface OrdsInfoDao {
	
	public List<OrdsInfo> querAll();
	
	
	public OrdsInfo query(String rec_id);
	
	public List<OrdsInfo> queryOrdsInfos(Integer order_id);
	
	
	
	public int insert(OrdsInfo ordsInfo);
	
	
	public int alter(OrdsInfo ordsInfo);
	
	
	public int delete(String ords_id);

}
