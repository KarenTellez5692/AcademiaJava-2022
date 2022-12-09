<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Empleados Xideral</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" 
		  rel="stylesheet" 
		  integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" 
		  crossorigin="anonymous">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Empleados Xideral</h2>
		</div>
	</div>

	<div class="container-fluid">
	
		<div id="content">
		
			<!-- put new button: Add Student -->
			
			<input type="button" value="Añadir Empleado" 
				   onclick="window.location.href='add-empleado-form.html'; return false;"
				   class="btn btn-primary add-button"
			/>
			
			<div id="content">
			
				<table class="table table-striped table-light">
				
					<tr>
						<th>Nombre</th>
						<th>Apellido</th>
						<th>Email</th>
						<th>Area</th>
						<th>Acción</th>
					</tr>
					
					<c:forEach var="tempStudent" items="${LISTA_ESTUDIANTES}">
						
						<!-- set up a link for each student -->
						<c:url var="tempLink" value="EmpleadoControllerServlet">
							<c:param name="command" value="LOAD" />
							<c:param name="studentId" value="${tempStudent.id}" />
						</c:url>
	
						<!--  set up a link to delete a student -->
						<c:url var="deleteLink" value="EmpleadoControllerServlet">
							<c:param name="command" value="DELETE" />
							<c:param name="studentId" value="${tempStudent.id}" />
						</c:url>
																			
						<tr>
							<td> ${tempStudent.firstName} </td>
							<td> ${tempStudent.lastName} </td>
							<td> ${tempStudent.email} </td>
							<td> ${tempStudent.area} </td>
							<td> 
								<a class="btn btn-warning btn-sm" href="${tempLink}">Actualizar</a> 
								 | 
								<a href="${deleteLink}"
								onclick="if (!(confirm('Are you sure you want to delete this empleado?'))) return false"
								class="btn btn-danger btn-sm">
								Eliminar</a>	
							</td>
						</tr>
					
					</c:forEach>
					
				</table>
			</div>
		
		</div>
	
	</div>
</body>


</html>








