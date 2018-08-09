package gillesbogaert.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gillesbogaert.entities.ReviewService;

@Configuration
public class Config{
	
	
	@Bean
	public ReviewService service() {
		return new ReviewService();	
	}
}