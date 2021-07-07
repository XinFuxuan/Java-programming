package day60_Exceptions;
import java.util.*;

public class FinallyBloc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            System.out.println("You entered " + num);
            //System.exit(0); // means stop java all together, finally block will not run
        }catch(InputMismatchException e){
                System.out.println("You entered Invalid value ");
            }finally{
            scan.close();
            System.out.println("Finally block - runs always ");
        }



    }
}
