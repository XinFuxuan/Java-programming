package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new FreeWeight();
        // another benefit of abstraction that we can have one variable of type abstract class and object can be any sub class
        //This is called polymorphism
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 mins = "+ exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 mins = "+ running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println(" swimming 30 mins = "+  swimming.getCaloriesCount(30));

        }
}
