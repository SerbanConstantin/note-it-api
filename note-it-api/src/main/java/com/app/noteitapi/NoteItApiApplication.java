package com.app.noteitapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class NoteItApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(NoteItApiApplication.class, args);
	}

}
