<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Message from s2: <%=request.getParameter("msg") %><br>
The value if ID: <%=request.getParameter("id") %><br>
The value if NAME: <%=request.getParameter("name") %><br>

<a href="s4.jsp">Click here for s4</a>
</body>
</html>