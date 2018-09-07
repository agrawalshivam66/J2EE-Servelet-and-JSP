<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Bank</title>
</head>
<body>
<center><font size = "15" color = "red">
<%
String status = request.getParameter("status");

if(status != null)
{
	if(status.equals("-1"))
	{
	out.println("Account number doesnot exist");
	}
 	
	else if(status.equals("0"))
{
out.println("Amount Update error");
}

else
{
out.println("Amount Updated Successfully...");
}
}

%>
</font></center>

<form action="bank.controller.Deposit">
	<pre>
	Account number: <input type="text" name="actno"><br>
	Amount : <input type="text" name="amount"><br>
	<input type="submit" value="Deposit">
	</pre>
</form>
</body>
</html>