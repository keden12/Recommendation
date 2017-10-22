package Recommendation;

import com.google.common.base.Objects;
import static com.google.common.base.MoreObjects.toStringHelper;


public class User {

	  public String fname;
	  public String lname;
	  public int age;
	  public String gender;
	  public String occupation;
	  public Long id;
	
	
	
	
	  public User(String fname, String lname, int age, String gender,String occupation , Long id)
	  {
	    this.fname= fname;
	    this.lname = lname;
	    this.age = age;
	    this.gender = gender;
	    this.occupation = occupation;
	    this.id = id;
	  }

	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.fname, this.lname, this.age, this.gender,this.occupation,this.id);  
	  }
	  
	
	  public String toString()
	  {
	    return toStringHelper(this).addValue(fname)
	                               .addValue(lname)
	                               .addValue(age)
	                               .addValue(gender)
	                               .addValue(occupation)
	                               .addValue(id)
	                               .toString();
	  }
	
	
	
	
	
	
	
}
