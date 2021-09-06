<%@ page import="java.util.ArrayList"%>
<%@ page import="myproject.entity.User"%>
<%@ page import="java.util.Arrays"%>
<%@ page import="myproject.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Users</title>
</head>
<body>
	<%@ include file = "header.jsp" %>
	<table class="table table-striped">
	  <thead>
	    <tr>
	      <th scope="col">User Id</th>
	      <th scope="col">User Name</th>
	      <th scope="col">Phone No</th>
	      <th scope="col">Email</th>
	      <th scope="col">Address</th>
	      <th scope="col">Reg Date</th>
	      <th scope="col">Password</th>
		  <th scope="col">Course Id</th>
	    </tr>
	  </thead>
	  <tbody>
			<% UserDao uDao = new UserDao(); 
 			ArrayList<User> list = uDao.getAllUsers();
			for(User data : list) {%>
			<tr>
				<td><%= data.getUserId() %></td>
				<td><%= data.getName() %></td>
				<td><%= data.getPhoneNo() %></td>
				<td><%= data.getEmail() %></td>
				<td><%= data.getAddress() %></td>
				<td><%= data.getRegDate() %></td>
				<td><%= data.getPassword() %></td>
				<td><%= data.getCourseId() %></td>
			</tr>
			<%}%>
		</tbody>
	</table>

</body>
</html>