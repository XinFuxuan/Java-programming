package day57_abstraction_polymorphism.abstract_class_vs_interface;
/**both abstract class and interface are used to achieve abstraction in java
 *both abstract class and interface cannot creat object(instantiate)
 * abstract class can have abstract, non-abstract, and static methods
 * abstract can have all types of variables
 * abstract methods cannot be private, static, or final
 * abstract classes can have constructors same name as the className
 */
public abstract class AbstractA {

    int num1;                   // abstract classes can have instance variables, static variable with all access modifiers
    private double price;
    public static int count;
    public final String TYPE= "abstract ";
    public static final String LANGUAGE= "java";

    public AbstractA(){ // abstract can have constructors
        System.out.println("AbstractA is a constructor");

    }

    public abstract void absMethodA();
    public void methodB(){
        System.out.println("methodB called");
    }
    public static void staticMethodC(){
        System.out.println("staticMethodC is called");
    }

}
