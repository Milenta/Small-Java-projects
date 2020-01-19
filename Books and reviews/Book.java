package mare;

import java.util.ArrayList;

public class Book {

	// state 
	private int id;
	private String name;
	private String author;
	private ArrayList<Reviews> reviews = new ArrayList<>();
	
	// creation
	public Book (int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	// operations
	
	public void addReview(Reviews review) {
		this.reviews.add(review);
	}
	
	public String toString() {
		return String.format("Id of the book is %d, name of book is %s, name of author is %s.\r"
				+ "Reviews: %s", id, name, author, reviews);
	}
	
}
