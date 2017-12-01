package com.swim.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.swim.domain.user;
import com.swim.iservice.iuserservice;
import com.swim.service.userservice;

/**
 * Servlet implementation class register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private iuserservice us=new userservice();
	   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String userid=request.getParameter("userid");
		String username=request.getParameter("username");
		String userpassword=request.getParameter("userpassword");
		HttpSession session=request.getSession();
		user u=new user();
		u.setUserid(userid);
		u.setUsername(username);
		u.setUserpassword(userpassword);
		user realuser=null;
		try {
			realuser=us.register(u);
			
		}catch (Exception e) {
			// TODO: handle exception
			response.getWriter().print("用户名密码不匹配！");
			response.sendRedirect("Login.jsp");
		}
		if(realuser!=null) {
			session.setAttribute("user", realuser);
			// when user Login sucessfully,turn to ChooseCourse.jsp
			response.sendRedirect("ChooseCourse.jsp");
		}else {
			response.getWriter().print("用户名密码不匹配！");
			response.sendRedirect("Login.jsp");
		}
	}

}
