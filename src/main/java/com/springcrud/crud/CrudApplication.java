package com.springcrud.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;


@SpringBootApplication
public class CrudApplication  {


	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
