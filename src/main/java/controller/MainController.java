package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Book;
import model.Borrower;
import repository.BookRepository;
import repository.BorrwerRepository;

@RestController
@RequestMapping("/api")
public class MainController {

	
	private List<Book> listbook = new ArrayList<>();
	
	@Autowired
	BorrwerRepository borrowrepos;
	
	@Autowired
	BookRepository bookreps;
	
	
	@GetMapping( "/booksall")
	ResponseEntity<Book> getbooks()	
	{
		
		return (ResponseEntity<Book>) listbook;
		
	}
	
	
	
	
	
	@PostMapping("/registerborrower")
	Borrower newborrower(@RequestBody Borrower newborrower)
	{
		
		return borrowrepos.save(newborrower);
		
	}
	
	
	@PostMapping("/crbook")
    public Book createBook(@RequestBody Book book) {
		
        return bookreps.save(book);
    }
	
	
}
