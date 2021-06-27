package day57_abstraction_polymorphism.abstract_class_vs_interface;

/**both abstract class and interface are used to achieve abstraction in java
 * both abstract class and interface cannot creat object(instantiate)
 *
 * Marker Interface --> Interfaces without any methods or variables. Using for polymorphism, or to mark the class as
 * capable of whatever interface claims.
 *
 * Before java 8 interface was pure abstraction only abstract methods were allowed.
 * public abstract automatically added, so it is optional to add it
 *
 * Interface can only have PUBLIC STATIC FINAL variables, has to assign value right away
 * Interfaces all methods has be public
 * Interfaces cannot have constructors
 * Interfaces can extends muliple other interfaces
 */
public interface InterfaceA { // everything in interface is assumed to be abstract
    public abstract void absMethodD(int num); // public abstract automatically added, so it is optional to add it
                                              // void absMethodD(int num);

    public static final String TYPE = "interface";
    double MAX_COUNT= 500; // automatically final public static final

    /**
     * Starting from java 8(jdk 1.8)
     * interface can have static and default methods
     * @param str
     */
    public static void staticMethodE(String str){ //static methods can be called without creating an object
        System.out.println("static method E is called with str "+ str);
    }
       //default method is a method with a body in the interface
    public default void defaultMethodF(){
        System.out.println("default method is called ");
    }

}
