package gillesbogaert.controller;

import gillesbogaert.entities.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gillesbogaert.entities.RecommendationService;

@RestController
public class RecommendationController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private RecommendationService service;
	
	
	@RequestMapping("/recommendation/get/{name}")
	public Recommendation getRecommendation(@PathVariable String name){
		return this.service.get(name);
	}
	
	@RequestMapping("/recommendation/all")
	public List<Recommendation> getAll(){
		return this.service.getAll();
	}
	

}
