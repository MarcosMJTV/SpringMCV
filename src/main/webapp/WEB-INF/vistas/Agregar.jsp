<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<div class="container mt-4 col-lg-4">
		<div class= "card border-info">
			<div class= "card-header bg-info">
				<h4>Agregar Nuevo Registro</h4>
			</div>	
			<div claSS= "card-body">
				<form method="POST">
					<label>Nombre</label>
					<input type="text" name="nombre" class="form-control">
					<label>Apellido</label>
					<input type="text" name="apellido" class="form-control">
					<label>Correo</label>
					<input type="text" name="correo" class="form-control">
					<label>Nacionalidad</label>
					<input type="text" name="nacionalidad" class="form-control">
					<input type="submit" name="Agregar" class="btn btn-success">
					
					<a href="redireccionar_registros.html">Regresar</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>