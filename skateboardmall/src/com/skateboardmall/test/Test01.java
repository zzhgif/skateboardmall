package com.skateboardmall.test;

import java.util.List;

import com.skateboardmall.bean.AdminInfo;
import com.skateboardmall.bean.SkiInfo;
import com.skateboardmall.service.IAdminInfoService;
import com.skateboardmall.service.ISkiService;
import com.skateboardmall.service.impl.AdminInfoService;
import com.skateboardmall.service.impl.SkiService;

public class Test01 {
	public static void main(String[] args) {
		//IAdminInfoService aService=new AdminInfoService();
		
		//String emp_id="A10002";
		//AdminInfo a1=aService.queryAdminInfoById(emp_id);
		//System.out.println(a1);
		//System.out.println(aService.getAdminNameById("A10002"));      
		//System.out.println(aService.queryAllAdminInfos());
		String ski_name="滑雪板2";
		ISkiService skiService=new SkiService();
		List<SkiInfo> list=skiService.findAll();
		System.out.println(list);
		System.out.println(skiService.querybyName(ski_name));
		
		
	}

}
