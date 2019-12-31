package com.skateboardmall.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.skateboardmall.bean.OrderInfo;
import com.skateboardmall.dao.OrderInfoDao;
import com.skateboardmall.utils.JDBCDataUtils;


public class OrderInfoDaoImpl implements OrderInfoDao {
	JdbcTemplate template =null;
	
	public OrderInfoDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<OrderInfo> querAll() {
		String sql="select * from order_info";
		List<OrderInfo>list =template.query(sql, new BeanPropertyRowMapper<OrderInfo>(OrderInfo.class));
		return list;
	}

	@Override
	public OrderInfo query(String rec_id) {
		OrderInfo orderInfo=null;
		String sql="select * from order_info where order_id=?";
		try {
			orderInfo=template.queryForObject(sql, new BeanPropertyRowMapper<OrderInfo>(OrderInfo.class), rec_id);
		} catch (Exception e) {}
		return orderInfo;
	}

	@Override
	public int insert(OrderInfo orderInfo) {
		String sql="insert into order_info values(null,?,?,?,?)";
		return template.update(sql, orderInfo.getOrder_date(),orderInfo.getRec_id(),orderInfo.getUser_id(),orderInfo.getOrder_state());
	}

	@Override
	public int alter(OrderInfo orderInfo) {
		String sql="update order_info set order_date=?,rec_id=?,user_id=?,order_state=? where order_id = ?";
		return template.update(sql, orderInfo.getOrder_date(),orderInfo.getRec_id(),orderInfo.getUser_id(),orderInfo.getOrder_state(),orderInfo.getOrder_id());
	}

	@Override
	public int delete(String order_id) {
		String sql="delete from order_info where order_id=?";
		return template.update(sql, order_id);
	}

}
