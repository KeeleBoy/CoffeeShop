<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit product</title>
</head>
<body>
	<h1>EDIT</h1>
	<main class="container">

		<form action="/update" method="post">
			<input type="hidden" name="id" value="${product.id}" />


			<div class="form-group">
				<label for="name">Name</label> <input class="form-control" id="name"
					name="name" value="${product.name}" required minlength="2"
					autocomplete="off">
			</div>


			<div class="form-group">
				<label for="description">Description</label> <input
					class="form-control" id="description" name="description"
					value="${product.description}" required minlength="3">
			</div>



			<div class="form-group">
				<label for="price">Price</label> <input class="form-control"
					id="price" name="price" value="${product.price}" required>
			</div>


			<div class="form-group">
				<label for="quantity">Quantity</label> <input class="form-control"
					id="quantity" name="quantity" value="${product.quantity}" required>
			</div>




			<button type="submit" class="btn btn-primary">Submit</button>
			<a href="/" class="btn btn-link">Back home</a>
		</form>
	</main>
</body>
</html>