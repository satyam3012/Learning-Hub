package myproject.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import myproject.entity.Admin;
import myproject.entity.Contact;
import myproject.entity.Course;
import myproject.utils.DbUtil;

public class AdminDao {
	//creating connection with database
	Connection conn = DbUtil.getConnection("myproject");
	
	/*
	 * method to register admin into database
	 * parameter : taking admin object as an argument
	 */
	public boolean registerAdmin(Admin admin) throws SQLException {
		String query = "insert into admin values(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, admin.getAdminId());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getEmail());
			ps.setString(4, admin.getPassword());
			
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
	 * method to login admin into system
	 * parameters : taking admin-name and password as arguments
	 */
	public Admin loginAdmin(String aname, String pswd) throws SQLException {
		String query = "select * from admin where name = ? and password = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, aname);
			ps.setString(2, pswd);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int adminId = rs.getInt(1);
				String aName = aname;
				String email = rs.getString(3);
				String pwd = pswd;
				return new Admin(adminId, aName, email, pwd);
			}
			else
				return null;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * method to add course into database
	 * parameter : taking Course object as an argument
	 */
	public boolean addCourse(Course c) throws SQLException {
		String query = "insert into course values (?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, c.getCourseId());
			ps.setString(2, c.getCourseName());
			ps.setString(3, c.getCourseDesc());
			ps.setString(4, c.getCourseFee());
			ps.setString(5, c.getCourseRes());
			
			int rows = ps.executeUpdate();
			if(rows > 0) {
				System.out.println("course added");
				return true;
			}
		} catch(SQLException e) {
			System.out.println("Sql exception !!");
			e.printStackTrace();
		}
		return false;
	}
	
	//method to get all contacts from database
	public ArrayList<Contact> getAllContacts() throws SQLException {
		String query = "select * from contact";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		ArrayList<Contact> list = new ArrayList<>();
		try {
			while(rs.next()) {
				int userId = rs.getInt(1);
				String userName = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String msg = rs.getString(5);
				int conId = rs.getInt(6);
				
				Contact contact = new Contact(conId, userId, userName, email, phone, msg);
				list.add(contact);
			}
			return list;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Integer> getCourseIds() throws SQLException {
		String query = "select course_id from course";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		ArrayList<Integer> list = new ArrayList<>();
		try {
			while(rs.next()) {
				int id = rs.getInt("course_id");
				list.add(id);
			}
			return list;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Course getCourseById(int id) throws SQLException {
		String query = "select * from course where course_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int cid = id;
				String cname = rs.getString(2);
				String desp = rs.getString(3); 
				String fee = rs.getString(4);
				String res = rs.getString(5);
				return new Course(cid, cname, desp, fee, res);
			}
			else
				return null;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
