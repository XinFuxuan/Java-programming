package day54_abstraction;

public class OnlineStudents extends Student {

    /**
     * OnlineStudent class will EXTEND Student abstract class
     * This class is considered to be concrete class.
     * It is responsible to implement all abstract methods (if any)
     */

    @Override
    public void attendClass(){

        /**
         * attendClass abstract method is implemented by the sub class
         * Sub class is overriding the abstract method of Parent class
         */
        System.out.println("Online student is attending the class using Zoom");
    }

}
