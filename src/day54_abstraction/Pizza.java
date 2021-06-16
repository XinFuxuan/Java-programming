package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("dope add sauce ");

    }

    @Override
    public void serve() {
        System.out.println("in a box ");

    }
}

