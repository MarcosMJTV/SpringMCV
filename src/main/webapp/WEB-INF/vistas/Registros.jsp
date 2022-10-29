<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>crud</title>
</head>
<body>
	<div class="container mt-4">
		<div class="card border-info">
			<div class="card-header bg-info text-white">
				<a class = "btn btn-primary" href="Agregar.html">Nuevo Registro</a>
			</div>
			<div class="card-body">
			<table class = " table table-hover">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nombre</th>
						<th>Apellido</th>
						<th>Correo</th>
						<th>Nacionalidad</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="datos" items="${lista}">
						<tr>
							<td>${datos.Id}</td>
							<td>${datos.Nombre}</td>
							<td>${datos.Apellido}</td>
							<td>${datos.Correo}</td>
							<td>${datos.Nacionalidad}</td>
							<td><a href="Editar.html?id=${datos.Id}" class = "btn btn-warning">Editar</a> 
							<a class = "btn btn-danger">Eliminar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</div>
		</div>
	</div>
</body>
</html>