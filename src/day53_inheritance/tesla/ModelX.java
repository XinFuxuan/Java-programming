package day53_inheritance.tesla;

public class ModelX extends ElectricCar {
    public ModelX(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);

    }
    // public void charge(){    error below, charge is final method, connot be overriden

}
