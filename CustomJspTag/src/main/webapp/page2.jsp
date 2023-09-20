<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page2</title>
</head>
<body>
	<h1>This is second page</h1>
	<%
	response.sendRedirect("https://www.google.com/");
	%>
</body>
</html>