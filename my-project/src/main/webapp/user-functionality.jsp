<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Role</title>
<link href="./Css/user.css" rel="stylesheet" type="text/css">
<%@ include file = "header.jsp" %>
</head>
<body>

	<% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
		if(session.getAttribute("user")==null)
			response.sendRedirect("loginUser.jsp");
	%>
	<section class="container-fluid bg">
		<section class="row justify-content-center">
			<div class="card" style="width: 18rem;">
			  <div class="card-body">
			    <h4 class="card-title">Welcome ${user.getName()}</h4>
			    <p class="card-text">What you wanna do.</p>
			    <a href="contact.jsp" class="btn btn-block">Add contact</a>
			    <a href="enrollCourse.jsp" class="btn btn-block">Enroll course</a>
			    <a href="feedback.jsp" class="btn btn-block">Add feedback</a>
			  </div>
			</div>
		</section>
	</section>
</body>
</html>