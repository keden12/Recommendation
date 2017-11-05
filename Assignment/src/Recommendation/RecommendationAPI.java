package Recommendation;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




import com.google.common.base.Optional;

import utils.CSVLoader;
import utils.Serializer;
import values.Movie;
import values.Rating;
import values.User;







public class RecommendationAPI {
	
  private static Serializer serializer;
  private static Map<Long, User> users = new HashMap<>();
  private static Map<Long, Movie> movies = new HashMap<>();
  private static Map<Long, Rating> ratings = new HashMap<>();
  private static Map<String, Movie> movietitle = new HashMap<>();
  private static Map<String, Movie> moviedate = new HashMap<>();
  
  public RecommendationAPI()
  {
	  
  }
  
  @SuppressWarnings("static-access")
public RecommendationAPI(Serializer serializer)
  {
	 this.serializer = serializer; 
  }
  
  
  public static Movie addMovie(String title,String releasedate,String url)
  {
	  
	 Movie movie = new Movie(title,releasedate,url);
	 movies.put(movie.movieid, movie);
	 movietitle.put(title,movie);
	 moviedate.put(releasedate,movie);
	 return movie;
	
  }
  
  public static Rating addRating(Long userid,Long itemid,int rating,int timestamp)
  {
	    Rating ratingsure = null;
	    Optional<User> user = Optional.fromNullable(users.get(userid));
	    if (user.isPresent())
	    {
	     ratingsure = new Rating (userid,itemid,rating,timestamp);
	      user.get().ratingsUser.put(ratingsure.userid, ratingsure);
	      ratings.put(ratingsure.userid, ratingsure);
	    }
	    return ratingsure;
	  }
  
  

  public static User addUser(String firstName, String lastName, int age, String gender,String occupation,int zip) 
  {
    User user = new User (firstName, lastName, age, gender,occupation,zip);
    users.put(user.id, user);
    return user;
  }
  
  
  public static void removeUser(Long id) 
  {
	   users.remove(id);
	  
	  
  }

  public static Movie getMovie(Long movieid) 
  {
    return movies.get(movieid);
  }
  
  public static Rating getUserRatings(Long userid) 
  {
    return ratings.get(userid);
  }

  public static Movie getMoviesByTitle(String title)
  {
	  
	  return movietitle.get(title);
 
  }
  public Collection<User> getUsers ()
  {
    return users.values();
  }
  
  
  
  public static Movie getMoviesByDate(String date)
  {
	  
	  return moviedate.get(date);
 
  }
  
  
  

@SuppressWarnings("unchecked")
public void load() throws Exception
{
	
	serializer.read();
	users = (Map<Long, User>) serializer.pop();
	movies  = (Map<Long, Movie>) serializer.pop();
	ratings = (Map<Long, Rating>) serializer.pop();
    User.counter = (Long)serializer.pop();
    Movie.counter = (Long)serializer.pop();

}



static void store() throws Exception
{
	serializer.push(User.counter);
	serializer.push(Movie.counter);
	serializer.push(users);
	serializer.push(movies);
	serializer.push(ratings);
	serializer.write();

}

public void InitialLoad() throws Exception
{
CSVLoader loader = new CSVLoader();
List <User> usersdata = loader.loadUsers("moviedata_small/users5.dat");
for(User user: usersdata)
{
users.put(user.id,user);
}
List <Movie> moviedata = loader.loadMovies("moviedata_small/items5.dat");
for(Movie movie:  moviedata )
{
movies.put(movie.movieid, movie);
}
List <Rating> ratingdata = loader.loadRatings("moviedata_small/ratings5.dat");
for(Rating rating:  ratingdata )
{
ratings.put(rating.userid, rating);
}
 }





}
