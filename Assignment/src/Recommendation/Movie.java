package Recommendation;

import com.google.common.base.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;


public class Movie {

	
	  public int movieid;
	  public String title;
	  public String releasedate;
	  public String url;
	  public int genre[] = new int[19];
	  
	
 public Movie(int movieid,String title,String releasedate,String url, int[] genre)
 {
	 this.movieid = movieid;
	 this.title = title;
	 this.releasedate = releasedate;
	 this.url = url;
	 this.genre = genre;
	  
 }
	
 public int hashCode()  
 {  
    return Objects.hashCode(this.movieid, this.title, this.releasedate, this.url,this.genre);  
 }
	
 public String toString()
 {
   return toStringHelper(this).addValue(movieid)
                              .addValue(title)
                              .addValue(releasedate)
                              .addValue(url)
                              .addValue(genre)
                              .toString();
 }	
	
	
	
	
	
	
	
}
