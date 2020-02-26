<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm</title>
</head>
<body>
	<h1>Confirm?</h1>
	<a class="btn link"
		href="/confirm/yes?first_name=${first_name}&last_name=${last_name}&email=${email}&phone_number=${phone_number}&password=${password}">Yes</a>
	<a class="btn link" href="/add">No</a>
</body>
</html>