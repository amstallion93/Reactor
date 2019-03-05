package com.mindtree.spring.service;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.mindtree.spring.pojo.Book;

/*The BookRepository is a Spring Data interface, meaning that you define the interface 
and Spring Data will generate the code that implements that interface. Specifically, 
BookRepository extends the ReactiveMongoRepository, which defines the following reactive
methods
Mono<Book> save()
Flux<Book> saveAll()
Flux<Book> findById()
Mono<Boolean> existsById()
Flux<Book> findAll()
Flux<Book> findAllById()
Mono<Long> count()
Mono<Void> delete()
Mono<Void> deleteById()
Mono<Void> deleteAll()
Flux<Book> insert()
The BookRepository is defined with two generic parameters: Book, which is the type of document that the repository manages, 
and String, which is the type of the primary key (the Book's id field). 
*/
public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}
