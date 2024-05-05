import java.util.ArrayList;
import java.util.List;

class Employee {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String pesel;
    private int yearOfEmployment;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }

    public double calculateSalary() {
        int baseSalary = 3000;
        int salaryIncreasePerYear = 1000;
        int yearsWorked = Math.max(0, getCurrentYear() - yearOfEmployment);
        return baseSalary + (yearsWorked * salaryIncreasePerYear);
    }

    private int getCurrentYear() {
        return 2024;
    }
}