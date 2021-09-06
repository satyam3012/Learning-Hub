<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login Admin</title>
	<link href="./Css/login.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file = "header.jsp" %>
	<section class="container-fluid bg">
		<section class="row justify-content-center">
				<div class="col-12 col-sm-6 col-md-3">
					<form class="form-container" action="LoginAdminServlet" method="post" autocomplete="off">
						<h5>Sign into your account</h5>
						<div class="form-group">
							<label>Username</label>
							<input type="text" class="form-control" name="userName" placeholder="enter admin name">
						</div>
						<div class="form-group">
							<label>Password</label>
							<input type="password" class="form-control" name="pswd" placeholder="enter password">
						</div>
						<button type="button" class="btn btn-block">Login</button>	
						<a href="#">Forgot password</a>
						<p>Don't have an account? <a href="registerAdmin.jsp">Register here</a></p>
					</form>
				</div>
		</section>
	</section>
</body>
</html>