package com.skateboardmall.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skateboardmall.service.IUserInfoService;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUserInfoService userService;   
   
    public RegisterServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/text");
		
		String name=request.getParameter("uname").trim();
		
		System.out.println("用户名："+name);
		
		if(userService.isUserNameExit(name)) {
			System.out.println(1111);
			response.getWriter().println("true");
		}else{
			System.out.println(2222);
			response.getWriter().println("false");
		}
		
		String phone=request.getParameter("uphone");
		System.out.println("电话号码："+phone);
		if(userService.isUserPhoneExit(phone)) {
			response.getWriter().println("true");
		}else{
			response.getWriter().println("false");
		}
	}

}
