<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Something Went Wrong</title>
<style>
* {
	padding: 0px;
	margin: 0px;
}
</style>
</head>
<body>
	<div style="padding: 20px; color: red; background: cyan;">
		<h1>Something Went Wrong</h1>
		<br>
		<p><%=exception %></p>
	</div>
</body>
</html>