package Recommendation;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;

public class Rating {

	
	public Long userid;
	public int itemid;
	public int rating;
	public int timestamp;
	
	
	public Rating(Long userid,int itemid,int rating,int timestamp)
	{
		this.userid = userid;
		this.itemid = itemid;
		this.rating = rating;
		this.timestamp = timestamp;
		
		
	}
	
	public int hashCode()  
	 {  
	    return Objects.hashCode(this.userid, this.itemid, this.rating, this.timestamp);  
	 }
	
	  public String toString()
	  {
	    return toStringHelper(this).addValue(userid)
	                               .addValue(itemid)
	                               .addValue(rating)
	                               .addValue(timestamp)
	                               .toString();
	  }
	
	
	
	
}
