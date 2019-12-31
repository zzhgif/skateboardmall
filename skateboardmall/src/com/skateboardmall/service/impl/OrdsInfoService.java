package com.skateboardmall.service.impl;

import java.util.List;

import com.skateboardmall.bean.OrdsInfo;
import com.skateboardmall.dao.OrdsInfoDao;
import com.skateboardmall.dao.impl.OrdsInfoDaoImpl;
import com.skateboardmall.service.IOrdsInfoService;

public class OrdsInfoService implements IOrdsInfoService{
	private OrdsInfoDao ordao=null;
	
	public OrdsInfoService() {
		ordao=new OrdsInfoDaoImpl();
	}

	@Override
	public List<OrdsInfo> querAll() {
		List<OrdsInfo> list=ordao.querAll();
		return list;
	}

	@Override
	public OrdsInfo query(String ords_id) {
		return ordao.query(ords_id);
	}

	@Override
	public List<OrdsInfo> queryOrdsInfos(Integer order_id) {
		return ordao.queryOrdsInfos(order_id);
	}

	@Override
	public boolean insert(OrdsInfo ordsInfo) {
		return (ordao.insert(ordsInfo)>0)?true:false;
	}

	@Override
	public boolean alter(OrdsInfo ordsInfo) {
		return (ordao.alter(ordsInfo)>0)?true:false;
	}

	@Override
	public boolean delete(String ords_id) {
		return (ordao.delete(ords_id)>0)?true:false;
	}

}
