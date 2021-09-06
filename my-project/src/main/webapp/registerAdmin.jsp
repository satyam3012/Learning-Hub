<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Register Admin</title>
	<link href="./Css/login.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file = "header.jsp" %>
	<section class="container-fluid bg">
		<section class="row justify-content-center">
			<div class="col-12 col-sm-6 col-md-3">
				<form class="form-container" action="RegisterAdminServlet" method="post" autocomplete="off">
					<h4>Create new account</h4>
					<div class="form-group">
						<label>Admin Id</label>
					    <input type="number" class="form-control" name="adminId" placeholder="enter admin id">
					</div>
					<div class="form-group">
						<label>Admin Name</label>
					    <input type="text" class="form-control" name="adminName" placeholder="enter admin name">
					</div>
					<div class="form-group">
						<label>Password</label>
					    <input type="password" class="form-control" name="password" placeholder="enter password">
					</div>
					<div class="form-group">
						<label>EmailId</label>
					    <input type="email" class="form-control" name="email" placeholder="enter email id">
					</div>
					<button type="submit" class="btn btn-block">Register</button>
				</form>
			</div>
		</section>
	</section>
</body>
</html>