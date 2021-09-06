<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Index page</title>
	<link href="./Css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file = "header.jsp" %>
	<% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
	%>
	<section class="banner">
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<h2>Welcome to my Learning Hub</h2>
					<p>It is an online learning hub created under my first Amdocs project built in jsp/servlets.</p>
					<a href="#" class="btn">Read More</a>
				</div>
			</div>
		</div>
	</section>
</body>
</html>