package gillesbogaert;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import gillesbogaert.entities.RecommendationService;

@EnableDiscoveryClient
@SpringBootApplication
public class RecommendationServiceApp {
	
	
	public static void main(String[] args) {
        SpringApplication.run(RecommendationServiceApp.class, args);
    }

}
