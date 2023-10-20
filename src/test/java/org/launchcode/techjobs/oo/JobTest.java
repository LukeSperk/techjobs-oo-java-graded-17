package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals("Two jobs created with the empty constructor should not be equal", jobOne,jobTwo);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job fieldsJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(fieldsJob.getName() instanceof String);
        assertEquals(fieldsJob.getName(), "Product tester");
        assertTrue(fieldsJob.getEmployer() instanceof Employer);
        assertEquals(fieldsJob.getEmployer().getValue(), "ACME");
        assertTrue(fieldsJob.getLocation() instanceof Location);
        assertEquals(fieldsJob.getLocation().getValue(), "Desert");
        assertTrue(fieldsJob.getPositionType() instanceof PositionType);
        assertEquals(fieldsJob.getPositionType().getValue(), "Quality control");
        assertTrue(fieldsJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(fieldsJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse("Two jobs created with identical field valuse should not be equal", jobOne.equals(jobTwo));
    }
}
