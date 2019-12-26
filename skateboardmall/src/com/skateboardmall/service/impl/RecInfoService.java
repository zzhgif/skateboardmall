package com.skateboardmall.service.impl;

import java.util.List;

import com.skateboardmall.bean.RecInfo;
import com.skateboardmall.dao.RecInfoDao;
import com.skateboardmall.dao.impl.RecInfoDaoImpl;
import com.skateboardmall.service.IRecInfoService;

public class RecInfoService implements IRecInfoService{
	private RecInfoDao rdao=null;
	
	public RecInfoService() {
		rdao=new RecInfoDaoImpl();
	}

	@Override
	public List<RecInfo> queryAllreRecInfos() {
		List<RecInfo> list=rdao.querAll();
		if (list.size()!=0) {
			return list;
		}
		return null;
	}

	@Override
	public RecInfo queryOneRecInfo(String rec_id) {
		return rdao.query(rec_id);
	}

	@Override
	public boolean insertRecInfo(RecInfo recInfo) {
		return (rdao.insert(recInfo)>0)?true:false;
	}

	@Override
	public boolean alterRecInfoById(RecInfo recInfo) {
		return (rdao.alter(recInfo)>0)?true:false;
	}

	@Override
	public boolean deleteRecInfoById(String rec_id) {
		return (rdao.delete(rec_id)>0)?true:false;
	}

}
