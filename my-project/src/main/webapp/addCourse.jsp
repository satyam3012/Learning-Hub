<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Add Course</title>
</head>
<body>
	<%@ include file = "header.jsp" %>
	<h2>Hey ${user.getName()}</h2>
	<div class="container">
		<div class="row col-md-6 col-md-offset-3">
			<div class="panel panel-primary">
				<div class="panel-heading text-center">
					<h1>Add Course Form</h1>				
				</div>
				<div class="panel-body">
					<form action="AddCourseServlet" method="post">
	  					<div class="form-group">
	    					<label>Course ID</label>
	    					<input type="number" class="form-control" name="courseId" placeholder="Enter course Id">
						</div>
						<div class="form-group">
						    <label>Course Name</label>
						    <input type="text" class="form-control" name="courseName" placeholder="Enter course name">
						</div>
						<div class="form-group">
						    <label>Course Resource</label>
						    <input type="text" class="form-control" name="courseRes" placeholder="Enter course resource">
						</div>
						<div class="form-group">
						    <label>Course Description</label>
						    <input type="text" class="form-control" name="courseDesc" placeholder="Enter course description">
						</div>
						  <div class="form-group">
						    <label>Course Fee</label>
						    <input type="number" class="form-control" name="courseFee" placeholder="Enter course fee">
						</div>
						<button type="submit" class="btn btn-primary">Add</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>