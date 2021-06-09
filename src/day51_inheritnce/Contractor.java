package day51_inheritnce;

public class Contractor extends Employee {
    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    @Override
    public double calculateSalary(double hourlyRate){
        return hourlyRate*50*40;

    }


}
