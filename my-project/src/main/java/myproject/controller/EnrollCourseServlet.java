package myproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import myproject.dao.UserDao;
import myproject.entity.Course;
import myproject.entity.User;

@WebServlet("/EnrollCourseServlet")
public class EnrollCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollCourseServlet() {
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
		PrintWriter out = response.getWriter();
		int courseId = Integer.parseInt(request.getParameter("courseId"));
		User user = (User) request.getSession().getAttribute("user");
		
		UserDao userDao = new UserDao();
		try {
			if(userDao.enrollCourse(courseId, user.getUserId())) {
				out.println("course enrollment done");
				user.setCourseId(courseId);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
