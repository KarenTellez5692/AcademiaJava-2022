<%@ page import="java.util.*, com.luv2code.web.jdbc.*" %>
<!DOCTYPE html>
<html>

<head>
	<title>Empleado Tracker App</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<%
// get the students from the request object (sent by servlet)
	List<Empleado> theEmpleado = 
			(List<Empleado>) request.getAttribute("Empleado_LIST");
%>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Empeados Xideral</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<table>
			
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Area</th>
				</tr>
				
				<%
								for (Empleado tempEmpleado : theEmpleado) {
								%>
				
					<tr>
						<td> <%= tempEmpleado.getFirstName() %> </td>
						<td> <%= tempEmpleado.getLastName() %> </td>
						<td> <%= tempEmpleado.getEmail() %> </td>
						<td> <%= tempEmpleado.getEmail() %> </td>
					</tr>
				
				<% } %>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








