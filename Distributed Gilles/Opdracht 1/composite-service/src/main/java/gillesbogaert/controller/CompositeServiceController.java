package gillesbogaert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gillesbogaert.service.CompositeInfo;
import gillesbogaert.service.CompositeService;


@RestController
public class CompositeServiceController {
	
	@Autowired
	private CompositeService service;
	
	@RequestMapping("/movie/{movie}")
	public CompositeInfo getMovieInfo(@PathVariable("movie") String movie) {
		
		return service.getAllInfo(movie);
		
	}
	
	@RequestMapping("/recommendations")
	public String getAllRecommendations() {
		return service.getRecommendations();
	}
	
	
	@RequestMapping("/")
	public String getIndex() {
		return "Composite Service controller is active";
	}

}
