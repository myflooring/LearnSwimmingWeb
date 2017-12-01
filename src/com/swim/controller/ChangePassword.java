package com.swim.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.swim.domain.User;
import com.swim.iservice.iuserservice;
import com.swim.service.userservice;



/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private iuserservice us = new userservice();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		if(session.getAttribute("user")==null){
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
			}
		else
			request.getRequestDispatcher("changepassword.jsp").forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		User user=(User) session.getAttribute("User");
		String oldpassword=request.getParameter("oldpassword");//用户输入的旧密码
		String repassword=request.getParameter("repassword");//用户输入的新密码
		if(oldpassword.equals(user.getUserpassword())) {
			//验证用户输入的密码是否正确，正确执行修改密码操作
			try {
				 User newuser=us.changeassword(user, repassword);
				 if(newuser!=null) {
				 session.setAttribute("User", newuser);
				 response.getWriter().print("修改成功！");
				 response.sendRedirect("PersonCenter.jsp");
				 return;
				 }
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				response.getWriter().print("旧密码输入错误，请检查");
			}
		}
			response.getWriter().print("旧密码输入错误，请检查");
			return;
	}
}
