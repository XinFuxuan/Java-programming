package day60_Exceptions;

public class StringIndexIssue {
    public static void main(String[] args) {

            String word = "java";

            try {
            System.out.println("word" + word);
            System.out.println(word.charAt(10)); // <--- invalid index, code will run, but during run time exception happens
        } catch(Exception e ){
                System.out.println("exception happened and caught");
                System.out.println("reason = " + e.getMessage());
        }

            String word2="selenium";
            try {
                System.out.println("word2 = " + word2);
                System.out.println(word2.substring(0, 5));
                System.out.println(word2.substring(0, 15));
            }catch (StringIndexOutOfBoundsException e ){
                System.out.println("reason = " + e.getClass().getSimpleName());
                System.out.println("reason = " + e.getMessage());


            }

    }
}
