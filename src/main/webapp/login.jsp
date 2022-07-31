<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	
	<form action="login" method = "post">
		Enter Username : <input type = "text" name = "logInUsername"> <br><br>
		Enter Password : <input type = "password" name = "logInPswd"> <br><br>
		<button type="submit">Submit</button>
		<button type ="reset">Reset</button>
	</form>
</body>
</html>