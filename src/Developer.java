import java.util.ArrayList;
import java.util.List;

class Developer extends Employee {
    private List<Technology> knownTechnologies;

    public Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.knownTechnologies = new ArrayList<>();
    }

    public void addTechnology(Technology technology) {
        knownTechnologies.add(technology);
    }

    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary();
        double technologyBonus = knownTechnologies.stream().mapToDouble(Technology::getBonus).sum();
        return baseSalary + technologyBonus;
    }
}