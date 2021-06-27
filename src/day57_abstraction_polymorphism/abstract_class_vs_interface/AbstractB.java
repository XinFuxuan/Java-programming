package day57_abstraction_polymorphism.abstract_class_vs_interface;

/**
 * abstract class can extend one other abstract class or non abstract class. Also implements multiple interfaces
 */

public class AbstractB extends AbstractA implements InterfaceA, InterfaceB{
    @Override
    public void absMethodA() {

    }

    @Override
    public void absMethodD(int num) {

    }

    @Override
    public void defaultMethodF() {

    }
}
