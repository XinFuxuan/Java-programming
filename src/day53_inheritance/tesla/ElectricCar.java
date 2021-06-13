package day53_inheritance.tesla;

public class ElectricCar {
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    public static int count; // all objects will share this variable.
    public final static int MAX_RANGE= 400;


    public ElectricCar(String make, String model, double price, int year, int range) {

        setMake(make); // this.make = make; they are the same useful when setter has soe condition
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++;
    }
    public final void charge(){
        System.out.println("charging the electric car using the plug in ");
        range = MAX_RANGE;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    public static int getCount(){
        return count;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    protected void driver(int miles){
        this. range = range;

        if(range == 0 || range - miles <0){
            System.out.println("Error: Cannot drive that far, need to charge");
        }else{
            range -= miles;
            System.out.println("The current distance covered= "+ miles);
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(!make.isEmpty()){
            System.out.println("error make connot be blank");
        }else{
            this.make = make;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
