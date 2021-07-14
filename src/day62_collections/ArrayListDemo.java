package day62_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer>nums = new ArrayList<>();
        List<String> cities = new ArrayList<>(); // polymorphism
        Collection<String> schools = new ArrayList<>(); // polymorphism

        cities.add("newYork");
        cities.add("Paris ");
        cities.add("Lodi");

        System.out.println(cities);
        System.out.println("First city "+cities.get(0));
        System.out.println("count of cities = "+cities.size());


    }
}
