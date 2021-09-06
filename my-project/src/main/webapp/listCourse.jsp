<%@ page import="myproject.entity.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course</title>
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
					<form action="EnrollCourseServlet" method="post">
						<% Course c = (Course)request.getAttribute("course"); %>
						<div class="form-group">
					    	<label>Course ID</label>
					    	<input type="number" class="form-control" name="courseId" value="<%= c.getCourseId() %>" readonly="readonly">
					  	</div>
					  	<div class="form-group">
					    	<label>Course Name</label>
					    	<input type="text" class="form-control" name="courseName" value="<%= c.getCourseName() %>" readonly="readonly" >
					  	</div>
					  <div class="form-group">
					    <label>Course Description</label>
					    <input type="text" class="form-control" name="courseDesc" value="<%= c.getCourseDesc() %>" readonly="readonly" >
					  </div>
					  <div class="form-group">
					    <label>Course Fee</label>
					    <input type="text" class="form-control" name="courseFee" value="<%= c.getCourseFee() %>" readonly="readonly">
					  </div>
					  <div class="form-group">
					    <label>Course Resource</label>
					    <input type="text" class="form-control" name="courseRes" value="<%= c.getCourseRes() %>" readonly="readonly">
					  </div>
					  <button type="submit" class="btn btn-primary">Enroll Course</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>