<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
CITY from config: <%=config.getInitParameter("city")%><br>
STATE from context: <%=application.getInitParameter("state") %>

<%
session.setAttribute("email", "agrawalshivam66@gmail.com");
session.setAttribute("phone","1234567889");
%>
</body>
</html>