package com.library.libv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LibvApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibvApplication.class, args);
	}

}
