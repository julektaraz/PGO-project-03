import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {
    private List<Goal> goals;

    public Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.goals = new ArrayList<>();
    }

    public void addGoals(Goal goal) {
        goals.add(goal);
    }

    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary();
        int currentMonth = getCurrentMonth();
        double bonus = goals.stream()
                .filter(g -> g.getMonth() == currentMonth)
                .mapToDouble(Goal::getAmount)
                .sum();
        return baseSalary + bonus;
    }

    private int getCurrentMonth() {
        return 4;
    }
}