package day51_inheritnce;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer= new Employee();
        developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55) = " + Math.round(developer.calculateSalary(55)));
        double annualDevSalary= developer.calculateSalary(60);
        System.out.println(annualDevSalary);

        Contractor sdetContractor= new Contractor();
        sdetContractor.jobTitle= "SDET Contractor";
        double sdeSalary = sdetContractor.calculateSalary(65);
        System.out.println(sdeSalary);

        System.out.println(developer.toString());
        System.out.println(sdetContractor);



    }
}
