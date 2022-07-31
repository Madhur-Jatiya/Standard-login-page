<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
	<h1>Signup</h1>
	
	<form action="signup" method = "post">
		Enter Username : <input type = "text" name = "signUpUsername"> <br><br>
		Enter Password : <input type = "password" name = "signUpPswd"> <br><br>
		Name : <input type = "text" name = "name"> <br><br>
		Mobile Number : <input type = "tel" name = "mobile" pattern="[0-9]{10}" required> <br><br>
		Address : <input type = "text" name = "address"> <br><br>
		<button type ="submit">SignUp</button>
		<button type ="reset">Reset</button>
	</form>
</body>
</html>