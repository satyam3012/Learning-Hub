package myproject.entity;

import java.sql.Date;
import java.util.Objects;

public class User {
	private int userId;
	private int courseId;
	private String name;
	private String phoneNo;
	private String email;
	private String address;
	private Date regDate;
	private String password;
	
	public User(int userId, int courseId, String name, String phoneNo, String email, String address, Date regDate, String password) {
		super();
		this.userId = userId;
		this.courseId = courseId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		this.regDate = regDate;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, courseId, email, name, password, phoneNo, regDate, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && courseId == other.courseId
				&& Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(phoneNo, other.phoneNo)
				&& Objects.equals(regDate, other.regDate) && userId == other.userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", courseId=" + courseId + ", name=" + name + ", phoneNo=" + phoneNo
				+ ", email=" + email + ", address=" + address + ", regDate=" + regDate + ", password=" + password + "]";
	}
	
}
