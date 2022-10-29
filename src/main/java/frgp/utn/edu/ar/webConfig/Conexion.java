package frgp.utn.edu.ar.webConfig;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conexion {

	public DriverManagerDataSource Conectar() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/registro");
		dataSource.setUsername("root");
		return dataSource;
	}
}
