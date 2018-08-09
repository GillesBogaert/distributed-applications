package gillesbogaert.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import gillesbogaert.entities.*;

public class FilmDataRequestService {

	private String apikey = "7d9ecbb1";
	
	public Film getFilm(String id){
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(
				"http://www.omdbapi.com/?s={id}&apikey=7d9ecbb1", String.class, id);
		
		Film film = new Gson().fromJson(response.getBody(), Film.class);
		
		return film;
		
	}
	
}
