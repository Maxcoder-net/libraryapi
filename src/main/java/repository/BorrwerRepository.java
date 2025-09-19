package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Borrower;




@Repository
public interface BorrwerRepository extends JpaRepository<Borrower, Long> {
	
	
	
	
	
	

}
