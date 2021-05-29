package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver=new Driver("Fu");
        bus.engine=new Engine(10);
        System.out.println(bus.toString());

        Bus metroBus=new Bus();
        metroBus.driver = new Driver("Chantal");
        metroBus.engine = new Engine(15);
        System.out.println(metroBus.toString());

        System.out.println(metroBus.driver.getName());


    }
}
