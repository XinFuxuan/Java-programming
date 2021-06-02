package day49_static;

public class StaticTest {
    static String word = "java";
    public static void main(String[] args) {
        //rule 1) static method can be called using classname
        StaticMethods.displayMessage("wooden spoon");
        // instance method need an object to be called
        //StaticMethods.instanceMethod(); --> error,  in order to use we need to create object
        StaticMethods stm=new StaticMethods();
        stm.instanceMethod();


        //rule 2) static method can only access other static variable and methods
        System.out.println(word);

    }
}
