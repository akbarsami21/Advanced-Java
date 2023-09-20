<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page errorPage="error_ex.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result division</title>
</head>
<body>
	<%
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	int a = Integer.parseInt(num1);
	int b = Integer.parseInt(num2);

	int c = a / b;
	%>
	<h2>
		Result Of Division =
		<%=c%></h2>
</body>
</html>