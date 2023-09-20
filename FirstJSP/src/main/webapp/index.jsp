<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page errorPage="errorMessage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example Of Taglib</title>
</head>
<body>
	<h1>Taglib</h1>
	<hr>
	<c:out value="${34+56 }"></c:out>
	<br>
	<%!int n1 = 200;
	int n2 = 220;%>
	<%
	int div = n1 / n2;
	%>
	<c:set var="name" value="Akbar Sami"></c:set>
	<c:out value="${name}"></c:out>
	<br>
	<c:if test="${3>2}">
		<h1>Condition Work</h1>
	</c:if>

	<h1>
		Division :
		<%=div%></h1>
</body>
</html>