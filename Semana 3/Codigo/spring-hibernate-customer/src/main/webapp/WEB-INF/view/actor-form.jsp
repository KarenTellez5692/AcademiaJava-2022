<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Guardar actor</title>
	
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
	
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div class="container mt-3">
		<h3>Guardar actor</h3>
	
		<form:form action="saveActor" modelAttribute="actor" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
			
			<div class="mb-3 mt-3">
			  <label for="nameActor">Nombre</label>
			  <input type="text" class="form-control" id="nameActor" name="name" placeholder="Ingrese el nombre del actor" value=${actor.name}>
			</div>
			
			<div class="mb-3">
			  <label for="lastnameActor">Apellido</label>
			  <input type="text" class="form-control" id="lastnameActor" name="lastname" placeholder="Ingrese el apellido del actor" value=${actor.lastname}>
			</div>
			<div class="mb-3">
			  <label for="telephoneActor">Teléfono</label>
			  <input type="tel" class="form-control" id="telephoneActor" name="phone"  placeholder="Ingrese el teléfono del actor" value=${actor.phone}>
			</div>
			<div class="mb-3">
			  <label for="typeActor">Tipo de actor</label>
			  <input type="text" class="form-control" id="typeActor" name="typeActor" placeholder="Ingrese el tipo de actor" value=${actor.typeActor}>
			</div>
			<button type="submit" class="btn btn-primary btn-guardar">Guardar</button>
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a class="btn btn-warning" href="${pageContext.request.contextPath}/actor/list">Regresar a la lista</a>
		</p>
	
	</div>

</body>

</html>










