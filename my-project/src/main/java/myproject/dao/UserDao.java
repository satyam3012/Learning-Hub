package myproject.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import myproject.entity.Contact;
import myproject.entity.Course;
import myproject.entity.Feedback;
import myproject.entity.User;
import myproject.utils.DbUtil;

public class UserDao {
	//creating connection with database
	Connection conn = DbUtil.getConnection("myproject");
	
	/*
	 * method to register user into database 
	 * parameter : taking User object as an argument
	 */
	public boolean registerUser(User user) throws SQLException {
		String query = "insert into user1(user_id, name, phone_no, email, address, reg_date, password) values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPhoneNo());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getAddress());
			ps.setDate(6, user.getRegDate());
			ps.setString(7, user.getPassword());
			
			int rows = ps.executeUpdate();
			if(rows > 0) {
				System.out.println("data inserted successfully.");
				return true;
			}
		} catch(SQLException e) {
			System.out.println("Sql exception !!");
			e.printStackTrace();
		}
		return false;
	}
	
	/*
	 * method to login user into system 
	 * parameter : taking user-name and password as arguments
	 * return type : User reference
	 */ 
	public User loginUser(String username, String password) throws SQLException {
		String query = "select * from user1 where name = ? and password = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int userId = rs.getInt(1);
				String uName = username;
				String phoneNo = rs.getString(3);
				String email = rs.getString(4);
				String address = rs.getString(5);
				Date regdate = rs.getDate(6);
				String pswd = password;
				int courseId = rs.getInt(8);
				return new User(userId, courseId, uName, phoneNo, email, address, regdate, pswd);
			}
			else
				return null;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * method to add contact into database 
	 * parameter : taking contact object as an argument
	 */
	public boolean addContact(Contact contact) throws SQLException {
		String query = "insert into contact values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, contact.getContactId());
			ps.setString(2, contact.getName());
			ps.setString(3, contact.getEmail());
			ps.setString(4, contact.getPhoneNo());
			ps.setString(5, contact.getMessage());
			ps.setInt(6, contact.getUserId());
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				System.out.println("contact added successfully.");
				return true;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/*
	 * method to enroll user into course 
	 * parameters : taking course-id and user-id as arguments
	 */
	public boolean enrollCourse(int cId, int uId) throws SQLException {
		String query = "update user1 set courseId = ? where user_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, cId);
			ps.setInt(2, uId);
			
			int rows = ps.executeUpdate();
			if(rows > 0) {
				System.out.println("user enrolled successfully.");
				return true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/*
	 * method to add feedback into database 
	 * parameter : taking feedback object as an argument
	 */
	public boolean addFeedback(Feedback fb) throws SQLException {
		String query = "insert into feedback values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, fb.getUserId());
			ps.setString(2, fb.getName());
			ps.setString(3, fb.getEmail());
			ps.setInt(4, fb.getFeedbackId());
			ps.setString(5, fb.getFeedback());
			
			int rows = ps.executeUpdate();
			if(rows > 0 ) {
				System.out.println("feedback added");
				return true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//method to get all users from database
	public ArrayList<User> getAllUsers() throws SQLException {
		String query = "select * from user1";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		ArrayList<User> list = new ArrayList<>();
		try {
			while(rs.next()) {
				int userId = rs.getInt(1);
				String userName = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				String address = rs.getString(5);
				Date date = rs.getDate(6);
				String pwd = rs.getString(7);
				int courseId = rs.getInt(8);
				
				User user = new User(userId, courseId, userName, phone, email, address, date, pwd);
				list.add(user);
			}
			return list;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
