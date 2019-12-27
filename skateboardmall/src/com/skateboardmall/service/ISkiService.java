package com.skateboardmall.service;

import java.util.List;
import java.util.Map;

import com.skateboardmall.bean.PageBean;
import com.skateboardmall.bean.SkiInfo;

public interface ISkiService {
	/**
     * 查询所有用户信息
     * @return
     */
    public List<SkiInfo> findAll();
	
    /**
	 * 根据商品编号，查询某一个商品信息
	 * @param emp_id
	 * @return
	 */
	public Map<String, Object> query(String ski_id);
	
	/**
	 * 根据商品名字，查询某一个商品信息
	 * @param emp_id
	 * @return
	 */
	public List<SkiInfo> querybyName(String ski_name);
	
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
     * 分页条件查询
     * @param currentPage
     * @param rows
     * @param condition
     * @return
     */
	public PageBean<SkiInfo> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);

}
