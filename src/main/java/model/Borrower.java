package model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "BORROWER")
public class Borrower {
	
	
	Borrower(){};
	
	
	@Id
	private int UID;
	
	
	@Column(name ="NAME")
	private String NAME;
	
	
	@Column(name ="EMAIL")
	private String EMAIL;

	public int getIdborrower() {
		return getIdborrower();
	}

	public void setIdborrower(int idborrower) {
		this.UID = idborrower;
	}

	public String getName() {
		return NAME;
	}

	public void setName(String name) {
		this.NAME = name;
	}

	public String getEmail() {
		return EMAIL;
	}

	@Override
	public int hashCode() {
		return Objects.hash(EMAIL, UID, NAME);
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
		return Objects.equals(EMAIL, other.EMAIL) && UID == other.UID && Objects.equals(NAME, other.NAME);
	}

	public void setEmail(String email) {
		this.EMAIL = email;
	}
	
	
	

}
