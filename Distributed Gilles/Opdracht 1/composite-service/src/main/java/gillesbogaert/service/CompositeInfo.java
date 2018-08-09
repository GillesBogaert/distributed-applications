package gillesbogaert.service;

public class CompositeInfo {

	private String review;
	private String film;
	private String recommendation;
	
	
	public CompositeInfo() {
		
		System.out.println("Composite Info has been created");
		
	}


	public String getReview() {
		return review;
	}


	public void setReview(String review) {
		this.review = review;
	}


	public String getFilm() {
		return film;
	}


	public void setFilm(String film) {
		this.film = film;
	}


	public String getRecommendation() {
		return recommendation;
	}


	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	
	
	
}
