package day61_exceptions_collections;

public class ErrorExamples {
    public static void main(String[] args) {
        //stack over float error
        myMethod();

    }

    static int counter = 0;

    public static void myMethod() {
        System.out.println(counter++);
        myMethod();

    }


}