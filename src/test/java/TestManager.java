import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {
    Manager manager;


    @Before
    public void before() {
        manager = new Manager("John \"The Hangman\" Ruth", "JD723942C", 35000.99, "Bounty");
    }

    @Test
    public void canGetName() {
        assertEquals("John \"The Hangman\" Ruth", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("JD723942C", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(35000.99, manager.getSalary(), 0);
    }

    @Test
    public void canGetDept() {
        assertEquals("Bounty", manager.getDeptName());
    }

    @Test
    public void canGetBonus() {
        assertEquals(350.00989999999996, manager.payBonus(), 0);
    }
    @Test
    public void canGetSalaryRaise() {
        assertEquals(35350.999899999995, manager.raiseSalary(), 0);
    }


}
