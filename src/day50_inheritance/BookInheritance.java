package day50_inheritance;

public class BookInheritance {
    public static void main(String[] args) {
        Book parentBook= new Book();
        parentBook.title="Intro to Java";
        parentBook.author="Savitch";
        parentBook.type="Programming";
        parentBook.price=85;
        System.out.println(parentBook.title+" - "+parentBook.author+" - "+parentBook.type);

        AudioBook aB1= new AudioBook();
        aB1.author= " Umesh ";
        aB1.length=60;
        aB1.narrator="Irina";
        aB1.price=44.99;
        aB1.listen();

        EBook eb1=new EBook();


    }
}
