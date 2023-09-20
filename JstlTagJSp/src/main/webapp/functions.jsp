<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>function example</title>
</head>
<body>
	<c:set var="name" value="Akbar Sami"></c:set>
	<h1>
		The Length Of Name:
		<c:out value="${fn:length(name)}"></c:out>
	</h1>
	<h1>
		The Index Of S :
		<c:out value="${fn:indexOf(name,'S')}"></c:out>
	</h1>
	<h1>
		After Trim Sami :
		<c:out value="${fn:toLowerCase(name)}"></c:out>
	</h1>



</body>
</html>