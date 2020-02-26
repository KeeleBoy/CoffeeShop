<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Add to top of every j s p -->



<!DOCTYPE html>
<html>



<head>

<script>
	function myFunction() {
		confirm("Confirm!");
	}
</script>



<meta charset="ISO-8859-1">
<title>Delete</title>

</head>


<h1>Administer page</h1>
<div class="container">
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="product" items="${products}">
				<!-- Use bean map to map objects -->

				<tr>
					<td>${product.name}</td>
					<td>${product.description}</td>
					<td>${product.price}</td>
					<td>${product.quantity}</td>
					<!-- <td><a href="/edit" class="btn btn-secondary">Edit item</a></td> -->

					<!-- BELOW IS HOW YOU FORCE ID INTO THE CONTROLLER -->
					<td><a href="/edit?id=${ product.id }"
						class="btn btn-secondary">Edit</a></td>

					<td><button href="/delete?id=${ product.id }"
							class="btn btn-secondary" onclick="myFunction()">Delete</button></td>

				</tr>


			</c:forEach>

		</thead>
	</table>
</div>



<body>


	<div>
		<a href="/additem" class="btn btn-secondary">Add item</a>
	</div>
	<div>
		<a href="/" class="btn btn-secondary">Back home</a>
	</div>


</body>
</html>