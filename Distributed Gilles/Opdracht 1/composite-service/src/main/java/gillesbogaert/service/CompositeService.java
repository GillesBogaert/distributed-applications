package gillesbogaert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class CompositeService {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	public CompositeService() {
		
		System.out.println("Composite service has been created");
		
	}
	
	
	public CompositeInfo getAllInfo(String movie) {
		
		CompositeInfo comp = new CompositeInfo();
		
		// To get the Film data for a specific movie
		
		String url = String.format("http://film-service/film/getfilm/%s", movie);
		String response = this.restTemplate.getForObject(url, String.class);
		comp.setFilm(response);
		
		// To get the Review data for a specific movie
		
		url = String.format("http://review-service/review/movie/%s", movie);
		response = this.restTemplate.getForObject(url, String.class);
		comp.setReview(response);
		
		// To get the Recommendation data for a specific movie
		
		url = String.format("http://recommendation-service/recommendation/get/%s", movie);
		response = this.restTemplate.getForObject(url, String.class);
		comp.setRecommendation(response);
	
		
		return comp;
		
	}
	
	public String getRecommendations() {
		String json = this.restTemplate.getForObject("http://recommendation-service/recommendation/all", String.class);
		return json;
		
	}
	
	

}
