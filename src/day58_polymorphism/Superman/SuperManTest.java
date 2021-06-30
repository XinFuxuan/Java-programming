package day58_polymorphism.Superman;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new Superman();
        spMan1.playWithKid();
        spMan1.feedKid();
        spMan1.raiseKid();
        //spMan1.work("SDET"); ---> error   spMan1.is father type can only access methods in father

        Worker spMan2 = new Superman();
        spMan2.work("SDET");
        System.out.println("got paid "+spMan2.getPaid());
    }
}
