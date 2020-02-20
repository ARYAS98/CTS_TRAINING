<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example of 'fn:containsIgnoreCase'tag of jstl</title>
</head>
<body>
<c:set var="name" value="Love Java very much"/>//set is predefined method in core library used to assign a data to variable
<c:out value="given String is :${name }"/>//to out the data in window
<form method="POST">
<table>
<tr>
<td> Enter String</td>
<td> <input type="text" name="searchString"></td>
</tr>
<tr>
<td></td>
<td><input type="radio" name="case1" value="y">Match Case
<input type="radio" name="case1" value="n">Ignore Case
</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Search"></td>//default function means check the form action and send the data to the specified url.button has no default func we have to provide it
</tr>
</table>
</form>
<c:if test="${pageContext.request.method=='POST' }">//test is an attribute.it checked if the request is post or get.
<c:set var="searchString" value="${param.searchString }"/>//parameter
<c:if test="${param.case1=='y' }">
<c:choose>
<c:when test="${fn:contains(name,searchString)==true }">
<font size="5" color="green">String  found</font>
</c:when>
<c:otherwise>
<font size="5" color="red">String not found</font>
</c:otherwise>
</c:choose>
</c:if>


<c:if test="${param.case1=='n' }">
<c:choose>
<c:when test="${fn:containsIgnoreCase(name,searchString)==true }">
<font size="5" color="green">String found</font>
</c:when>
<c:otherwise>
<font size="5" color="red">String not found</font>
</c:otherwise>
</c:choose>
</c:if>
</c:if>
</body>
</html>