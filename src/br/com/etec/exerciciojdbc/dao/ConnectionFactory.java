package br.com.etec.exerciciojdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			//Class.forName("com.microsoft.sqlserver)
			String connectionUrl = "jdbc:sqlserver://localhost;database=jdbc;integratedSecurity=true;";
			Connection con = DriverManager.getConnection(connectionUrl);
					return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
}
