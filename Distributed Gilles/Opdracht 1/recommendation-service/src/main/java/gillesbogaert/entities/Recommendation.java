package gillesbogaert.entities;

public class Recommendation {
	
	private String movie;
	private String recommendation;
	
	
	public Recommendation(String movie, String recommendation) {
		
		this.setMovie(movie);
		this.setRecommendation(recommendation);
		
	}
	
	
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

}
