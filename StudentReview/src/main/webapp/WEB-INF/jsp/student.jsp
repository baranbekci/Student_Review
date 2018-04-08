<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Review</title>
</head>
<body>

<form:form action="student.do" method="POST" commandName="student">

	<table>
		<tr>
			<td>ID</td>
			<td> <form:input path="stuId" /> </td>
		</tr>
		<tr>
			<td>Name</td>
			<td> <form:input path="stuName" /></td>
		</tr>
		<tr>
			<td>Surname</td>
			<td> <form:input path="stuSurname" /></td>
		</tr>
		<tr>
			<td>Phone</td>
			<td> <form:input path="stuPhone" /></td>
		</tr>
		<tr>
			<td>City</td>
			<td> <form:input path="stuCity" /></td>
		</tr>
		<tr>
			<td>District</td>
			<td> <form:input path="stuDistrict" /></td>
		</tr>
		<tr>
			<td>Description</td>
			<td> <form:input path="stuDiscrition" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add">
				<input type="submit" name="action" value="Delete">
				<input type="submit" name="action" value="Update">
				<input type="submit" name="action" value="Search">
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border=1>
	<th>Stu Id</th>
	<th>Stu Name</th>
	<th>Stu Surname</th>
	<th>Stu Phone</th>
	<th>Stu City</th>
	<th>Stu District</th>
	<th>Stu Description</th>
	
	<c:forEach items="${studentList} " var ="student">
		<tr>
			<td>${student.stuId}</td>
			<td>${student.stuName}</td>
			<td>${student.stuSurname}</td>
			<td>${student.stuPhone}</td>
			<td>${student.stuCity}</td>
			<td>${student.stuDistrict}</td>
			<td>${student.stuDiscription}</td>
		</tr>
	</c:forEach>
</table>


</body>
</html>