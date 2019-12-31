package com.skateboardmall.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImgResoultServlet
 */
@WebServlet("/ImgResoultServlet")
public class ImgResoultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    public ImgResoultServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置头部信息防止乱码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String clientCheckcode=request.getParameter("imgcode").toUpperCase();//接收客户端提交上来的参数，使用toUpperCase()可以实现不区分大小写
        String serverCheckcode=(String)request.getSession().getAttribute("checkcode");//从session中提取验证码
        System.out.println();
      if(clientCheckcode.equals(serverCheckcode)){
            response.getWriter().write("验证码正确，通过");
        }else{
            response.getWriter().write("验证码错误，失败");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
