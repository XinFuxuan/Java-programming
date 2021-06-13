package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1= new ElectricCar("Tesla","Y",48190,2021,326);
        ec1.driver(50);
        System.out.println(ec1.toString());
        System.out.println("ec1 make = "+ec1.getMake());
        System.out.println("ec1 model = "+ec1.getModel());
        System.out.println("ec1 price= " + ec1.getPrice());
        System.out.println("ec1 range = " + ec1.getRange());

        if(ec1.getPrice()>10000){
            System.out.println(ec1.getMake()+ec1.getModel()+" is out of my budget");
        }else{
            System.out.println("purchasing"+ec1.toString());
        }

        ElectricCar ec2= new ElectricCar("Tesla","Cybertruck",799000,2022, 300);
        System.out.println(ec2.toString());
        System.out.println(ec2.getCount()); // call static method using object
        System.out.println(ElectricCar.getCount()); // call static method using className


        Roadster raodster= new Roadster("Tesla", "Roadster", 79000, 2022, 620);
        System.out.println(raodster.toString());
        raodster.driver(1000);
        raodster.driver(600);
        System.out.println(raodster.getCount());
    }




}
