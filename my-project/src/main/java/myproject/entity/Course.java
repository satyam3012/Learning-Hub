package myproject.entity;

import java.util.Objects;

public class Course {
	
	private int courseId;
	private String courseName;
	private String courseDesc;
	private String courseFee;
	private String courseRes;

	public Course(int courseId, String courseName, String courseDesc, String courseFee, String courseRes) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.courseFee = courseFee;
		this.courseRes = courseRes;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public String getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}

	public String getCourseRes() {
		return courseRes;
	}

	public void setCourseRes(String courseRes) {
		this.courseRes = courseRes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseDesc, courseFee, courseId, courseName, courseRes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseDesc, other.courseDesc) && Objects.equals(courseFee, other.courseFee)
				&& courseId == other.courseId && Objects.equals(courseName, other.courseName)
				&& Objects.equals(courseRes, other.courseRes);
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDesc=" + courseDesc
				+ ", courseFee=" + courseFee + ", courseRes=" + courseRes + "]";
	}
	
	
}
