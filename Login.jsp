<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginApplication</title>
</head>
<body>
<form action="LoginServlet" method="post">
UserName<input type="text" name="username">
Password<input type="password" name="password">
<input type="submit" value="login">
<input type="reset"> 
</form>

</body>
</html>