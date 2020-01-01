package com.skateboardmall.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.skateboardmall.bean.RecInfo;
import com.skateboardmall.dao.RecInfoDao;
import com.skateboardmall.utils.JDBCDataUtils;


public class RecInfoDaoImpl implements RecInfoDao {
	JdbcTemplate template =null;
	
	public RecInfoDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<RecInfo> querAll() {
		String sql="select * from rec_info";
		List<RecInfo>list =template.query(sql, new BeanPropertyRowMapper<RecInfo>(RecInfo.class));
		return list;
	}

	@Override
	public RecInfo query(Integer rec_id) {
		RecInfo recInfo=null;
		String sql="select * from rec_info where rec_id=?";
		try {
			recInfo =template.queryForObject(sql, new BeanPropertyRowMapper<RecInfo>(RecInfo.class), rec_id);
		} catch (Exception e) {}
		
		return recInfo;
	}

	@Override
	public int insert(RecInfo recInfo) {
		String sql="insert into rec_info values(null,?,?,?)";
		return template.update(sql, recInfo.getRec_address(),recInfo.getRec_name(),recInfo.getRec_phone());
	}

	@Override
	public int alter(RecInfo recInfo) {
		String sql="update comments set rec_adress= ?, rec_name= ?, rec_phone=? where rec_id = ?";
		return template.update(sql, recInfo.getRec_address(),recInfo.getRec_name(),recInfo.getRec_phone(),recInfo.getRec_id());
	}

	@Override
	public int delete(Integer rec_id) {
		String sql="delete from comments where rec_id=?";
		return template.update(sql, rec_id);
	}

}
