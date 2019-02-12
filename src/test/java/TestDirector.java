import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {
    Director director;


    @Before
    public void before() {
        director = new Director("Major Marquis Warren", "AB446688C", 50000.99, "Bounty",100000.01);
    }

    @Test
    public void canGetName() {
        assertEquals("Major Marquis Warren", director.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("AB446688C", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.99, director.getSalary(), 0);
    }

    @Test
    public void canGetDept() {
        assertEquals("Bounty", director.getDeptName());
    }

    @Test
    public void canGetBonus() {
        assertEquals(1000.0197999999999, director.payBonus(), 0);
    }
    @Test
    public void canGetSalaryRaise() {
        assertEquals(51001.0098, director.raiseSalary(), 0);
    }

    @Test
    public void canGetBudget() {
        assertEquals(100000.01, director.getBudget(), 0);
    }

    @Test
    public void message() {
        System.out.println("The Director: " + director.getName());
        System.out.println("Salary: £" + director.getSalary());
        System.out.println("---------------------------");

    }


}
