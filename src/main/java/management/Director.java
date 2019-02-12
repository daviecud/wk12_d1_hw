package management;

public class Director extends management.Manager {

    private double budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus() {
        double calculateBonus = getSalary() / 100;
        double bonus = calculateBonus * 2;
        return bonus;
    }

}
