<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Add Contact Page</title>
	<link href="./Css/contact.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file = "header.jsp" %>
	<h2>Hey ${user.getName()}</h2>
	<section class="container-fluid bg">
		<section class="row justify-content-center">
			<div class="col-12 col-sm-6 col-md-3">
				<form class="form-container" action="AddContactServlet" method="post">
					<div class="form-group">
						<label>Contact ID</label>
					    <input type="number" class="form-control" name="contactId" placeholder="Enter contact Id">
					</div>
					<div class="form-group">
					   	<label>User ID</label>
					    <input type="number" class="form-control" name="userId" value="${user.getUserId()}" readonly="readonly" >
					</div>
					<div class="form-group">
					    <label>User Name</label>
					    <input type="text" class="form-control" name="userName" value="${user.getName()}" readonly="readonly" >
					</div>
					<div class="form-group">
					    <label>Email Id</label>
					    <input type="text" class="form-control" name="email" value="${user.getEmail()}" readonly="readonly">
					</div>
					<div class="form-group">
					    <label>Phone Number</label>
					    <input type="text" class="form-control" name="phoneNo" value="${user.getPhoneNo()}" readonly="readonly">
					</div>
					<div class="form-group">
					    <label>Message</label>
					    <input type="text" class="form-control" name="message" placeholder="Enter message">
					</div>
					<button type="submit" class="btn btn-block">Add Contact</button>
				</form>
			</div>
		</section>
	</section>
</body>
</html>