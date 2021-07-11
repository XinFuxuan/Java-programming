package day61_exceptions_collections;

public class ElementaryStudentsTest {
    public static void main(String[] args) {
        ElementaryStudents el1 = new ElementaryStudents();
        try {
            el1.setName("bob");
            el1.setAge(7);
            System.out.println(el1.toString());
        }catch(Exception e){
            e.printStackTrace(); // print the error stacktrace and continue
        }

        System.out.println("execution complete");
    }

}
