package values;

import com.google.common.base.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;


public class Movie {

	public static Long   counter = 0l;
	  public Long movieid;
	  public String title;
	  public String releasedate;
	  public String url;
	  
	
 public Movie(String title,String releasedate, String url)
 {
	 this.movieid = counter++;
	 this.title = title;
	 this.releasedate = releasedate;
	 this.url = url;
	  
 }
	
 public int hashCode()  
 {  
    return Objects.hashCode(this.title, this.releasedate,this.url);  
 }
	
 public String toString()
 {
   return toStringHelper(this).addValue(movieid)
                              .addValue(title)
                              .addValue(releasedate)
                              .addValue(url)
                              .toString();
 }	
 
 @Override
 public boolean equals(final Object obj)
 {
   if (obj instanceof Movie)
   {
     final Movie other = (Movie) obj;
     return  Objects.equal(title,  other.title)
    	 && Objects.equal(releasedate,     other.releasedate)
         && Objects.equal(url,     other.url);

   }
   else
   {
     return false;
   }
 }
	
	
	
	
	
	
	
}
