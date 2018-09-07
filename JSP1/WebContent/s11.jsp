<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
ID: ${param.id}<br>
NAME: ${param.name}<br>
<%session.setAttribute("email","shivam@gmail.com");
session.setAttribute("phone","12345678");

Cookie ck1 = new Cookie("age","20");
Cookie ck2 = new Cookie("branch","CSE");
response.addCookie(ck1);
response.addCookie(ck2);

%>
<a href="s12.jsp">Click here for S12</a>
</body>
</html>