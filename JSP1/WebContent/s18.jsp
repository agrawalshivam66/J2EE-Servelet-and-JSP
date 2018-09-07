<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

<sql:setDataSource var="db" driver="oracle.jdbc.OracleDriver"
url ="jdbc:oracle:thin:@localhost:1522:xe" user="system" password="root"/>

<sql:update dataSource="${db} ">
insert into student values(100,'raja',7.4)
</sql:update>

<sql:update dataSource="${db} ">
insert into student values(100,'rani',8.5)
</sql:update>

<sql:query var="rs" dataSource="${db }">
select * drom student
</sql:query>

<table width="100%" border="2">
<tr>
<th>ROLL</th>
<th>NAME</th>
<th>CGPA</th>
</tr>
</table>

<c:forEach var="table" items="${rs.rows }">
<tr>
<td><c:out value="${table.roll }"></c:out></td>
<td><c:out value="${table.name }"></c:out></td>
<td><c:out value="${table.cgpa }"></c:out></td>
</tr>
</c:forEach>

</body>
</html>