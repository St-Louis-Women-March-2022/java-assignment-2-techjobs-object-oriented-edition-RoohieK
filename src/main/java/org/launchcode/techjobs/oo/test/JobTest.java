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

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job jobSix = new Job("",new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String str = jobSix.toString();
        char zeroChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        assertEquals('\n', zeroChar);
        assertEquals('\n', lastChar);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job jobSeven = new Job("Junior Data Analyst" ,new Employer("Lockerdome"), new Location("Saint Louis"), new PositionType("Data Scientist / Business Intelligence"), new CoreCompetency("Statistical Analysis"));
        String str = jobSeven.toString();
        assertEquals(str,"\nID: " + jobSeven.getId() + "\nName: " + jobSeven.getName() +"\nEmployer: " + jobSeven.getEmployer() +"\nLocation: " + jobSeven.getLocation() + "\nPosition Type: "+ jobSeven.getPositionType() + "\nCore Competency: " + jobSeven.getCoreCompetency() +"\n" );
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job jobEight = new Job("" , new Employer(""), new Location("Saint Louis"), new PositionType("Data Scientist / Business Intelligence"), new CoreCompetency("Statistical Analysis"));
        String str = jobEight.toString();
        assertEquals("\nID: " + jobEight.getId() + "\nName: " + "Data not available"  +"\nEmployer: " + "Data not available" +"\nLocation: " + jobEight.getLocation() + "\nPosition Type: "+ jobEight.getPositionType() + "\nCore Competency: " + jobEight.getCoreCompetency() +"\n", str );
        //assertTrue(str.equals("OOPS! This job does not seem to exist."));
    }

    @Test
    public void testAllEmptyFields(){
        Job jobEight = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String str = jobEight.toString();
        assertEquals(str,"\n OOPS! This job does not seem to exist. \n");

    }
}
