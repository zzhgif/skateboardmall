package com.skateboardmall.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONArray;
import com.skateboardmall.bean.OrdsInfo;
import com.skateboardmall.service.IOrdsInfoService;
import com.skateboardmall.service.ISkiService;
import com.skateboardmall.service.impl.OrdsInfoService;
import com.skateboardmall.service.impl.SkiService;




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
		
		//HttpSession session=request.getSession(true);
		
		
		ISkiService skiService=new SkiService();
		//session.setAttribute("skiService",skiService);
		
		List<OrdsInfo> list=ordsInfoService.queryOrdsInfos(id);
		
		//request.getParameter("");
		
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/text");
		
		//request.setAttribute("list", list);
		//request.setAttribute("pageSize", size / num + (size % num > 0 ? 1 : 0));
		//request.setAttribute("target", "show");
		//request.setAttribute("type", type);
		try {
			response.getWriter().print(JSONArray.toJSON(list).toString());
		} catch (Exception e) {}
		//request.getRequestDispatcher("static/OrdsManagement.jsp").forward(request, response);
		
		
		
		
	}

}
