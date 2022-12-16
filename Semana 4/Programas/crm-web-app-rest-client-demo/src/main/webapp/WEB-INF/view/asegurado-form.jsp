<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">	  
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Lista de Asegurados 2022</h2>
		</div>
	</div>

	<div class="container-fluid mt-3">
		<h3>Crear Asegurado</h3>
	
		<form:form action="saveAsegurado" modelAttribute="asegurado" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
		
					
			<table>
				<tbody>
					<tr>
						<td><label>Nombre:</label></td>
						<td><form:input path="nombre" /></td>
					</tr>
				
					<tr>
						<td><label>Apellidos:</label></td>
						<td><form:input path="apellido" /></td>
					</tr>
					
					<tr>
						<td><label>RFC:</label></td>
						<td><form:input path="rfc" /></td>
					</tr>
					
					<tr>
						<td><label>Numero de poliza:</label></td>
						<td><form:input path="numpoliza" /></td>
					</tr>
					
					<tr>
						<td><label>Telefono:</label></td>
						<td><form:input path="telefono" /></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Guardar" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
			
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a class="btn btn-warning" href="${pageContext.request.contextPath}/asegurados/list">Regresar a la lista</a>
		</p>
	
	</div>

</body>

</html>