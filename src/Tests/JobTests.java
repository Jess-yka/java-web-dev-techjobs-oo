package Tests;


import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class JobTests {
      Job test1 = new Job("Dog Walker", new Employer ("Pooches on the move"), new Location("St.Charles"),new PositionType("Walker"), new CoreCompetency("Dogs"));
      Job test2 = new Job("Dog Groomer", new Employer("Fluffy Pups"), new Location("St. Peters"), new PositionType("Bather"), new CoreCompetency("Dogs"));
      Job test3 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      Job test4 = new Job("Dog Groomer", new Employer("Fluffy Pups"), new Location("St. Peters"), new PositionType("Bather"), new CoreCompetency("Dogs"));




    @Test
    public void testSettingJobID(){
        //System.out.println(test1.getId() + " " + test2.getId());
        assertNotEquals(test1.getId(),test2.getId());
}

    @Test
    public void testJobConstructorSetsAllFields(){
       // System.out.println(test3);
        assertEquals(test3.getName(),"Product tester");
        assertEquals(test3.getEmployer().getValue(),"ACME");
        assertEquals(test3.getLocation().getValue(),"Desert");
        assertEquals(test3.getPositionType().getValue(), "Quality control");
        assertEquals(test3.getCoreCompetency().getValue(), "Persistence");

    }
    @Test
    public void testJobsForEquality(){
        System.out.println(test2.equals(test4));

    }

    @Test
    public void testToString(){
        assertEquals(test1.toString(),
                "Job{ID:__5__, "+
                "\n NAME:__Dog Walker__, "+
                "\n EMPLOYER:__ Pooches on the move__, "+
                "\n LOCATION:__St.Charles__, "+
                "\n Position Type:__Walker___, "+
                "\n Core Competency: ___Dogs__ "+
                        "\n}"
        );
    }
};


