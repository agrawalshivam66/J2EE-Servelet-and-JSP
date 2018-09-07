<%@page import="com.model.EmployeeDao"%>
<%@page import="com.db.Employee"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
LinkedList<Employee> list = EmployeeDao.getDetails();%>

<table border="2" width="100%">
<tr>
<th>USERID</th>
<th>DEPARTMENT</th>
<th>LOCATION</th>
</tr>

<%
for(Employee e : list)
{
	%>
	<tr>
	<td><%=e.getUserid() %> </td>
	<td><%=e.getDepartment() %> </td>
	<td><%=e.getLocation() %> </td>
	</tr>
	<% 
}
%>
</table>

</body>
</html>