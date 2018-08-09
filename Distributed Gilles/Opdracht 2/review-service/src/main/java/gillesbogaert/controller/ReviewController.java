package gillesbogaert.controller;

import org.springframework.web.bind.annotation.RestController;

import gillesbogaert.entities.ReviewService;
import gillesbogaert.entities.Review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

	
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private ReviewService service;
	
	@RequestMapping("/review/all")
	public List<Review> getAll(){
		return service.getAll();
	}
	
	@RequestMapping("/review/movie/{movie}")
	public Review getMovieReview(@PathVariable String movie) {
		return this.service.get(movie);
	}
	
	
}
