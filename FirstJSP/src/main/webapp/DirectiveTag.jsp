<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Random" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>directive tags</title>
</head>
<body>
<%@include file="Header.jsp" %>
<%
Random random=new Random();
int r=random.nextInt(7,10);
%>
<h1>Random Number: <%= r %></h1>
</body>
</html>