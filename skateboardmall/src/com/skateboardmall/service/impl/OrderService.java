package com.skateboardmall.service.impl;

import java.util.List;

import com.skateboardmall.bean.OrderInfo;
import com.skateboardmall.dao.OrderInfoDao;
import com.skateboardmall.dao.impl.OrderInfoDaoImpl;
import com.skateboardmall.service.IOrderInfoService;

public class OrderService implements IOrderInfoService {
	private OrderInfoDao odao=null;
	
	public OrderService() {
		odao=new OrderInfoDaoImpl();
	}

	@Override
	public List<OrderInfo> queryAllOrderInfos() {
		List<OrderInfo> list= odao.querAll();
		if (list.size()!=0) {
			return list;
		}
		return null;
	}

	@Override
	public OrderInfo queryOneOrderInfo(String rec_id) {
		return odao.query(rec_id);
	}

	@Override
	public boolean insertOrderInfo(OrderInfo orderInfo) {
		return (odao.insert(orderInfo)>0)?true:false;
	}

	@Override
	public boolean alterOrderInfo(OrderInfo orderInfo) {
		return (odao.alter(orderInfo)>0)?true:false;
	}

	@Override
	public boolean deleteOrderInfo(String order_id) {
		return (odao.delete(order_id)>0)?true:false;
	}

}
