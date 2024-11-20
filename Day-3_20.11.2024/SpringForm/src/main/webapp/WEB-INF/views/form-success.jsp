<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<html>

<head>

<title>Form Submission Success</title>

</head>

<body>

	<h2>${message}</h2>
	
	<p>Student object: ${student}</p>

	<p>Student Details:</p>

	<ul>

		<li>Name: ${student.sname}</li>

		<li>Email: ${student.semail}</li>

		<li>Mobile: ${student.smobile}</li>

		<li>Address: ${student.saddress}</li>

	</ul>

</body>

</html>