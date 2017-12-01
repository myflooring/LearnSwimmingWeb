package com.swim.controller;

import java.io.IOException;
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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private iuserservice us=new userservice();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("login.jsp").forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Get user's userid and password from Login.jsp
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String userid=request.getParameter("userid");
		String userpassword=request.getParameter("userpassword");
		HttpSession session=request.getSession();
		User u=new User();
		u.setUserid(userid);
		u.setUserpassword(userpassword);
		User realuser=null;
		try {
			realuser=us.login(u);
			
		}catch (Exception e) {
			// TODO: handle exception
			response.getWriter().print("用户名密码不匹配！");
			response.sendRedirect("Login.jsp");
		}
		if(realuser!=null) {
			session.setAttribute("User", realuser);
			// when user Login sucessfully,turn to ChooseCourse.jsp
			response.sendRedirect("ChooseCourse.jsp");
		}else {
			response.getWriter().print("用户名密码不匹配！");
			response.sendRedirect("Login.jsp");
		}
		
				
		
		
		
		
	}

}
