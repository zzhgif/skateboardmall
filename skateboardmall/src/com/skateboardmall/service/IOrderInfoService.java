package com.skateboardmall.service;

import java.util.List;

import com.skateboardmall.bean.OrderInfo;

public interface IOrderInfoService {
	
	public List<OrderInfo> queryAllOrderInfos();
	
	
	public OrderInfo queryOneOrderInfo(String rec_id);
	
	
	public boolean insertOrderInfo(OrderInfo orderInfo);
	
	
	public boolean alterOrderInfo(OrderInfo orderInfo);
	
	
	public boolean deleteOrderInfo(String order_id);
}
