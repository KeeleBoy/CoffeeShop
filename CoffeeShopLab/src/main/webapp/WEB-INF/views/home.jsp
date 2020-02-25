<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Add to top of every j s p -->

<!DOCTYPE html>
<html>
<head>
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
				<c:forEach var="Products" items="${products}">


					<tr>
						<td>${Products.getproducts}</td>
					</tr>


				</c:forEach>

			</thead>
		</table>
	</div>
	<div>

		<a href="/add" class="btn btn-secondary">Create account</a>
	</div>
</body>
</html>