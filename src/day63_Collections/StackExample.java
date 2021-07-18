package day63_Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        //LIFO -- Last in first out
        Stack<String> books = new Stack();
        books.add("Harry potter");
        books.add("Leaders eat last");
        books.add("eat pray love ");
        books.add("how to do java for Dummies");
        System.out.println(books);

        System.out.println(books.remove(0));
        books.pop();
        System.out.println(books);
    }
}
