package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        //AbstractA absA = new AbstractA(); --> error, abstract class cannot create object
        //InterfaceA iA = new InterfaceA(); --> error, interface class cannot create object

        InterfaceA.staticMethodE("woodenSpoon");
       // ConcreteA.staticMethodE("hello"); child cannot use static method from the parent


    }
}
