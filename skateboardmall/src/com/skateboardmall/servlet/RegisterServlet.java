package com.skateboardmall.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skateboardmall.bean.UserInfo;
import com.skateboardmall.service.IUserInfoService;
import com.skateboardmall.service.impl.UserInfoService;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RegisterServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		String username = request.getParameter("username").trim();
		String password = request.getParameter("password1").trim();
		String email = request.getParameter("uemail").trim();
		String phone = request.getParameter("uphone").trim();
		UserInfo userInfo = new UserInfo(null,username,password,phone,email);
		IUserInfoService userInfoService = new UserInfoService();
		
		PrintWriter pw=response.getWriter();
		pw.println("<html><head><title>登录信息</title></head><body>");
		if(userInfoService.insertUsers(userInfo)) {
			response.sendRedirect("login.jsp");	
//			pw.println("<font color='red' size='+5'>注册成功</font><hr>");
//			pw.println("<p>前往 <a href='login.jsp'>登录</a></center>");
		}else {
			response.sendRedirect("login.jsp");	
		}
		pw.println("</body></html>");
		pw.flush();
		pw.close();
	}

}
