package com.skateboardmall.service.impl;

import java.util.List;
import java.util.Map;

import com.skateboardmall.bean.PageBean;
import com.skateboardmall.bean.SkiInfo;
import com.skateboardmall.dao.SkiDao;
import com.skateboardmall.dao.impl.SkiDaoImpl;
import com.skateboardmall.service.ISkiService;

public class SkiService implements ISkiService {
	private SkiDao dao = new SkiDaoImpl();
	public List<SkiInfo> findAll() {
		return dao.querAll();
	}
	
	
	public SkiInfo query(String ski_id) {
		return dao.query(ski_id);
	}
	
	public List<SkiInfo> querybyName(String ski_name) {
		return dao.querybyname(ski_name);
	}

	public int insert(SkiInfo skiInfo) {
		return 0;
	}

	public int alter(SkiInfo skiInfo) {
		return 0;
	}

	public int delete(String ski_id) {
		return 0;
	}

	@Override
	public PageBean<SkiInfo> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
		int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        if(currentPage <=0) {
            currentPage = 1;
        }
        //1.创建空的PageBean对象
        PageBean<SkiInfo> pb = new PageBean<SkiInfo>();
        //2.设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        //3.调用dao查询总记录数
        int totalCount = dao.findTotalCount(condition);
        pb.setTotalCount(totalCount);
        //4.调用dao查询List集合
        //计算开始的记录索引
        int start = (currentPage - 1) * rows;
        List<SkiInfo> list = dao.findByPage(start,rows,condition);
        pb.setList(list);

        //5.计算总页码
        int totalPage = (totalCount % rows)  == 0 ? totalCount/rows : (totalCount/rows) + 1;
        pb.setTotalPage(totalPage);


        return pb;
	}

	
	
}
