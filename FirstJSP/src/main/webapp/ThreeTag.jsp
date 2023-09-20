<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp practice</title>
</head>
<body>
	<%!int a = 10;
	int b = 15;
	String name = "masud";

	public int doSum() {
		return a + b;
	}

	public String revName() {
		StringBuffer sb=new StringBuffer(name);
		return sb.reverse().toString();
	}%>
	
	<%
	out.println("A Value Is: "+a+"<br>");
	out.println("B Value Is: "+b+"<br>");
	out.println("Sum Is    : "+doSum()+"<br>");
	out.println("Name      : "+revName()+"<br>");
	%>
	<h1 style=color:red;>My Name Is : <%= revName() %></h1>
	
</body>
</html>