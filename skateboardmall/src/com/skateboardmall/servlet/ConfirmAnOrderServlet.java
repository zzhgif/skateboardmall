package com.skateboardmall.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skateboardmall.bean.OrderInfo;
import com.skateboardmall.service.IOrderInfoService;
import com.skateboardmall.service.impl.OrderService;


@WebServlet("/ConfirmAnOrderServlet")
public class ConfirmAnOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ConfirmAnOrderServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String id=request.getParameter("id");
		
		IOrderInfoService orderInfoService=new OrderService();
		OrderInfo orderInfo=orderInfoService.queryOneOrderInfo(id);
		System.out.println(orderInfo);
		orderInfo.setOrder_state(1);
		System.out.println(orderInfo);
		
	
		System.out.println(orderInfoService.alterOrderInfo(orderInfo));
		
		response.sendRedirect("static/OrdsManagement.jsp");	
		
	}

}
