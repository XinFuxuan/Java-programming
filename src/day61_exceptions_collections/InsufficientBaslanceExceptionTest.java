package day61_exceptions_collections;

public class InsufficientBaslanceExceptionTest {
    public static void main(String[] args) {
        double balance = 400.0;
        double itemPrice = 500.0;

        if(itemPrice>balance){
            throw new InsufficientBalanceException("Transaction declined not enough fund ");

        }else{
            System.out.println("Item successfully purchased ");
        }
    }
}
