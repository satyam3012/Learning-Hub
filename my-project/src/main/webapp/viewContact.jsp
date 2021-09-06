<%@ page import="java.util.ArrayList"%>
<%@ page import="myproject.entity.Contact"%>
<%@ page import="myproject.dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Contacts</title>
</head>
<body>
	<%@ include file = "header.jsp" %>
	<table class="table table-striped">
	  <thead>
	    <tr>
	      <th scope="col">Contact Id</th>
	      <th scope="col">User Id</th>
	      <th scope="col">User Name</th>
	      <th scope="col">Email</th>
	      <th scope="col">Phone No</th>
	      <th scope="col">Message</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<% AdminDao aDao = new AdminDao(); 
 		ArrayList<Contact> list = aDao.getAllContacts();
		for(Contact data : list) {%>
	    	<tr>
				<td><%= data.getContactId() %></td>
				<td><%= data.getUserId() %></td>
				<td><%= data.getName() %></td>
				<td><%= data.getEmail() %></td>
				<td><%= data.getPhoneNo() %></td>
				<td><%= data.getMessage() %></td>
			</tr>
		<%}%>
	  </tbody>
	</table>
	 
</body>
</html>