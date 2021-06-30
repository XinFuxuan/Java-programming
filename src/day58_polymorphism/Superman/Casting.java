package day58_polymorphism.Superman;

public class Casting {
    public static void main(String[] args) {
        // variable of worker and object of superman

        Worker worker = new Superman();

        worker.work("QA manager");
        worker.getPaid();

        ((Father)worker).raiseKid(); // could be casting to father in order to use the method
        ((Superman)worker).playWithKid();// could be casting to superman in order to use the method


        // Down casting from worker to superman
        Superman superman = (Superman)worker;

    }
}
