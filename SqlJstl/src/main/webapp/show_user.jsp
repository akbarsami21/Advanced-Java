<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body style="Background: black;">
	<br>
	<br>
	<h1 style="text-align: center; color: white;">User Information</h1>
	<br>
	<br>
	<sql:setDataSource driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/longinfo" user="root"
		password="root" var="ds"></sql:setDataSource>
	<sql:query dataSource="${ds }" var="rs">select * from userinfo;</sql:query>
	<div class="container" style="Background: pink;">

		<table class="table">
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Country</td>
				<td>Number</td>
			</tr>
			<c:forEach items="${rs.rows }" var="row">
				<tr>
					<td><c:out value="${ row.Id}"></c:out></td>
					<td><c:out value="${ row.Name}"></c:out></td>
					<td><c:out value="${ row.Country}"></c:out></td>
					<td><c:out value="${ row.Number}"></c:out></td>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>