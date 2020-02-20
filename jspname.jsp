<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean class="mybeans.Emp" id="e"/>
<br>
Emp Name:Mr./Mrs./Miss ${e.name.fname }${e.name.lname }
</body>
</html>