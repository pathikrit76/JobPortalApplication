package com.jobportal.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
//(exclude = {ErrorMvcAutoConfiguration.class})
/* we can exclude like  org.springframework.boot.webmvc.autoconfigure.error.ErrorMvcAutoConfiguration*/
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
