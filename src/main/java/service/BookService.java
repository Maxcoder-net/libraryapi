package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.Book;
import repository.BookRepository;

public class BookService {

	
	
	@Autowired
	private BookRepository bookrepos;
	
	
	public List<Book> getAllBooks() {
        return bookrepos.findAll();
        
        
    }
	
	
	 public Book createOrUpdateBook(Book book) {
	        return bookrepos.save(book);
	    }
	
	
}
