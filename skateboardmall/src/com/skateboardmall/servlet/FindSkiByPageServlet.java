package com.skateboardmall.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skateboardmall.bean.PageBean;
import com.skateboardmall.bean.SkiInfo;
import com.skateboardmall.service.ISkiService;
import com.skateboardmall.service.impl.SkiService;

/**
 * Servlet implementation class FindSkiByPageServlet
 */
@WebServlet("/FindSkiByPageServlet")
public class FindSkiByPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FindSkiByPageServlet() {}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");

	        //1.获取参数
	        String currentPage = request.getParameter("currentPage");//当前页码
	        String rows = request.getParameter("rows");//每页显示条数

	        if(currentPage == null || "".equals(currentPage)){
	            currentPage = "1";
	        }

	        if(rows == null || "".equals(rows)){
	            rows = "8";
	        }
	        
	        //获取条件查询参数
	        Map<String, String[]> condition = request.getParameterMap();

	        //2.调用service查询
	        ISkiService service = new SkiService();
	        PageBean<SkiInfo> pb = service.findUserByPage(currentPage,rows,condition);

	        System.out.println(pb);

	        //3.将PageBean存入request
	        request.setAttribute("pb",pb);
	        request.setAttribute("condition",condition);//将查询条件存入request
	        //4.转发到list.jsp
	        request.getRequestDispatcher("/shop.jsp").forward(request,response);
		
	}

}
