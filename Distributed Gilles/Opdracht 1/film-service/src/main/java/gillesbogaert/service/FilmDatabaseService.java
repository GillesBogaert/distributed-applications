package gillesbogaert.service;

import gillesbogaert.entities.*;

import java.util.HashMap;
import java.util.Map;

public class FilmDatabaseService {
	
	private FilmDataRequestService dataRequest;
	private Map<String, Film> database;
	
	public FilmDatabaseService(){
		dataRequest = new FilmDataRequestService();
		database = new HashMap<>();
		
		Film film = dataRequest.getFilm("tt1285016");
		database.put(film.getTitle(), film);
		film = dataRequest.getFilm("tt0111161");
		database.put(film.getTitle(), film);
		film = dataRequest.getFilm("tt0068646");
		database.put(film.getTitle(), film);
		
	}
	
	public Film searchFilm(String film){
	
		return dataRequest.getFilm(film);
	
	}
	
	public void addFilm(String film){
		Film data = dataRequest.getFilm(film);
		database.put(data.getTitle(), data);
	}

	public Film getFilm(String film) {
		
		return database.get(film);
	}

}
