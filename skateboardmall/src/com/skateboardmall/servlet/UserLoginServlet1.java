package com.skateboardmall.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.skateboardmall.service.IUserInfoService;
import com.skateboardmall.service.impl.UserInfoService;

@WebServlet("/UserLoginServlet1")
public class UserLoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UserLoginServlet1() {
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
		String password = request.getParameter("password").trim();
		IUserInfoService userInfoService = new UserInfoService();
		HttpSession session = request.getSession();
		
		PrintWriter pw=response.getWriter();
		pw.println("<html><head><title>登录信息</title></head><body>");
		
		if(userInfoService.queryUsersByUserNameAndUserPwd(username, password)) {
			response.sendRedirect("shop.jsp");
		}else {
			response.sendRedirect("login.jsp");			
		}
		pw.println("</body></html>");
		pw.flush();
		pw.close();
	}

}
