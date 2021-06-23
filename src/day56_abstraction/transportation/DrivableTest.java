package day56_abstraction.transportation;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
                model3.Hi();
                model3.start();
        model3.cost(25);
        model3.stop();

        Plane plane = new Plane();

        plane.start();
        plane.land();

        SelfDrivable sd = new Plane(); // ---> polymorphism
        SelfDrivable sd2 = new Tesla();


    }
}
