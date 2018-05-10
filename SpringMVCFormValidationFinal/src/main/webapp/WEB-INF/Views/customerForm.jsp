<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer|FORM</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<h1 style="color: red;">
		<b>Customer Form</b>
	</h1>
	<form:form action="customerSave.htm" modelAttribute="customer">
		Enter Customer Name :: <form:input path="name" />
		<form:errors path="name" cssClass="error" />
		<br>
		<br>
	
		Enter Customer Email :: <form:input path="email" />
		<form:errors path="email" cssClass="error" />
		<br>
		<br>
		Enter Customer Age :: <form:input path="age" />
		<form:errors path="age" cssClass="error" />
		<br>
		<br>
		Enter Customer Gender :: 
		<form:select path="gender">
			<form:option value="" label="Select Gender" />
			<form:option value="MALE" label="Male" />
			<form:option value="FEMALE" label="Female" />
			<form:errors path="gender" cssClass="error" />
		</form:select>
		<br>
		<br>
	Enter Customer BirthDate :: <form:input path="date"
			placeholder="dd/MM/yyyy" />
		<form:errors path="date" cssClass="error" />
		<br>
		<br>
	Enter Customer Phone :: <form:input path="phone" />
		<form:errors path="phone" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="Save Customer">
		<br>
		<br>
	</form:form>

	<a href="home.htm">HOME</a>
</body>
</html>