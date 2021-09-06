package myproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import myproject.dao.AdminDao;
import myproject.entity.Admin;

public class RegisterAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegisterAdminServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
   		super.doGet(req, resp);
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("adminId"));
		String name = request.getParameter("adminName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		AdminDao adminDao = new AdminDao();
		Admin admin = new Admin(id, name, email, password);
		
		try {
			if(adminDao.registerAdmin(admin)) {
				HttpSession session = request.getSession();
				session.setAttribute("user", admin);
				response.sendRedirect("admin-functionality.jsp");
			}
			else
				out.println("Admin not registered");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
