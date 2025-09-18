package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "Borrower")
public class Borrower {
	
	
	Borrower(){};
	
	
	@Id
	private int idborrower;
	
	private String name;
	
	private String email;

	public int getIdborrower() {
		return idborrower;
	}

	public void setIdborrower(int idborrower) {
		this.idborrower = idborrower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
