package com.mindtree.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

import com.mindtree.spring.controllers.GreetingWebClient;

//Spring boot application to Demonstrate Asynchronous task execution using Webflux 
//Reference:https://spring.io/guides/gs/reactive-rest-service/
//https://www.javaworld.com/article/3288219/spring-framework/mastering-spring-framework-5-part-2-spring-webflux.html?page=2

@SpringBootApplication
@EnableWebFlux
public class SpringReactorIntroApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringReactorIntroApplication.class, args);
		System.out.println("Main method hit");
	/*	GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());*/
	}

}

