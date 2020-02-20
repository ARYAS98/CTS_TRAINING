<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Using Abstract Class</h1>
<%! 
javax.servlet.jsp.JspWriter pw;
abstract class Rectangle
{
	int length,breadth,area;
	abstract int getArea() throws java.io.IOException;
	public void setArea(int length,int breadth) throws java.io.IOException
	{
		this.length=length;
		this.breadth=breadth;
		pw.println("Calculating the area of the rectangle........<br>");
		pw.println("The area of the rectangle is ");
		pw.println(getArea());
	}
}
class Rectangle1 extends Rectangle
{
	int getArea() throws java.io.IOException
	{
		area=length*breadth;
		return(area);
	}
}
%>
<%
pw=out;
Rectangle rect=new Rectangle1();
rect.setArea(2,3);
%>
</body>
</html>