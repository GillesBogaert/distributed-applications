package gillesbogaert.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gillesbogaert.entities.RecommendationService;

@Configuration
public class Config{
	
	
	@Bean
	public RecommendationService service() {
		return new RecommendationService();	
	}
}