package model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name ="Book")
@Entity
public class Book {

	
	@Override
	public int hashCode() {
		return Objects.hash(Id, Title, author, isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Id == other.Id && Objects.equals(Title, other.Title) && Objects.equals(author, other.author)
				&& Objects.equals(isbn, other.isbn);
	}

	public Book(){};
	
	
	private String Title;
	
	private int Id;
	
	private String author;
	
	private String isbn;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
	
	
}
