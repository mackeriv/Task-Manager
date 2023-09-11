package com.example.taskmgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("module-service")
public class TaskmgrApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmgrApplication.class, args);
	}

}
