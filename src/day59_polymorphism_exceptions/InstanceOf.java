package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shapes;
import day57_abstraction_polymorphism.shapes.Square;


public class InstanceOf {
    public static void main (String []args){
        // instance of operator

        Shapes shape = new Circle();
        // when using polymorphism -- how to find the data type of the object
        System.out.println(shape instanceof Circle);

        if(shape instanceof Circle){
            System.out.println("it is a circle object");
        }else if (shape instanceof Square){
            System.out.println("it is a square object");
        }

        /** shape -> what object type it is pointing to.
             1. use instanceof operator that returns boolean
                if(shape instance of Circle){
                    println("it is a circle)
         }else if{
              println("it is a square )
         *
         *
         * 2. java reflection api
         *    println (sh.getClass())
         */

        System.out.println(shape.getClass().getSimpleName()); // just class name of object
        System.out.println(shape.getClass().getName());// class name of object and package name

        if(shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is a square object ");
        }

        WebElement el = new Link();
        System.out.println("Object class name of el variable = " + el.getClass().getSimpleName());
        System.out.println(el.getClass().getDeclaredFields().getClass());



    }
}
