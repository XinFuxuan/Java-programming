package day57_abstraction_polymorphism.abstract_class_vs_interface;

/**child of abstract or interface class is call concrete (extending class)
 * can extend one abstract class and implements multiple interface
 *
 * FIRST non-abstract child class of abstract class or interface - is called concrete class
 *
 */

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {
    @Override
    public void absMethodA() { //Concrete subclass must override abstract methods from abstract class or interface

    }
    @Override
    public void methodB(){ // Sub class can override non-final methods from parent class
        System.out.println("methodB version 2 is called ");
    }

    //@Override --> static methods are hidden
    public static void staticMethodC(){ //static methods are hidden - not overridden
        System.out.println("Static MethodC hidden version is called ");

    }

    @Override
    public void absMethodD(int num) {

    }
}
