package Recommendation;


import java.util.HashMap;
import java.util.Map;

import utils.Serializer;
import values.Movie;
import values.Rating;
import values.User;







public class RecommendationAPI {
	
  private Serializer serializer;
  private Map<Long, User> users = new HashMap<>();
  private Map<Long, Movie> movies = new HashMap<>();
  private Map<Long, Rating> ratings = new HashMap<>();
  private Map<String, Movie> movietitle = new HashMap<>();
  
  public RecommendationAPI()
  {
	  
  }
  
  public RecommendationAPI(Serializer serializer)
  {
	 this.serializer = serializer; 
  }
  
  
  public Movie addMovie(String title,String day,String month,String year,String url, int[] genre)
  {
	  
	 Movie movie = new Movie(title,day,month,year,url,genre);
	 movies.put(movie.movieid, movie);
	 movietitle.put(title,movie);
	 return movie;
	  
  }
  
  public Rating addRating(Long userid,int itemid,int rating,int timestamp)
  {
	  
	 Rating rate = new Rating(userid,itemid,rating,timestamp);
	 ratings.put(userid, rate);
	 return rate;
  }
  

  public User addUser(String firstName, String lastName, int age, String gender,String occupation,int zip) 
  {
    User user = new User (firstName, lastName, age, gender,occupation,zip);
    users.put(user.id, user);
    return user;
  }
  
  
  public void removeUser(Long id) 
  {
	   users.remove(id);
	  
	  
  }

  public Movie getMovie(Long movieid) 
  {
    return movies.get(movieid);
  }
  
  public Rating getUserRatings(Long userid) 
  {
    return ratings.get(userid);
  }

  public Movie getMoviesByTitle(String title)
  {
	  
	  return movietitle.get(title);
 
  }
  public Movie getMoviesByYear(String title)
  {
	  
	  return movietitle.get(title);
 
  }
  
  
  

@SuppressWarnings("unchecked")
public void load() throws Exception
{
	
	serializer.read();
	users = (Map<Long, User>) serializer.pop();
	movies  = (Map<Long, Movie>) serializer.pop();
	ratings = (Map<Long, Rating>) serializer.pop();

}

void store() throws Exception
{
	serializer.push(users);
	serializer.push(movies);
	serializer.push(ratings);
	serializer.write();

}






}
