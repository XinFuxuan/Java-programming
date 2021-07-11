package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 60;
        System.out.println("class is going on for "+minutes+"minutes");
        if(minutes >50){
           // throw new BreakTimeException();
            throw new BreakTimeException("It is break Time");
        }
        System.out.println("lets continue");
    }
}
