package service;

import org.springframework.beans.factory.annotation.Autowired;

import model.Borrower;
import repository.BorrwerRepository;

public class BorrowerService {
	
	
	@Autowired
	private BorrwerRepository borrowrepos;
	
	
	
	public Borrower createorUpdate(Borrower borrower)
	{
		return borrowrepos.save(borrower);
		
		
	}
	
	
	

}