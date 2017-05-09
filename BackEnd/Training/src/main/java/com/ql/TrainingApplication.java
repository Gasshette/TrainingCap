package com.ql;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ContextIdApplicationContextInitializer;

import com.ql.dao.IUserRepository;

@SpringBootApplication
public class TrainingApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
	}
}
