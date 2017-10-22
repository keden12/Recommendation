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






public class RecommendationAPI {

  private Map<Long, User> users = new HashMap<>();



  public User createUser(String firstName, String lastName, int age, String gender,String occupation,long id) 
  {
    User user = new User (firstName, lastName, age, gender,occupation,id);
    users.put(id, user);
    return user;
  }
  
  
  public void deleteUser(Long id) 
  {
    users.remove(id);
  }


public String[] load() throws IOException
{
	
	
	String delims = "[|]";

	Scanner user = new Scanner(new File("./moviedata_small/users5.dat"));
	String userDetails = user.nextLine();
	// parse user details string
	String[] userData = userDetails.split(delims);
	user.close();
	
	Scanner ratings = new Scanner(new File("./moviedata_small/ratings5.dat"));
	String ratingDetails = user.nextLine();
	String[] ratingData = ratingDetails.split(delims);
	ratings.close();
	
	Scanner movies = new Scanner(new File("./moviedata_small/items5.dat"));
	String moviesDetails = movies.nextLine();
	String[] moviesData= moviesDetails.split(delims);
	movies.close();
	
	Scanner genre = new Scanner(new File("./moviedata_small/genre.dat"));
	String genreDetails = genre.nextLine();
	String[] genreData= genreDetails.split(delims);
	genre.close();
	
	
	
	
	return userData;

}




}
