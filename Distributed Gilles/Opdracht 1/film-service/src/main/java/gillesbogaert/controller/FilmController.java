package gillesbogaert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gillesbogaert.entities.Film;
import gillesbogaert.service.FilmDataRequestService;
import gillesbogaert.service.FilmDatabaseService;

@RestController
public class FilmController {
	
	
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private FilmDatabaseService service;
	
	
	@RequestMapping("/")
	public String isActive() {
		return "Is now active";
	}
	
	@RequestMapping("/film/getfilm/{film}")
	public Film getFilm(@PathVariable String film) {
		return this.service.getFilm(film);
	}

}
