package day49_static;

public class StaticVariableTest {
    public static void main(String[] args) {
        System.out.println(StaticVariables.name); // could be access without creating an object
        System.out.println(StaticVariables.userName);
        System.out.println(StaticVariables.age);
        System.out.println(StaticVariables.price);
    }
}
