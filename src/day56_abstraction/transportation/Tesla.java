package day56_abstraction.transportation;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int miles) {
        System.out.println("Tesla costs "+(miles * 0.10)+" to drive "+miles+" miles ");

    }

    @Override
    public void autoDrive() {
        System.out.println("Tesla is driving on autoPilot mode ");

    }

    @Override
    public void Hi() {
        System.out.println("Welcome, input your destination ");
    }

    @Override
    public void Bye() {
        System.out.println("PLease charge me haha ");

    }
}
