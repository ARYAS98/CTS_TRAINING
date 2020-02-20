<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*;"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Map map=new HashMap();
map.put("name","Tim");
map.put("address","200 Saint Thomas Loop");
map.put("state","Virgina,USA");
request.setAttribute("useMap",map);
%>
<body>
<center>
<table>
<tr><td><b>The first element in Map is:</b></td><td><b>${useMap ["name"]}</b></td></tr><br>
<tr><td><b>The second element in Map is: </b></td><td><b>${useMap["address"] }</b></td></tr><br>
<tr><td><b>The third element in Map is: </b></td><td><b>${useMap["state"] }</b></td></tr>
</table>
</center>
</body>
</html>