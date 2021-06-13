package day53_inheritance.tesla;

public class Roadster extends ElectricCar{
    public Roadster(String make, String model, double price, int year, int range) {
        super("Tesla", "Roadster", price, year, range);
        System.out.println("welcome to roadster");
    }
    //two options to fix this error
       // 1 got to parent class and add mno args constructor
       // 2 go to child class and call the matching super
}
