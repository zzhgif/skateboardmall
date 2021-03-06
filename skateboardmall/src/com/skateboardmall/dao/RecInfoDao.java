package com.skateboardmall.dao;

import java.util.List;
import java.util.Map;

import com.skateboardmall.bean.RecInfo;




public interface RecInfoDao {
	
	/**
	 * 查询所有的收货地址
	 * @return
	 */
	public List<RecInfo> querAll();
	
	/**
	 * 根据收货编号查询收货地址
	 * @param rec_id
	 * @return
	 */
	public RecInfo query(Integer rec_id);
	
	
	/**
	 * 新增一个收货地址
	 * @param recInfo
	 * @return
	 */
	public int insert(RecInfo recInfo);
	
	/**
	 * 根据收货地址编号对收货地址进行修改
	 * @param recInfo
	 * @return
	 */
	public int alter(RecInfo recInfo);
	
	/**
	 * 根据收货编号，删除相应的收货地址数据
	 * @param rec_id
	 * @return
	 */
	public int delete(Integer rec_id);
	
	

}
