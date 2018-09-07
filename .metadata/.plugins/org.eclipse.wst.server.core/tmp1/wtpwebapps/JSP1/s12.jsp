<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

Email value from session : ${sessionScope.email}<br>
 Phone value from session : ${sessionScope.phone}<br>


Age value from Cookie : ${cookie.age.value}<br>
Branch value from Cookie : ${cookie.branch.value}<br>
</pre>
</form>
<br>
</body>
</html>