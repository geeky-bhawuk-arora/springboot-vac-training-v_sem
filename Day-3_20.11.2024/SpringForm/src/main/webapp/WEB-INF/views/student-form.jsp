<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Student Form</title>
</head>
<body>
	<h2>Student Form</h2>
	<form:form action="processForm" method="post" modelAttribute="student">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="sname" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="semail" /></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><form:input path="smobile" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><form:textarea path="saddress" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>