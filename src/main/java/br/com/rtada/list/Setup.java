package br.com.rtada.list;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class Setup {
		
	public static void main (String[] args) {
		SpringApplication.run(Setup.class, args);
	}
	
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/listavip");
	    dataSource.setUsername("root");
	    dataSource.setPassword("root");
		
		return dataSource();
	}
}
