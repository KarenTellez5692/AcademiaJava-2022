<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
	<title>Lista de actores</title>
	
	<!-- reference our style sheet -->
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" 
		  rel="stylesheet" 
		  integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" 
		  crossorigin="anonymous">

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>ARM - Actor Relationship Manager</h2>
		</div>
	</div>

	<div class="container-fluid">
		<!-- put new button: Add Customer -->
		
		<input type="button" value="Añadir Actor"
			   onclick="window.location.href='showFormForAdd'; return false;"
			   class="btn btn-primary add-button" />
	
		<div id="content">
			<!--  add our html table here -->
			<table class="table table-striped table-light">
				<tr>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Teléfono</th>
					<th>Tipo de Actor</th>
					<th>Accion</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempActor" items="${actors}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/actor/showFormForUpdate">
						<c:param name="actorId" value="${tempActor.id}" />
					</c:url>					

					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/actor/delete">
						<c:param name="actorId" value="${tempActor.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempActor.name} </td>
						<td> ${tempActor.lastname} </td>
						<td> ${tempActor.phone} </td>
						<td> ${tempActor.typeActor} </td>
						
						<td>
							<!-- display the update link -->
							<a class="btn btn-warning btn-sm" href="${updateLink}">Actualizar</a>
							|
							<a href="${deleteLink}"
							   class="btn btn-danger btn-sm"
							   onclick="if (!(confirm('Estás seguro de eliminar esté actor?'))) return false">Eliminar</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
			
				
		</div>
	
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" 
		    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" 
		    crossorigin="anonymous"></script>
</body>

</html>









