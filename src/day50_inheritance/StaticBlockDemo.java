package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
    public static class Inner{
        // could variables and methods of inner static class
        // only inner class could be static
    }

    static int num;
    static List<String> models;
    static {
        System.out.println("static block"); // this code will run once time (only) when you call the name of this class
        num=10;
        models=new ArrayList<>();
        models.addAll(Arrays.asList("Toyota", "Nissan", "Honda", "Mazda", "BMW", "Benz", "Audi", "Lexus"));
    }

    { // initializer block -> run each time object created before the constructor

        System.out.println("initializer block");

    }

    public StaticBlockDemo(){
        System.out.println("constructor method ");
        num+=5;
    }

    public StaticBlockDemo(int value){
        System.out.println("overloded contructor value "+value);
        num+=value;
    }


}
