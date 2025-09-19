package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Borrower;
import repository.BorrwerRepository;




@Service
public class BorrowerService {
	
	
	@Autowired
	private BorrwerRepository borrowrepos;
	
	
	
	public Borrower createorUpdate(Borrower borrower)
	{
		return borrowrepos.save(borrower);
		
		
	}
	
	
	

}