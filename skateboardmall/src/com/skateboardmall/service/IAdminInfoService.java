package com.skateboardmall.service;

import java.util.List;

import com.skateboardmall.bean.AdminInfo;

public interface IAdminInfoService {
	
	/**
	 * 获取所有的员工信息
	 * @return
	 */
	public List<AdminInfo> queryAllAdminInfos();
	
	/**
	 * 通过员工编号查询得到对应的员工信息
	 * @param emp_id
	 * @return
	 */
	public AdminInfo queryAdminInfoById(String emp_id);
	
	/**
	 * 增加一个员工
	 * @param adminInfo
	 * @return
	 */
	public boolean insertAdminInfo(AdminInfo adminInfo);
	
	/**
	 * 修改指定员工编号的员工信息
	 * @param adminInfo
	 * @return
	 */
	public boolean alterAdminInfoById(AdminInfo adminInfo);
	
	/**
	 * 通过员工编号，删除对应的员工
	 * @param emp_id
	 * @return
	 */
	public boolean deleteAdminInfoById(String emp_id);
	
	/**
	 * 通过员工编号获取其对应的员工姓名
	 * @param emp_id
	 * @return
	 */
	public String getAdminNameById(String emp_id);
	
	/**
	 * 通过员工姓名获取对应的员工编号
	 * @param emp_name
	 * @return
	 */
	public String getAdminIdByName(String emp_name);
	
	/**
	 *   查询员工姓名和员工密码是否存在对应的员工
	 * @return
	 */
	public AdminInfo findAdminInfoByNameAndPwd(String emp_name,String emp_pwd);
}
