package com.DatabaseWith.database;

import com.DatabaseWith.database.entity.Student;
import com.DatabaseWith.database.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class DatabaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DatabaseApplication.class);
		StudentRepo repo=context.getBean(StudentRepo.class);

	}

}
