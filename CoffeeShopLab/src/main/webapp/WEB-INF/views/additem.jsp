<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a product!</title>
</head>
<h1>ADD</h1>
<body>
	<main class="container">
		<h1>ADD NEW ITEM</h1>

		<!-- A form without an action submits back to the same URL, which is what we want here. -->
		<form action="/accept" method="post">
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