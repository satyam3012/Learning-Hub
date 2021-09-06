package myproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import myproject.dao.UserDao;
import myproject.entity.User;

public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterUserServlet() {
        super();
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
		PrintWriter out = response.getWriter();
		int userId = Integer.parseInt(request.getParameter("userId"));
		String userName = request.getParameter("userName");
		String userPhone = request.getParameter("userPhoneNo");
		String email = request.getParameter("userEmail");
		String address = request.getParameter("userAddress");
		Date date = Date.valueOf(request.getParameter("userRegDate"));
		String pswd = request.getParameter("password");
		
		User user = new User(userId, 0, userName, userPhone, email, address, date, pswd);
		UserDao userDao = new UserDao();
		
		try {
			if(userDao.registerUser(user)) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				response.sendRedirect("user-functionality.jsp");
			}
			else
				out.println("user didnot registered");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
