package gillesbogaert.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RecommendationService {
	
	private List<Recommendation> recommendations;
	
	
	public RecommendationService() {
		recommendations = new ArrayList<Recommendation>();
		init();
	}

	public Recommendation get(String name){
			
		for (Recommendation recommendation : recommendations) {
			
			if (recommendation.getMovie().equals(name)) {
				return recommendation;
			}
		}
		
		throw new IllegalArgumentException("No recommendation with that name found");
	}

	private void init() {
		
		
		Recommendation r1 = new Recommendation("Bob the builder", "If you love bob the builder you'll like other kids' movies like thomas the engine");
		recommendations.add(r1);
		r1 = new Recommendation("Silent Hill", "Another great horror movie is 'The Grudge'");
		recommendations.add(r1);
		
	}

	public List<Recommendation> getAll() {
		return this.recommendations;
	}

}
