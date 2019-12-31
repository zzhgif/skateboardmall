package com.skateboardmall.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.skateboardmall.bean.OrderInfo;
import com.skateboardmall.bean.OrdsInfo;
import com.skateboardmall.dao.OrdsInfoDao;
import com.skateboardmall.utils.JDBCDataUtils;

public class OrdsInfoDaoImpl implements OrdsInfoDao {
	JdbcTemplate template =null;
	
	public OrdsInfoDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<OrdsInfo> querAll() {
		String sql="select * from ords_info";
		List<OrdsInfo> list=template.query(sql, new BeanPropertyRowMapper<OrdsInfo>(OrdsInfo.class));
		if (list.size()!=0) {
			return list;
		}
		return null;
	}

	@Override
	public OrdsInfo query(String ords_id) {
		OrdsInfo ordsInfo=null;
		String sql="select * from ords_info where ords_id=?";
		try {
			ordsInfo=template.queryForObject(sql, new BeanPropertyRowMapper<OrdsInfo>(OrdsInfo.class), ords_id); 
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ordsInfo;
	}

	@Override
	public List<OrdsInfo> queryOrdsInfos(Integer order_id) {
		String sql="select * from ords_info where order_id=?";
		List<OrdsInfo> list=template.query(sql, new BeanPropertyRowMapper<OrdsInfo>(OrdsInfo.class), order_id);
		if (list.size()!=0) {
			
			return list;
		}
		return null;
	}

	@Override
	public int insert(OrdsInfo ordsInfo) {
		String sql="insert into ords_info values(null,?,?,?)";
		return template.update(sql, ordsInfo.getOrder_id(),ordsInfo.getSki_id(),ordsInfo.getCount());
	}

	@Override
	public int alter(OrdsInfo ordsInfo) {
		String sql="update ords_info set order_id = ?, ski_id= ?,count=? where ords_id = ?";
		return template.update(sql, ordsInfo.getOrder_id(),ordsInfo.getSki_id(),ordsInfo.getCount(),ordsInfo.getOrds_id());
	}

	@Override
	public int delete(String ords_id) {
		String sql="delete from ords_info where ords_id=?";
		return template.update(sql, ords_id);
	}

}
