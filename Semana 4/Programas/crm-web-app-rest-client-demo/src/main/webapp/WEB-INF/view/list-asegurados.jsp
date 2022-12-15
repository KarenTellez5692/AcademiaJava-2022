<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<!DOCTYPE html>

	<html>

	<head>
		<title>Lista Asegurados</title>

		<!-- reference our style sheet -->

		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
		<style>
			@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;700&display=swap');
		</style>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

	</head>

	<body>

		<div id="wrapper">
			<div id="header">
				<h2>Lista de Asegurados 2022</h2>
			</div>
		</div>

		<div class="container-fluid">

			<div class="mt-3">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Nombre</th>
							<th>Apellido</th>
							<th>RFC</th>
							<th>Numero de Poliza</th>
							<th>Telefono</th>
							<th>Email</th>
							<th>Accion</th>
						</tr>
					</thead>
					<tbody class="table-group-divider">
						<!-- loop over and print our customers -->
						<c:forEach var="tempAsegurados" items="${asegurados}">

							<c:url var="updateLink" value="/asegurados/showFormForUpdate">
								<c:param name="aseguradoId" value="${tempAsegurados.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/asegurados/delete">
								<c:param name="aseguradoId" value="${tempAsegurados.id}" />
							</c:url>

							<tr>
								<td> ${tempAsegurados.nombre} </td>
								<td> ${tempAsegurados.apellido} </td>
								<td> ${tempAsegurados.rfc} </td>
								<td> ${tempAsegurados.numpoliza} </td>
								<td> ${tempAsegurados.telefono} </td>
								<td> ${tempAsegurados.email} </td>

								<td>
									<!-- display the update link -->
									<a href="${updateLink}" class="btn btn-warning btn-sm">Actualizar</a>
									|
									<a href="${deleteLink}" class="btn btn-danger btn-sm"
										onclick="if (!(confirm('Estï¿½s seguro de querer eliminar a estï¿½ asegurado?'))) return false">Eliminar</a>
								</td>

							</tr>

						</c:forEach>
					</tbody>

				</table>

			</div>
			<!-- put new button: Add Customer -->
			<input type="button" value="Añadir Asegurado" onclick="window.location.href='showFormForAdd'; return false;"
				class="btn btn-success mt-3" />

		</div>


	</body>

	</html>