<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("name1");
String password=request.getParameter("name2");
if(name.equals("arya")&&password.equals("arya"))
{
	response.sendRedirect("demo1.html");
}
else
{
	response.sendRedirect("demo2.html");
}
%>
</body>
</html>