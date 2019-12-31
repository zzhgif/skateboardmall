package com.skateboardmall.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.skateboardmall.bean.AdminInfo;
import com.skateboardmall.bean.SkiInfo;
import com.skateboardmall.dao.SkiDao;
import com.skateboardmall.utils.JDBCDataUtils;

public class SkiDaoImpl implements SkiDao {
	JdbcTemplate template =null;
	
	public SkiDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	public List<SkiInfo> querAll() {
		String sql="select * from ski_info";
		List<SkiInfo>list =template.query(sql, new BeanPropertyRowMapper<SkiInfo>(SkiInfo.class));
		return list;
	}

	public SkiInfo query(String ski_id) {
		SkiInfo skiInfo=null;
		String sql="select * from ski_info where ski_id=?";
		try {
			skiInfo=template.queryForObject(sql, new BeanPropertyRowMapper<SkiInfo>(SkiInfo.class), ski_id);
		} catch (Exception e) {}
		return  skiInfo;
	}
	
	public List<SkiInfo> querybyname(String ski_name) {
		String sql="select * from ski_info where ski_name=?";
		List<SkiInfo> list =template.query(sql, new BeanPropertyRowMapper<SkiInfo>(SkiInfo.class),ski_name);
		return list;
	}
	public int insert(SkiInfo skiInfo) {
		String sql="insert into ski_info values(?,?,?,?,?,?,?,?,?,?)";
		return template.update(sql,skiInfo.getSki_id(),skiInfo.getSki_name(),skiInfo.getSki_type(),
				skiInfo.getSki_price(),skiInfo.getSki_size(),skiInfo.getSki_color(),skiInfo.getSki_des(),
				skiInfo.getSki_state(),skiInfo.getSki_picture1(),skiInfo.getSki_picture2());
	}

	public int alter(SkiInfo skiInfo) {
		String sql="update ski_info set ski_name = ?, ski_type= ?,ski_price=?,ski_size=?,ski_color=?,,ski_des=?,ski_state=?,ski_picture1=?,ski_picture2=?  where ski_id = ?";
		return template.update(sql, skiInfo.getSki_name(),skiInfo.getSki_type(),skiInfo.getSki_price(),skiInfo.getSki_size(),skiInfo.getSki_color(),
				skiInfo.getSki_des(),skiInfo.getSki_state(),skiInfo.getSki_picture1(),skiInfo.getSki_picture2());
	}

	public int delete(String ski_id) {
		String sql="delete from ski_info where ski_id = ?";
		return template.update(sql, ski_id);
	}

	 public int findTotalCount(Map<String, String[]> condition) {
	        //1.定义模板初始化sql
	        String sql = "select count(*) from ski_info";
	        StringBuilder sb = new StringBuilder(sql);
	        //2.遍历map
	        Set<String> keySet = condition.keySet();
	        //定义参数的集合
	        List<Object> params = new ArrayList<Object>();
	        for (String key : keySet) {

	            //排除分页条件参数
	            if("currentPage".equals(key) || "rows".equals(key)){
	                continue;
	            }

	            //获取value
	            String value = condition.get(key)[0];
	            //判断value是否有值
	            if(value != null && !"".equals(value)){
	                //有值
	                sb.append(" and "+key+" like ? ");
	                params.add("%"+value+"%");//？条件的值
	            }
	        }
	        System.out.println(sb.toString());
	        System.out.println(params);

	        return template.queryForObject(sb.toString(),Integer.class,params.toArray());
	    }

	    @Override
	    public List<SkiInfo> findByPage(int start, int rows, Map<String, String[]> condition) {
	        String sql = "SELECT * from ski_info";

	        StringBuilder sb = new StringBuilder(sql);
	        //2.遍历map
	        Set<String> keySet = condition.keySet();
	        //定义参数的集合
	        List<Object> params = new ArrayList<Object>();
	        for (String key : keySet) {

	            //排除分页条件参数
	            if("currentPage".equals(key) || "rows".equals(key)){
	                continue;
	            }

	            //获取value
	            String value = condition.get(key)[0];
	            //判断value是否有值
	            if(value != null && !"".equals(value)){
	                //有值
	                sb.append(" and "+key+" like ? ");
	                params.add("%"+value+"%");//？条件的值
	            }
	        }

	        //添加分页查询
	        sb.append(" limit ?,? ");
	        //添加分页查询参数值
	        params.add(start);
	        params.add(rows);
	        sql = sb.toString();
	        System.out.println(sql);
	        System.out.println(params);

	        return template.query(sql,new BeanPropertyRowMapper<SkiInfo>(SkiInfo.class),params.toArray());
	    }
	
}
