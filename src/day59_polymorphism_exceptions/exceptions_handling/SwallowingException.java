package day59_polymorphism_exceptions.exceptions_handling;

/**
 * Swallowing exception where try ans catch an error, we will ignore the error and continoue with the program
 */

public class SwallowingException {
    public static void main(String[] args) {
        try{
            System.out.println("hello");
            System.out.println(5/0); //error
        }catch(Exception ignore){}
        System.out.println("error is not reported, we just ingore it");
    }


}
