package com.skateboardmall.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.skateboardmall.json.sms.SendSmsL;



/**
 * Servlet implementation class SmsServlet
 */
@WebServlet("/SmsServletL")
public class SmsServletL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String phone=request.getParameter("phone");
		System.out.println(phone);
		int code=SendSmsL.getCode();
		request.getSession().setAttribute("lcode", code);
		System.out.println(code);
		String msg = null;
		try {
			msg = SendSmsL.SendMessage(phone, code);
		} catch (ServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter pw =response.getWriter();
		pw.write(msg);
		
	}

}

