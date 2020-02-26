<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Add to top of every j s p -->



<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div class="container">
		<h1>Products</h1>
		<table>


			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Quantity</th>
				</tr>
				<c:forEach var="product" items="${products}">
					<!-- Use bean map to map objects -->

					<tr>
						<td>${product.name}</td>
						<td>${product.description}</td>
						<td>${product.price}</td>
						<td>${product.quantity}</td>

					</tr>


				</c:forEach>

			</thead>
		</table>
	</div>
	<div>

		<a href="/add" class="btn btn-secondary">Create account</a>
	</div>

	<div>
		<a href="/admin" class="btn btn-secondary">Administer control page</a>
	</div>
</body>
</html>