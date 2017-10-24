package Recommendation;

import java.io.File;

import utils.Serializer;
import utils.XMLSerializer;



public class Client {

	public static void main(String[] args) throws Exception {
       
	    File  datastore = new File("datastore3.xml");
	    Serializer serializer = new XMLSerializer(datastore);
	    
	    RecommendationAPI recommendation = new RecommendationAPI(serializer);
	    if (datastore.isFile())
	    {
	      recommendation.load();
	    }
		
		
		
		
		
	}
}


