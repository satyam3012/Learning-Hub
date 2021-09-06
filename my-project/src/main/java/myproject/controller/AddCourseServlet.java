package myproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myproject.dao.AdminDao;
import myproject.entity.Course;

/**
 * Servlet implementation class AddCourseServlet
 */
@WebServlet("/AddCourseServlet")
public class AddCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourseServlet() {
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
		int cId = Integer.parseInt(request.getParameter("courseId"));
		String cName = request.getParameter("courseName");
		String cRes = request.getParameter("courseRes");
		String cDesc = request.getParameter("courseDesc");
		String cFee = request.getParameter("courseFee");
		
		Course c = new Course(cId, cName, cDesc, cFee, cRes);
		AdminDao adminDao = new AdminDao();
		
		try {
			if(adminDao.addCourse(c)) {
				out.println("course added");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
