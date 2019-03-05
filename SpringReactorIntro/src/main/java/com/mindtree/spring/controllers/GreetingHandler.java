package com.mindtree.spring.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;
//The Controller method
@Component
public class GreetingHandler {
	
	public Mono<ServerResponse> hello(ServerRequest request) {
		System.out.println("Entering the Greeting Handler");
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
			.body(BodyInserters.fromObject("Hello, Spring!"));
	}
}
