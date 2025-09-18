package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Book;
import model.Borrower;

public interface BookRepository extends JpaRepository<Book, Long> { 
	
	

}
