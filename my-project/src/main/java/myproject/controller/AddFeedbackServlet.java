package myproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myproject.dao.UserDao;
import myproject.entity.Feedback;

/**
 * Servlet implementation class AddFeedbackServlet
 */
@WebServlet("/AddFeedbackServlet")
public class AddFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddFeedbackServlet() {
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
		int fId = Integer.parseInt(request.getParameter("feedbackId"));
		int uId = Integer.parseInt(request.getParameter("userId"));
		String email = request.getParameter("email");
		String userName = request.getParameter("userName");
		String feedback = request.getParameter("feedback");
		
		Feedback fb = new Feedback(fId, uId, userName, email, feedback);
		UserDao userDao = new UserDao();
		try {
			if(userDao.addFeedback(fb)) {
				response.sendRedirect("index.jsp");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
