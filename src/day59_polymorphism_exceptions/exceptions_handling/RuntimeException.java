package day59_polymorphism_exceptions.exceptions_handling;

/**
 *  RUNTIME EXCEPTION happens in below code, code complies fine and suring execution it fails and throws ArithmeticException
 *  how to handle?
 *  1. try our best to fix it ot prevent any RUNTIME EXCEPTION
 *
 *  sometimes out of control, data is coming from external source
 *  we use "try... catch... in java"
 *
 */

public class RuntimeException {
    public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/0); // Arithmetic exceptions
        System.out.println(10/3);
    }
}
