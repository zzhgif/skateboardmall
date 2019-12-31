package com.skateboardmall.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.skateboardmall.bean.OrdsInfo;
import com.skateboardmall.service.IOrdsInfoService;
import com.skateboardmall.service.impl.OrdsInfoService;




@WebServlet("/GetDetailedInformationServlet")
public class GetDetailedInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IOrdsInfoService ordsInfoService=new OrdsInfoService();
       
   
    public GetDetailedInformationServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int id=Integer.parseInt(request.getParameter("deptid").trim())  ;
		
		
		List<OrdsInfo> list=ordsInfoService.queryOrdsInfos(id);
		
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/text");
		try {
			response.getWriter().print(JSONArray.toJSON(list).toString());
		} catch (Exception e) {
		}
		
	}

}
