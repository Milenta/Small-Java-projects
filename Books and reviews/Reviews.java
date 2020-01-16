package mare;

public class Reviews {

	// state
	
	private int id;
	private String description;
	private int rating;
	
	// creation
	
	public Reviews (int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	
	// operations
	
	public String toString () {
		return String.format("Desription: %S, rating: %s.\r", description, rating);
	}
	
}
