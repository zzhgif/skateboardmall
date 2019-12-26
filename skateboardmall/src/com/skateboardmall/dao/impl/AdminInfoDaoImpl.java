package com.skateboardmall.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.skateboardmall.bean.AdminInfo;
import com.skateboardmall.dao.AdminInfoDao;
import com.skateboardmall.utils.JDBCDataUtils;


public class AdminInfoDaoImpl implements AdminInfoDao {
	JdbcTemplate template =null;
	
	public AdminInfoDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<AdminInfo> querAll() {
		String sql="select * from admin_info";
		List<AdminInfo>list =template.query(sql, new BeanPropertyRowMapper<AdminInfo>(AdminInfo.class));
		return list;
	}

	@Override
	public AdminInfo query(String emp_id) {
		 AdminInfo adminInfo = null;
		 String sql="select * from admin_info where emp_id=?";
		 try {  
			 adminInfo = template.queryForObject(sql, new BeanPropertyRowMapper<AdminInfo>(AdminInfo.class), emp_id);
	     } catch (Exception e) {}
	        return adminInfo;
	}

	@Override
	public int insert(AdminInfo adminInfo) {
		String sql="insert into admin_info values(?,?,?,?,?,?)";
		return template.update(sql,adminInfo.getEmp_id(),adminInfo.getEmp_name(),adminInfo.getEmp_pwd(),
				adminInfo.getEmp_phone(),adminInfo.getEmp_state(),adminInfo.getEmp_address());
	}

	@Override
	public int alter(AdminInfo adminInfo) {
		String sql="update admin_info set emp_name = ?, emp_pwd= ?,emp_phone=?,emp_state=?,emp_address=?  where emp_id = ?";
		return template.update(sql, adminInfo.getEmp_name(),adminInfo.getEmp_pwd(),adminInfo.getEmp_phone(),adminInfo.getEmp_state(),adminInfo.getEmp_address());
	}

	@Override
	public int delete(String emp_id) {
		String sql="delete from admin_info where emp_id = ?";
		return template.update(sql, emp_id);
	}
	
	@Override
	public String getName(String emp_id) {
		String sql="select emp_name from admin_info where emp_id=?";
		List<String> list=template.queryForList(sql, String.class, emp_id);
		if (list.size()!=0) {
			return list.get(0);
		}
		return null;
	}
	
	@Override
	public String getEmpId(String emp_name) {
		String sql="select emp_id from admin_info where emp_name=?";
		List<String> list=template.queryForList(sql, String.class, emp_name);
		if (list.size()!=0) {
			return list.get(0);
		}
		return null;
	}

}
