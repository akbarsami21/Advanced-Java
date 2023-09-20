<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jstl example</title>
</head>
<body>

	<c:set var="number" value="500"></c:set>
	<h1>
		<c:out value="${number}"></c:out>
	</h1>
	
	

	<c:if test="${number!=0 }">
		<h1>20 is not equal to 0</h1>
	</c:if>
	<hr>
	<c:choose>
		<c:when test="${number!=0 }">
			<h1>number not equal 0</h1>
		</c:when>
		<c:when test="${number>0 }">
			<h1>number is greater than zero</h1>
		</c:when>
		<c:otherwise>
			<h1>default value</h1>

		</c:otherwise>
	</c:choose>

<c:forEach var="i" begin="1" end="10">
  <h1>The Value Of i is <c:out value="${i }"></c:out></h1>
</c:forEach>

<c:url var="myurl" value="https://www.google.com/search">
<c:param name="q" value="who is ShahRukh Khan"></c:param>
</c:url>
<h1><c:out value="${myurl }"></c:out></h1>
<c:redirect url="${myurl }"></c:redirect>


</body>
</html>