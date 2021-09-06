package myproject.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myproject.dao.AdminDao;
import myproject.entity.Course;

/**
 * Servlet implementation class SeachCourseByIdServlet
 */
@WebServlet("/SeachCourseByIdServlet")
public class SeachCourseByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeachCourseByIdServlet() {
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
		int id = Integer.parseInt(request.getParameter("courseId"));
		AdminDao adminDao = new AdminDao();
		try {
			Course course = adminDao.getCourseById(id);
			if(course!=null) {
				request.setAttribute("course", course);
				RequestDispatcher rd = request.getRequestDispatcher("listCourse.jsp");
				rd.forward(request, response);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
