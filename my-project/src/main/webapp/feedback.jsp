<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Feedback Page</title>
</head>
<body>
	<%@ include file = "header.jsp" %>
	<h2>Hey ${user.getName()}</h2>
	<div class="container">
		<div class="row col-md-6 col-md-offset-3">
			<div class="panel panel-primary">
				<div class="panel-heading text-center">
					<h3>Feedback Form</h3>
				</div>
				<div class="panel-body">
					<form action="AddFeedbackServlet" method="post">
					  <div class="form-group">
					    <label>Feedback ID</label>
					    <input type="number" class="form-control" name="feedbackId" placeholder="Enter feedback Id">
					  </div>
					  <div class="form-group">
					    <label>User ID</label>
					    <input type="number" class="form-control" name="userId" value="${user.getUserId()}" readonly="readonly">
					  </div>
					  <div class="form-group">
					    <label>Email ID</label>
					    <input type="email" class="form-control" name="userId" value="${user.getEmail()}" readonly="readonly">
					  </div>
					  <div class="form-group">
					    <label>User Name</label>
					    <input type="text" class="form-control" name="userName" value="${user.getName()}" readonly="readonly">
					  </div>
					  <div class="form-group">
					    <label>Feedback</label>
					    <input type="text" class="form-control" name="feedback" placeholder="enter feedback">
					  </div>
					  <button type="submit" class="btn btn-primary">Add Feedback</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>