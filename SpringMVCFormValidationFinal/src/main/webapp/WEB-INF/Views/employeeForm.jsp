<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMPLOYEE|FORM</title>
<style>
.error {
	color: Red;
}
</style>
</head>
<body>
	<h1 style="color: red;">
		<b>Employee Form</b>
	</h1>
	<form:form action="employeeSave.htm" modelAttribute="employee">
		Employee ID::<form:input path="id" />
		<form:errors path="id" cssClass="error" />
		<br>
		<br>
		Employee NAME::<form:input path="name" />
		<form:errors path="name" cssClass="error" />
		<br>
		<br>
		Employee Role :: <form:select path="role">

			<form:option value="" label="Select Role" />
			<form:option value="ceo" label="CEO" />
			<form:option value="manager" label="MANAGER" />
			<form:option value="developer" label="DEVELOPER" />
		</form:select>
		<br>
		<br>
		<input type="submit" value="Submit">
		<br>
		<br>

	</form:form>
	<a href="home.htm">HOME</a>
</body>
</html>