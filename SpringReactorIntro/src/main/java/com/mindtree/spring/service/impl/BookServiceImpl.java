package com.mindtree.spring.service.impl;

import org.springframework.stereotype.Service;

import com.mindtree.spring.pojo.Book;
import com.mindtree.spring.service.BookRepository;
import com.mindtree.spring.service.BookService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookServiceImpl implements BookService{
	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Mono<Book> findById(String id) {
		return bookRepository.findById(id);
	}

	@Override
	public Flux<Book> findAll() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookRepository.findAll();
	}

	@Override
	public Mono<Book> save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return bookRepository.deleteById(id);
	}
}
