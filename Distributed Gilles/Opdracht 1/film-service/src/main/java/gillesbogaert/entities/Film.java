package gillesbogaert.entities;

public class Film {

	
	private String title;
	private String rated;
	private String genre;
	
	
	public Film(String title, String rated, String genre){
		
		System.out.println("Creating new Film");
		
		setTitle(title);
		setRated(rated);
		setGenre(genre);
		
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getRated() {
		return rated;
	}


	public void setRated(String rated) {
		this.rated = rated;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}

}
