<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<form:form action="success.htm" modelAttribute="customer">
		First Name::<form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		<br>
		<br>
		Last Name ::<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		Email ::<form:input path="email" />
		<form:errors path="email" cssClass="error" />
		<br>
		<br>
	Free passes:: 	<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br>
		<br>
		Postal Code:: 	<form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
	<a href="home.htm">Home</a>
</body>
</html>