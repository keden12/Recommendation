package values;

import com.google.common.base.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;


public class Movie {

	static Long   counter = 0l;
	  public Long movieid;
	  public String title;
	  public String day;
	  public String month;
	  public String year;
	  public String url;
	  public int genre[] = new int[19];
	  
	
 public Movie(String title,String day,String month,String year,String url, int[] genre)
 {
	 this.movieid = counter++;
	 this.title = title;
	 this.day = day;
	 this.month = month;
	 this.year = year;
	 this.url = url;
	 this.genre = genre;
	  
 }
	
 public int hashCode()  
 {  
    return Objects.hashCode(this.title, this.day, this.month,this.year,this.url,this.genre);  
 }
	
 public String toString()
 {
   return toStringHelper(this).addValue(movieid)
                              .addValue(title)
                              .addValue(day)
                              .addValue(month)
                              .addValue(year)
                              .addValue(url)
                              .addValue(genre)
                              .toString();
 }	
 
 @Override
 public boolean equals(final Object obj)
 {
   if (obj instanceof Movie)
   {
     final Movie other = (Movie) obj;
     return  Objects.equal(title,  other.title)
         && Objects.equal(day,     other.day)
         && Objects.equal(month,  other.month)
         && Objects.equal(year,     other.year)
         && Objects.equal(url,     other.url)
         && Objects.equal(genre,     other.genre);

   }
   else
   {
     return false;
   }
 }
	
	
	
	
	
	
	
}
