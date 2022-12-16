<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Add Customer"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Nombre</th>
					<th>Apellidos</th>
					<th>RFC</th>
					<th>Número de poliza</th>
					<th>Teléfono</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempAsegurado" items="${asegurados}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/mvc/showFormForUpdate">
						<c:param name="aseguradoId" value="${tempAsegurado.id}" />
					</c:url>					

					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/mvc/delete">
						<c:param name="aseguradoId" value="${tempAsegurado.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempAsegurado.nombre} </td>
						<td> ${tempAsegurado.apellido} </td>
						<td> ${tempAsegurado.rfc} </td>
						<td> ${tempAsegurado.numpoliza} </td>
						<td> ${tempAsegurado.telefono} </td>
						<td> ${tempAsegurado.email} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Estás seguro de eliminar a esté asegurado?'))) return false">Eliminar</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









