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

    public double raiseSalary() {
        double salaryRaise = getSalary() + payBonus();
        return salaryRaise;
    }

    public double payBonus() {
        double calculateBonus = getSalary() / 100;
        double bonus = calculateBonus * 1;
        return bonus;
    }

}
