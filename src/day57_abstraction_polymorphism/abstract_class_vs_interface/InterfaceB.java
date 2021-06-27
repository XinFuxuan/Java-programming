package day57_abstraction_polymorphism.abstract_class_vs_interface;

/**
 * Interfaces can "extends" multiple other interfaces
 * When extends another interface child interface is not responsible to override any methods.
 * Concrete sub class will be responsible for overriding all abstract methods
 */

public interface InterfaceB extends InterfaceA{
}
