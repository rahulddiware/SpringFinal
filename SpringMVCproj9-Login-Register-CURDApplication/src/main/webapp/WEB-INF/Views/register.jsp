<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<style>
span {
	color: red;
}
</style>
</head>
<body>
	<h1 style="color: red;" align="center">Welcome To HCL Technology</h1>
	<h3>Register Here</h3>
	<form:form method="post" commandName="stRegisterCmd">
	
	Student Number ::<form:input path="sno" />
		<form:errors path="sno" />
		<br>

	First Name ::<form:input path="fname" />
		<form:errors path="fname" />
		<br>
	Last Name ::<form:input path="lname" />
		<form:errors path="lname" />
		<br>
	Student City ::<form:input path="city" />
		<form:errors path="city" />
		<br>
	Student Email ::<form:input path="email" />
		<form:errors path="email" />
		<br>
	Student Mobile Number ::<form:input path="mno" />
		<form:errors path="mno" />
		<br>
	Student User Name ::<form:input path="userName" />
		<form:errors path="userName" />
		<br>
Student Password ::<form:password path="password" />
		<form:errors path="password" />
		<br>
		<input type="submit" value="Register Student">

	</form:form>

	<a href="login.htm">Login</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="home.htm">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

</body>
</html>