<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout Page</title>
<link href="./Css/logout.css" rel="stylesheet" type="text/css">
<%@ include file = "header.jsp" %>
</head>
<body>
	<% session.invalidate();
		response.sendRedirect("index.jsp");
	%>
</body>
</html>