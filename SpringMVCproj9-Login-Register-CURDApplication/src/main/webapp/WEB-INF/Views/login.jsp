<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1 style="color: red;" align="center">Welcome To HCL Technology</h1>
	<h3>Login Here</h3>
	<form:form method="POST" commandName="stLoginCmd">
		User Name::<form:input path="userName" />
		<form:errors path="userName" />

		<br>
	    Password::<form:password path="password" />
		<form:errors path="password" />
		<br>
		<input type="submit" value="Login">
	</form:form>
	<a href="home.htm">Home</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="register.htm">Register</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

	<h3 style="color: red;" align="center">${resultMessage}</h3>
	

</body>
</html>