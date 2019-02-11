import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {
    Developer developer;


    @Before
    public void before() {
        developer = new Developer("Oswaldo Mobray", "CD124578G", 30000.99);
    }

    @Test
    public void canGetName() {
        assertEquals("Oswaldo Mobray", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("CD124578G", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.99, developer.getSalary(), 0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(300.0099, developer.payBonus(), 0);
    }
    @Test
    public void canGetSalaryRaise() {
        assertEquals(30300.999900000003, developer.raiseSalary(), 0);
    }


}
