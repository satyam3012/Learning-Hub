<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login User</title>
	<link href="./Css/login.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file = "header.jsp" %>
		<% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
	%>
	<section class="container-fluid bg">
		<section class="row justify-content-center">
			<div class="col-12 col-sm-6 col-md-3">
				<form class="form-container" action="LoginUserServlet" method="post" autocomplete="off">
					<h5>Sign into your account</h5>
					<div class="form-group">
				    	<label>UserName</label>
					   	<input type="text" class="form-control" name="userName" placeholder="enter user name">
					</div>
					<div class="form-group">
				    	<label>Password</label>
						<input type="password" class="form-control" name="pswd" placeholder="enter password">
					</div>
					<button type="submit" class="btn btn-block">Login</button>
					<a href="#">Forgot password</a>
					<p>Don't have an account? <a href="registerUser.jsp">Register here</a></p>
				</form>
			</div>
		</section>
	</section>
</body>
</html>