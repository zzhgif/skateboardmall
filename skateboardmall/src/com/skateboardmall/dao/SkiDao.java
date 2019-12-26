package com.skateboardmall.dao;

import java.util.List;
import java.util.Map;

import com.skateboardmall.bean.SkiInfo;

public interface SkiDao {
	/**
	 * 查询所有商品信息
	 * @return
	 */
	public List<SkiInfo> querAll();
	
	/**
	 * 根据商品编号，查询某一个商品信息
	 * @param emp_id
	 * @return
	 */
	public Map<String, Object> query(String ski_id);
	
	/**
	 * 插入一条商品信息
	 * @param adminInfo
	 * @return
	 */
	public int insert(SkiInfo skiInfo);
	
	/**
	 * 根据商品编号修改商品信息
	 * @param adminInfo
	 * @return
	 */
	public int alter(SkiInfo skiInfo);
	
	/**
	 *     根据商品编号删除一条商品记录
	 * @param emp_id
	 * @return
	 */
	public int delete(String ski_id);
	 /**
     * 查询总记录数
     * @return
     * @param condition
     */
    public int findTotalCount(Map<String, String[]> condition);

    /**
     * 分页查询每页记录
     * @param start
     * @param rows
     * @param condition
     * @return
     */
    public List<SkiInfo> findByPage(int start, int rows, Map<String, String[]> condition);
}
