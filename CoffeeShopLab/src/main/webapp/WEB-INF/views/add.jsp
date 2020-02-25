<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create account</title>
</head>
<body>


	<div class="container">
		<h1>Create account</h1>
		<h2>Add a user</h2>
		<form action="/confirm" method="post">
			<table class="table">
				<tr>
					<th scope="row">First name</th>
					<td><input type="text" name="first_name" /></td>
				</tr>
				<tr>
					<th scope="row">Last name</th>
					<td><input type="text" name="last_name" /></td>
				</tr>
				<tr>
					<th scope="row">Email</th>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<th scope="row">Phone number</th>
					<td><input type="number" name="phone_number" /></td>
				</tr>
				<tr>
					<th scope="row">Password</th>
					<td><input type="text" name="password" /></td>
				</tr>


			</table>
			<button type="submit" class="btn btn-primary" href="/confirm">Add</button>
			<a class="btn link" href="/">Cancel</a>
		</form>
	</div>

</body>
</html>