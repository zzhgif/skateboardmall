package com.skateboardmall.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.skateboardmall.bean.AdminInfo;
import com.skateboardmall.service.IAdminInfoService;
import com.skateboardmall.service.impl.AdminInfoService;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IAdminInfoService adminInfoService=new AdminInfoService();
   
    public AdminLoginServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String username=request.getParameter("username");
		String userpwd=request.getParameter("userpwd");
		
		AdminInfo adminInfo=adminInfoService.findAdminInfoByNameAndPwd(username, userpwd);
		
		
		if (adminInfo!=null) {
			//在此处创建session对象
			HttpSession session=request.getSession(true);
			session.setAttribute("username", username);
			response.sendRedirect("static/index.jsp");
		} else {
			response.sendRedirect("static/login.html");
		}
		
	}

}
