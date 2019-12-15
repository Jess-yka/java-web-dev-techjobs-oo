package Tests;


import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTests {
      Job test1 = new Job("Dog Walker", new Employer ("Pooches on the move"), new Location("St. Charles"),new PositionType("Walker"), new CoreCompetency("Dogs"));
      Job test2 = new Job("Dog Groomer", new Employer("Fluffy Pups"), new Location("St. Peters"), new PositionType("Bather"), new CoreCompetency("Dogs"));




@Test
public void testSettingJobID(){


    assertNotEquals(test1.getId(),test2.getId());
}



}


