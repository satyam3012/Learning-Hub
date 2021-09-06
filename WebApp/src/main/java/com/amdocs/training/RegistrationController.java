package com.amdocs.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistrationController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		int id = Integer.parseInt(req.getParameter("id"));
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		
		Connection conn = DBUtil.getConnection();
		String sql = "insert into user values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setString(4, email);
			ps.setLong(5, phone);
			
			int updatedRows = ps.executeUpdate();
			
			if(updatedRows > 0) {
				out.println("Data Inserted Successfully");
			}else {
				out.println("Try Again!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
