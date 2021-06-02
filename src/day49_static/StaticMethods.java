package day49_static;

public class StaticMethods {

    int num=10; //instance variable
    static int count =5; // static variable with static keyword

    public static void displayMessage(String message){
        System.out.println("message: "+message);
        //System.out.println(num); num is the instance variable, cannot be using in a static method
        System.out.println(count ); //static variable could be used in a static method
    }

    public static void anotherStaticMethod(){
        System.out.println("another static method ");
        displayMessage("wooden spoon"); // static method could call on other static methods
    }
    // we need to create object stm.instanceMethod();
    public void instanceMethod(){
        System.out.println("instance method ");
        System.out.println(num);
        System.out.println(count);
        displayMessage("Hello from instance method");
    }

}
