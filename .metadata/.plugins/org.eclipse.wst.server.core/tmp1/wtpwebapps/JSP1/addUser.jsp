<%@page import="com.model.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="e" class="com.db.Employee"></jsp:useBean>
    <jsp:setProperty property="*" name="e"></jsp:setProperty>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int status = EmployeeDao.save(e);
if(status > 0)
{
	response.sendRedirect("addUserForm.jsp?status="+status);
}
%>
</body>
</html>