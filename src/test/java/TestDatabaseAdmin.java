import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {
    DatabaseAdmin databaseAdmin;


    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Daisy Domergue", "LL346790F", 25000.99);
    }

    @Test
    public void canGetName() {
        assertEquals("Daisy Domergue", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("LL346790F", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(25000.99, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(250.00990000000002, databaseAdmin.payBonus(), 0);
    }
    @Test
    public void canGetSalaryRaise() {
        assertEquals(25250.999900000003, databaseAdmin.raiseSalary(), 0);
    }


}
