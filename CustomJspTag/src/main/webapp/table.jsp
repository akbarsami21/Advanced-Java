<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/table.tld" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>table for number</title>
</head>
<body>
<t:printTable number="20" color="red"></t:printTable>
<t:printTable number="5" color="blue"></t:printTable>
<t:printTable color="red" number="8"></t:printTable>
</body>
</html>