<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'Hello welcome to JSTL...' }"></c:out>
<c:set var="mark" value="50"></c:set>
<c:if test="${ mark>30 }">
<c:out value="${'yes pass'}"></c:out>
</c:if><br>
<c:choose>
<c:when test="${mark>60}">
<c:out value="${'yes first'}"></c:out>
</c:when>
<c:otherwise>
<c:out value="${'fail'}"></c:out>
</c:otherwise>
</c:choose><br>
<c:remove var="mark"/>
MARK: <c:out value="${mark}"></c:out><br>
<c:forEach begin="1" end="10" step="3" var="i">
I=<c:out value="${i}"></c:out><br>
</c:forEach>
</body>
</html>