<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Register User</title>
	<link href="./Css/login.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file = "header.jsp" %>
	<section class="container-fluid bg">
		<section class="row justify-content-center">
			<div class="col-12 col-sm-6 col-md-3">
				<form class="form-container" action="RegisterUserServlet" method="post" autocomplete="off">
					<h4>Create new account</h4>
					<div class="form-group">
						<label>User Id</label>
					   	<input type="number" class="form-control" name="userId" placeholder="enter user id">
					</div>
					<div class="form-group">
						<label>Course Id</label>
					    <input type="number" class="form-control" name="courseId" readonly="readonly">
					</div>
					<div class="form-group">
						<label>User Name</label>
					    <input type="text" class="form-control" name="userName" placeholder="enter user name">
					</div>
					<div class="form-group">
						<label>Phone No</label>
					    <input type="text" class="form-control" name="userPhoneNo" placeholder="enter phone no">
					</div>
					<div class="form-group">
						<label>Email Id</label>
					   	<input type="email" class="form-control" name="userEmail" placeholder="enter email id">
					</div>
					<div class="form-group">
						<label>Address</label>
					    <input type="text" class="form-control" name="userAddress" placeholder="enter address">
					</div>
					<div class="form-group">
						<label>Register Date</label>
					    <input type="date" class="form-control" name="userRegDate" placeholder="enter registration date">
					</div>
					<div class="form-group">
						<label>Password</label>
					    <input type="password" class="form-control" name="password" placeholder="enter password">
					</div>
					<button type="submit" class="btn btn-block">Register</button>
				</form>
			</div>
		</section>
	</section>
</body>
</html>