<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
int x = 10;
int y = 20;
int z = x+y;
%>
The value of x is <%=x %><br>
The value of y is <%=y %><br>
After add the value is: 
<%out.print(z); %>
<br>
Enter the details..................<hr>
<form action="s2.jsp">
<pre>
ID:<input type="text" name="id"><br>
NAME: <input type="text" name="name"><br>
<input type="submit" value="go">
</pre>
</form>
<br>
</body>
</html>