package day48_constructors_static.StaticpackageExample;

public class Calculator {
    public static void add(int num1, int num2){ // static method
        System.out.println(num1+num2);
    }

    public void multiply(int num1, int num2){  // instance or object method
        System.out.println(num1*num2);
    }
}
