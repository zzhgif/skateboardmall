package com.skateboardmall.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.skateboardmall.bean.CarsInfo;
import com.skateboardmall.dao.CarsInfoDao;
import com.skateboardmall.utils.JDBCDataUtils;


public class CarsInfoDaoImpl implements CarsInfoDao {
	JdbcTemplate template =null;
	
	public CarsInfoDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<CarsInfo> querAll() {
		String sql="select * from cart_info";
		List<CarsInfo>list =template.query(sql, new BeanPropertyRowMapper<CarsInfo>(CarsInfo.class));
		return list;
	}

	@Override
	public CarsInfo query(String cart_id) {
		CarsInfo carsInfo=null;
		String sql="select * from cart_info where cart_id=?";
		try {
			carsInfo=template.queryForObject(sql, new BeanPropertyRowMapper<CarsInfo>(CarsInfo.class), cart_id);
		} catch (Exception e) {}
		return carsInfo;
	}

	@Override
	public int insert(CarsInfo carsInfo) {
		String sql="insert into cart_info values(null,?,?,?)";
		return template.update(sql, carsInfo.getUser_id(),carsInfo.getSki_id(),carsInfo.getCaes_count());
	}

	@Override
	public int alter(CarsInfo carsInfo) {
		String sql="update cart_info set user_id = ?, ski_id= ?,cart_count=? where cart_id = ?";
		return template.update(sql, carsInfo.getUser_id(),carsInfo.getSki_id(),carsInfo.getCaes_count(),carsInfo.getCars_id());
	}

	@Override
	public int delete(String cart_id) {
		String sql="delete from cart_info where cart_id =?";
		return template.update(sql, cart_id);
	}

}
