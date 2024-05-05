import java.util.ArrayList;
import java.util.List;

class Tester extends Employee {
    private List<String> testTypes;

    public Tester(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary();
        double testTypeBonus = testTypes.size() * 300;
        return baseSalary + testTypeBonus;
    }
}