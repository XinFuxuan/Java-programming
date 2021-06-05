package day50_inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public void listen(){
        System.out.println("listening book: ");
        System.out.println("Title " + title);
        System.out.println("Author " + author);
        System.out.println("length " + length );
        System.out.println("narrator "+ narrator );

    }
}
