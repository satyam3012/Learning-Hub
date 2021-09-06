<%@ page import="java.util.ArrayList"%>
<%@ page import="myproject.entity.Course"%>
<%@ page import="myproject.dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Enroll Course</title>
</head>
<body>
	<%@ include file = "header.jsp" %>
	<h2>Hey ${user.getName()}</h2>
	<div class="container">
		<div class="row col-md-6 col-md-offset-3">
			<div class="panel panel-primary">
				<div class="panel-heading text-center">
					<h3>Course Enrollment Form</h3>
				</div>
				<div class="panel-body">
					<form action="SeachCourseByIdServlet" method="post">
						<label>Course ID</label>
						<select class="form-select" name="courseId">
						<option selected>Select course Id</option>
						<% AdminDao adminDao = new AdminDao();
						ArrayList<Integer> list = adminDao.getCourseIds();
						for(int id : list) { %>
						    <option><%= id %></option>
						<%}%>
						</select><br>
					  <button type="submit" class="btn btn-primary">Search</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>