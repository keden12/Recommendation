package Recommendation;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileReader;
import java.io.FileReader;
import java.io.FileReader;

import models.User;






public class RecommendationAPI {

  private Map<Long, User> users = new HashMap<>();
  private Map<Long, Movie> movies = new HashMap<>();
  private Map<Long, Rating> ratings = new HashMap<>();

  
  
  public Movie addMovie(Long movieid,String title,String releasedate,String url, int[] genre)
  {
	  
	 Movie movie = new Movie(movieid,title,releasedate,url,genre);
	 movies.put(movieid, movie);
	 return movie;
	  
  }
  
  public Rating addRating(Long userid,int itemid,int rating,int timestamp)
  {
	  
	 Rating rate = new Rating(userid,itemid,rating,timestamp);
	 ratings.put(userid, rate);
	 return rate;
  }
  

  public User addUser(Long id,String firstName, String lastName, int age, String gender,String occupation,int zip) 
  {
    User user = new User (id,firstName, lastName, age, gender,occupation,zip);
    users.put(id, user);
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
	  
	  
	  
	  
  }
  
  
  
  
  
public void load() throws IOException
{
	
	serializer
	.read();
	activitiesIndex
	 = (Map<Long, Activity>) 
	serializer
	.pop();
	emailIndex
	      = (Map<String, User>)   
	serializer
	.pop();
	userIndex
	       = (Map<Long, User>)     
	serializer
	.pop();

}




}
