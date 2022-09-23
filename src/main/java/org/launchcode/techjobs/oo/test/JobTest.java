package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
   // Job jobOne;
    // Job jobTwo;
    @Before
    public void JobTest(){
    }

    @Test
    public void testSettingJobId(){
       Job jobOne = new Job();
       Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(),jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){

        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobThree instanceof Job);
        assertEquals(jobThree.getName(),"Product tester");
        assertTrue(jobThree.getEmployer() instanceof Employer);
        assertEquals(jobThree.getEmployer().getValue(),"ACME");
        assertTrue(jobThree.getLocation() instanceof Location);
        assertEquals(jobThree.getLocation().getValue(),"Desert");
        assertTrue(jobThree.getPositionType() instanceof PositionType );
        assertEquals(jobThree.getPositionType().getValue(), "Quality control");
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(jobThree.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobFive = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobFour.getId()==jobFive.getId());
    }
}
