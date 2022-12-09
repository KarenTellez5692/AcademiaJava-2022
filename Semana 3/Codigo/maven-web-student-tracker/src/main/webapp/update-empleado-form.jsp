<!DOCTYPE html>
<html>

<head>
	<title>Update Empleado</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Empleados Xideral</h2>
		</div>
	</div>
	
	<div class="container mt-3">
		<h3>Update Empleado</h3>
		
		<form action="EmpleadoControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="UPDATE" />

			<input type="hidden" name="studentId" value="${THE_STUDENT.id}" />
			
			<div class="mb-3 mt-3">
			  <label for="nameActor">Nombre</label>
			  <input type="text" class="form-control" id="nameActor" name="firstName" value=${THE_STUDENT.firstName}>
			</div>
			
			<div class="mb-3">
			  <label for="lastnameActor">Apellido</label>
			  <input type="text" class="form-control" id="lastnameActor" name="lastName" value=${THE_STUDENT.lastName}>
			</div>
			<div class="mb-3">
			  <label for="telephoneActor">Teléfono</label>
			  <input type="tel" class="form-control" id="telephoneActor" name="email" value=${THE_STUDENT.email}>
			</div>
			<div class="mb-3">
			  <label for="typeActor">Tipo de actor</label>
			  <input type="text" class="form-control" id="typeActor" name="area" value=${THE_STUDENT.area}>
			</div>
			<button type="submit" class="btn btn-primary btn-guardar">Guardar</button>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="EmpleadoControllerServlet">Regresar a la lista</a>
		</p>
	</div>
</body>

</html>











