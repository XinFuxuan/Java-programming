package day63_Collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // set is object we will be using wrapper calss

        set.add(1); // duplicated will be highlighted
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set); // will not allow duplicates, and no index

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collections");
        System.out.println(words);

        //if we want to remove from the set s
        for(String word : words){ // for each loop is wht we use to go through the set

        }
        //convert set to a list :
        List<String> wordsList = new ArrayList<>(words);

        //LinkedHashSet

        Set<String >LinkedHashSet = new LinkedHashSet<>();
        LinkedHashSet.add("23");
        LinkedHashSet.add("java");
        LinkedHashSet.add("%&");
        LinkedHashSet.add("apple");
        LinkedHashSet.add("cucumber");
        LinkedHashSet.add("apple");
        LinkedHashSet.add("23");
        System.out.println(LinkedHashSet); // no duplicated allow, insertion order will be maintained

        //TreeSet

        Set<String >treeSet = new TreeSet<>();
        treeSet.add("23");
        treeSet.add("java");
        treeSet.add("%&");
        treeSet.add("apple");
        treeSet.add("Cucumber");
        treeSet.add("apple");
        treeSet.add("23");

        System.out.println( treeSet); // no duplicated allowed, special charaters first, the upper case, the alphabetical

        ((TreeSet)treeSet).first();


    }
}

