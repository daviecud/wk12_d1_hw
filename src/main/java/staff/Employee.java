package staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public boolean checkRaiseSalaryEntry() {
        if (payBonus() >= 0) {
            return true;
        }
        return false;
    }

    public double raiseSalary() {
        double salaryRaise = getSalary() + payBonus();
        if (checkRaiseSalaryEntry() && salaryRaise >= 0) {
            return salaryRaise;
        } else {
            String message = "You have entered a negative value!!! ";
        }
        return getSalary();
    }

    public double payBonus() {
        double calculateBonus = getSalary() / 100;
        return calculateBonus;
    }



}
