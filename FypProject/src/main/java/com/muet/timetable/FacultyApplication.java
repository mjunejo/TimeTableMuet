package com.muet.timetable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaAuditing
public class FacultyApplication {
	
	public static void main(String[] args) {

      SpringApplication.run(FacultyApplication.class, args);
	
	
	}

}
