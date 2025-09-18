package com.library.libv;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

import model.Book;
import repository.BookRepository;






@SuppressWarnings("unused")
@DataJpaTest
public class BookTest {

	@Autowired
	private BookRepository bookrpo;
	
	@Test
	 public void testExistsById() {
	        Book book = new Book();
	        
	        book = bookrpo.save(book);
	        boolean exists = bookrpo.findById(book.getId());
	        
	        assertThat(exists).isTrue();
	        
	        
}
	
}
