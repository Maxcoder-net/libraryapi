package model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "BORROWER")
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

	@Override
	public int hashCode() {
		return Objects.hash(email, idborrower, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Borrower other = (Borrower) obj;
		return Objects.equals(email, other.email) && idborrower == other.idborrower && Objects.equals(name, other.name);
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
