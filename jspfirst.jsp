<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%!
private String getName(){
	return "Arya S" ;
}
private String phone(){
	return "9496622676" ;
}
private String getCity(){
	return "Kochi" ;
}
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body bgcolor=black>
<font size="+3" color=white>
My name is  <%= getName() %><br><br>
I am coming from <%= getCity() %><br><br>
My phone number is <%= phone() %>
</font>
</body>
</html>