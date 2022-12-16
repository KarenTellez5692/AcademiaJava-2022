package com.luv2code.springboot.cruddemo.dao;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Asegurado;

@Repository
public class AseguradoDAOJdbcImpl implements AseguradoDAO {

	@Autowired
	DataSource dataSource;

	@Override
	public List<Asegurado> findAll() {
		System.out.println("Implementación DAO con JDBC findAll(): " + dataSource);

		List<Asegurado> listaAsegurados = new ArrayList<>();

		String sql = "select * from asegurados";

		try (Connection myConn = dataSource.getConnection();
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery(sql);) {

			// process result set
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String nombre = myRs.getString("nombre");
				String apellido = myRs.getString("apellido");
				String rfc = myRs.getString("rfc");
				String numpoliza = myRs.getString("numpoliza");
				String telefono = myRs.getString("telefono");
				String email = myRs.getString("email");

				// create new student object
				Asegurado tempAsegurado = new Asegurado(id, nombre, apellido, rfc, numpoliza, telefono, email);

				// add it to the list of students
				listaAsegurados.add(tempAsegurado);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaAsegurados;
	}

	@Override
	public Asegurado findById(int theId) {
		
		System.out.println("Implementación DAO con JDBC findById(): ");
		Asegurado theAsegurado = null;

		try (Connection myConn = dataSource.getConnection();
			PreparedStatement myStmt = createPreparedStatement(myConn, theId);
			ResultSet myRs = myStmt.executeQuery();) {

			// retrieve data from result set row
			if (myRs.next()) {
				String nombre = myRs.getString("nombre");
				String apellido = myRs.getString("apellido");
				String rfc = myRs.getString("rfc");
				String numpoliza = myRs.getString("numpoliza");
				String telefono = myRs.getString("telefono");
				String email = myRs.getString("email");

				// use the studentId during construction
				theAsegurado = new Asegurado(theId, nombre, apellido, rfc, numpoliza, telefono, email);
			} else {
				throw new SQLException("Could not find employee id: " + theId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return theAsegurado;
	}

	private PreparedStatement createPreparedStatement(Connection con, int empleadoId) throws SQLException {
		String sql = "select * from asegurados where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, empleadoId);
		return ps;
	}

	@Override
	public void save(Asegurado theAsegurado) {
		String sql = "";

		if (theAsegurado.getId() == 0)
			sql = "insert into asegurados (nombre, apellido, rfc, numpoliza, telefono, email) values (?, ?, ?, ?, ?, ?)";
		else
			sql = "update asegurados set nombre=?, apellido=?, rfc=?, numpoliza=?, telefono=?, email=? where id=?";

		try (Connection myConn = dataSource.getConnection();
			 PreparedStatement myStmt = myConn.prepareStatement(sql)) {

			myStmt.setString(1, theAsegurado.getNombre());
			myStmt.setString(2, theAsegurado.getApellido());
			myStmt.setString(3, theAsegurado.getRfc());
			myStmt.setString(4, theAsegurado.getNumpoliza());
			myStmt.setString(5, theAsegurado.getTelefono());
			myStmt.setString(6, theAsegurado.getEmail());

			if (theAsegurado.getId() != 0)
				myStmt.setInt(7, theAsegurado.getId());

			myStmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteById(int theId) {
		
		try (Connection myConn = dataSource.getConnection(); 
			 PreparedStatement myStmt = myConn.prepareStatement("delete from asegurados where id=?")) {
			
			myStmt.setInt(1, theId);
			myStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
