package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity
public class Book {

	
	Book(){};
	
	
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
