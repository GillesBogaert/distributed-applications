package gillesbogaert.entities;

public class Review {

	
	private String movie;
	private String review;
	
	
	public Review(String movie, String review) {
		
		this.setMovie(movie);
		this.setReview(review);
		
	}


	public String getMovie() {
		return movie;
	}


	public void setMovie(String movie) {
		this.movie = movie;
	}


	public String getReview() {
		return review;
	}


	public void setReview(String review) {
		this.review = review;
	}
	
	
}
