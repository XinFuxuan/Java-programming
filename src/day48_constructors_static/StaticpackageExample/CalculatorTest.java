package day48_constructors_static.StaticpackageExample;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5,3); // add is static method can be called using classname.StaticMethodName

        // non static method or instance method needs to create new object in order to be used
        Calculator calculatorObject = new Calculator ();
        calculatorObject.multiply(2,4);

        calculatorObject.add(10,30); // static method can also be called using an object.

    }
}
