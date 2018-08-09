package gillesbogaert.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gillesbogaert.service.FilmDatabaseService;

@Configuration
public class Config {

	
	@Bean
	public FilmDatabaseService service() {
		return new FilmDatabaseService();
	}
	
	
}
