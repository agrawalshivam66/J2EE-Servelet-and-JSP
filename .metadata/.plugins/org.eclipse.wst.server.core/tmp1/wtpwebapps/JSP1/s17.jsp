<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

<c:set var="s" value="JSP is Simple"></c:set>
Length : <c:out value="${fn:length(s) }"></c:out><br>
<c:if test="${fn:contains(s,'S') }">
<c:out value="Yes Exist"></c:out><br>
</c:if> 

<c:if test="${fn:endsWith(s,'e') }">
<c:out value="Yes Ends with"></c:out><br>
</c:if> 

<c:if test="${fn:startsWith(s,'J') }">
<c:out value="Yes Starts with"></c:out><br>
</c:if> 

SubString: <c:out value="${fn:substring(s,2,6) }"></c:out><br>




</body>
</html>