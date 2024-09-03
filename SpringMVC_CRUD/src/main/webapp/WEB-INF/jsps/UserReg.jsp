<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<h1 align="center">User Registration</h1>
			
			<table align="center">
			
			<form:form action="userreg" method="post" modelAttribute="user">
			<form:hidden path="id"/>
			
			<tr>
			<td><form:label path="name">Username</form:label> </td>
			<td><form:input path="name"/> 
				<form:errors path="name"></form:errors>
			</td>
			
			</tr>
			
			<tr>
			<td><form:label path="email">Email</form:label> </td>
			<td><form:input path="email"/> </td>
			</tr>
			
			<tr>
			<td><form:label path="age">Age</form:label> </td>
			<td><form:input path="age"/> </td>
			</tr>
			
			
			<tr>
			<td></td>
			<td><input type="submit"></td>
			</tr>
			
			</form:form>
			
			</table>
			
			<h1 align="center">User Details</h1>
			
			<table align="center" border="1">
			<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Age</th>
			<th colspan="2">Action</th>
			</tr>
			
			<c:forEach var="dt" items="${data}">
			
			<tr>
			<td>${dt.getId()}</td>
			<td>${dt.getName()}</td>
			<td>${dt.getEmail()}</td>
			<td>${dt.getAge()}</td>
			<td><a href="delete?did=${dt.getId()}">Delete</a></td>
			<td><a href="edit?eid=${dt.getId()}">Edit</a></td>
			</tr>
			
			</c:forEach>
			
			
			</table>
</body>
</html>