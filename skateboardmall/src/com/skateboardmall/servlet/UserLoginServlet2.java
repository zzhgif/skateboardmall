package com.skateboardmall.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skateboardmall.service.IUserInfoService;
import com.skateboardmall.service.impl.UserInfoService;

@WebServlet("/UserLoginServlet2")
public class UserLoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UserLoginServlet2() {
        super(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		String username = request.getParameter("username").trim();
		String phone = request.getParameter("phone").trim();
		IUserInfoService userInfoService = new UserInfoService();
		
		PrintWriter pw=response.getWriter();
		pw.println("<html><head><title>登录信息</title></head><body>");
		
		if(userInfoService.queryUsersByUserNameAndUserPhone(username, phone)) {
			response.sendRedirect("shop.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
		pw.println("</body></html>");
		pw.flush();
		pw.close();
	}

}
