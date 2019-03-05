package com.mindtree.spring.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
@Document annotation, which identifies it as a MongoDB document. 
@Data is Lombok method for Generates getters and setters for all fields; 
setters are only generated for non-final properties and other activities.
In order to work with Spring Data, we need a no-argument constructor so added @NoArgsConstructor 
For testing purposes also added an all-argument constructor, @AllArgsConstructor.
*/
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
		private String id;
	    private String title;
	    private String author;
	
}
