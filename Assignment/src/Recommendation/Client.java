package Recommendation;

import java.io.File;


import utils.Serializer;
import utils.XMLSerializer;
import values.Movie;


public class Client {

	public static void main(String[] args) throws Exception {
       

	    File  datastore = new File("datastore2.xml");
	    Serializer serializer = new XMLSerializer(datastore);
	    
	    RecommendationAPI recommendation = new RecommendationAPI(serializer);
	    if (datastore.isFile())
	    {
	      recommendation.load();
	      
	    }
	    else
	    {
	    recommendation.InitialLoad();
	    }
	    
	    RecommendationAPI.addUser("Bartek", "Mrowicki",19 ," M", "Cathering Assistant" ,20003);
	    RecommendationAPI.addUser("Alanas", "Jakonis", 20, "M", "Bodybuilder", 24133);
	    RecommendationAPI.addUser("Bartek", "Mrowicki",19 ," M", "Cathering Assistant" ,20003);
	    RecommendationAPI.addMovie("I am Legend", "12/10/2009","http://www.imbd.com");

	    RecommendationAPI.store(); 
	    
	    Movie result = RecommendationAPI.getMovie(Long.valueOf(1));
	    Movie result1 = RecommendationAPI.getMoviesByTitle("I am Legend");
	    
	    System.out.println(result);
	    System.out.println(result1);
		
		
		
		
	}
}


