package day50_inheritance;

public class EBook extends Book {
    int size;
    int pages;

    public void readBook(){
        System.out.println("reading book: ");
        System.out.println("Title " + title);
        System.out.println("Author " + author);
        System.out.println("size " + size );
        System.out.println("page "+ pages );
    }



}
