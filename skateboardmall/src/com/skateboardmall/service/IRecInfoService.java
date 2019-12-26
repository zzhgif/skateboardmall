package com.skateboardmall.service;

import java.util.List;
import java.util.Map;

import com.skateboardmall.bean.RecInfo;

public interface IRecInfoService {
	
	public List<RecInfo> queryAllreRecInfos();
	
	
	public RecInfo queryOneRecInfo(String rec_id);
	
	
	public boolean insertRecInfo(RecInfo recInfo);
	
	
	public boolean alterRecInfoById(RecInfo recInfo);
	
	
	public boolean deleteRecInfoById(String rec_id);

}
