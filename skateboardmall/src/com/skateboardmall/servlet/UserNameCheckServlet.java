package com.skateboardmall.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skateboardmall.service.IUserInfoService;
import com.skateboardmall.service.impl.UserInfoService;


@WebServlet("/UserNameCheckServlet")
public class UserNameCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUserInfoService userService;   
   
    public UserNameCheckServlet() {
        super();
        
    }

	@Override
	public void init() throws ServletException {
		userService = new UserInfoService();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/text");
		
		String name=request.getParameter("uname").trim();
		if(userService.isUserNameExit(name)) {
			response.getWriter().println("nametrue");
		}else{
			response.getWriter().println("namefalse");
		}
		 
	}

}
