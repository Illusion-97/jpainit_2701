package com.example.jpainit;

import com.example.jpainit.entities.basic.models.B_Foo;
import com.example.jpainit.entities.basic.models.Enumeration;
import com.example.jpainit.entities.basic.repositories.B_FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JpainitApplication {

	@Autowired
	private B_FooRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpainitApplication.class, args);
	}

	// Sera vu durant le cours Spring Web
	@EventListener
	public void onStartup(ApplicationStartedEvent event) {
		repository.findAll().forEach(System.out::println);
	}

}
