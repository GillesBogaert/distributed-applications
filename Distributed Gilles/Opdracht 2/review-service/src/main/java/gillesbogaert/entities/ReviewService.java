package gillesbogaert.entities;

import java.util.ArrayList;
import java.util.List;


public class ReviewService {

	private List<Review> reviews;
	
	public ReviewService() {
		
		reviews = new ArrayList<Review>();
		init();
	}
	public List<Review> getAll() {
		
		return reviews;
	}
	
	public Review get(String movie) {
		
		for ( Review review : reviews) {
			if (review.getMovie().equals(movie)) {
				return review;
			}
		}
		
		throw new IllegalArgumentException("No review found for that movie");
		
	}

	
	public void init() {
		
		Review r1 = new Review("The Avengers", "Meh");
		reviews.add(r1);
		r1 = new Review("The Grudge", "Very scary");
		reviews.add(r1);
		r1 = new Review("Simpsons Movie", "Very funny");
		reviews.add(r1);
	
	}
	
}
