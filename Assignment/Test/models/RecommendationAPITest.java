package models;


import static models.Fixtures.users;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import values.User;
import Recommendation.RecommendationAPI;

public class RecommendationAPITest
{
  private RecommendationAPI recommendation;

@SuppressWarnings("static-access")
@Before
  public void setup()
  {
    recommendation = new RecommendationAPI();
    for (User user : users)
    {
      recommendation.addUser(user.fname, user.lname, user.age, user.gender,user.occupation,user.zip);
    }
  }

  @After
  public void tearDown()
  {
    recommendation = null;
  }

@SuppressWarnings("static-access")
@Test
public void testUser()
  {
	recommendation.addUser("Bartek", "Mrowicki",19 ," M", "Cathering Assistant" ,20003);
    recommendation.removeUser(Long.valueOf(3));
  }  






}
  
