package mare;

public class BookRunner {

	public static void main(String[] args) {
		
		Book book = new Book(1, "Object orijented programing with Java", "Mare");
		book.addReview(new Reviews(1, "Very good.", 5));
		book.addReview(new Reviews(2, "Not so good.", 2));
		System.out.println(book);				

	}

}
