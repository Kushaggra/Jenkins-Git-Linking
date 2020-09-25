package com.kushaggra.basePackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestAppApplication {

	public static void main(String[] args) {
		//Hi there, testing commmit build with Git-Jenkins WebHooks
		SpringApplication.run(JenkinsTestAppApplication.class, args);
	}

}
