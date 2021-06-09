package day51_inheritnce;

public class Employee {
    String jobTitle;

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public double calculateSalary(double hourlyRate){
        return 52*40*hourlyRate*1.1;

    }
}
