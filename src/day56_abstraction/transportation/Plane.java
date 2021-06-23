package day56_abstraction.transportation;

import day56_abstraction.greeting.Greeting;


public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void Hi() {
        System.out.println("welcome aboard ");

    }

    @Override
    public void Bye() {
        System.out.println("Thank you for flying with us");

    }

    @Override
    public void autoDrive() {
        System.out.println("Flying on auto Pilot mode ");

    }

    @Override
    public void transportPeople() {
        System.out.println("flying people from one city to another ");

    }

    @Override
    public void cost(int miles) {
        System.out.println("plane costs "+(miles * 12)+" to fly "+miles+" miles ");

    }

    public void land() {
    }
}
