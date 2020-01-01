package com.skateboardmall.service;

import java.util.List;

import com.skateboardmall.bean.OrderInfo;

public interface IOrderInfoService {
	
	public List<OrderInfo> queryAllOrderInfos();
	
	
	public OrderInfo queryOneOrderInfo(Integer order_id);
	
	
	public boolean insertOrderInfo(OrderInfo orderInfo);
	
	
	public boolean alterOrderInfo(OrderInfo orderInfo);
	
	
	public boolean deleteOrderInfo(Integer order_id);
	
	/**
	 * 查询出所有的相应状态的订单
	 * @param order_state
	 * @return
	 */
	public List<OrderInfo> querAllSuitablefirmedOrder(Integer order_state);
}
